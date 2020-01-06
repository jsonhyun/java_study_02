package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;

class Product {
	// 필드
	private String code;
	private String name;

	// 생성자
	public Product(String code, String name) {
		this.code = code;
		this.name = name;
	}
	// 메소드

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("(%s %s%n)", code, name);
	}


}

class Sale {
	// 필드
	private int no;
	private String code;
	private int price;
	private int saleCnt;
	private int marginRate;

	// 생성자
	public Sale(int no, String code, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.code = code;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	// 메소드
	public int getNo() {
		return no;
	}

	public String getCode() {
		return code;
	}

	public int getPrice() {
		return price;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public int getMarginRate() {
		return marginRate;
	}

	@Override
	public String toString() {
		return String.format("(%s %s %s %s %s%n)", no, code, price, saleCnt, marginRate);
	}

}

public class Exam {

	public static void main(String[] args) {
		// 아래의 문장을 이용하여 Product클래스와 Sale클래스를 정의하고
		// Product[] pdtArrs와 Sale[] saleArrs로 변경하시오.

		String[] productArr = { "A001,아메리카노", // code, name Product p = new Product(code, name)
				                "A002,카푸치노", 
				                "A003,헤이즐넛", 
				                "A004,에스프레소", 
				                "B001,딸기쉐이크", 
				                "B002,후르츠와인", 
				                "B003,팥빙수", 
				                "B004,아이스초코" };

		Product[] pdtArrs = convert_to_Product(productArr);
		System.out.println(Arrays.toString(pdtArrs));

		String[] saleArr = { "1,A001,4500,150,10", // no, code, price, saleCnt, marginRate
				             "2,A002,3800,140,15", 
				             "3,B001,5200,250,12", 
				             "4,B001,4300,110,11"};

		Sale[] saleArrs = convert_to_Sale(saleArr);
		System.out.println(Arrays.toString(saleArrs));
	}

	
	
	private static Sale[] convert_to_Sale(String[] saleArr) {
		Sale[] sales = new Sale[saleArr.length];
		for (int i = 0; i < saleArr.length; i++) {
			String[] sale0i = saleArr[i].split(",");

			int no = Integer.valueOf(sale0i[0]);
			String code = sale0i[1];
			int price = Integer.valueOf(sale0i[2]);
			int saleCnt = Integer.valueOf(sale0i[3]);
			int marginRate = Integer.valueOf(sale0i[4]);

			sales[i] = new Sale(no, code, price, saleCnt, marginRate);
//			for (int i = 0; i < saleArrs.length; i++) {
//			System.out.printf("%s %s %s %s %s %n", saleArrs[i].getNo(), saleArrs[i].getCode(), saleArrs[i].getPrice(),
//					saleArrs[i].getSaleCnt(), saleArrs[i].getMarginRate());
//			}
		}
		return sales;
	}

	private static Product[] convert_to_Product(String[] productArr) {
		Product[] pdt = new Product[productArr.length];
		for (int i = 0; i < productArr.length; i++) {
			String[] prod0i = productArr[i].split(",");

			Product p0i = new Product(prod0i[0], prod0i[1]);

			pdt[i] = new Product(p0i.getCode(), p0i.getName());
//			for (int i = 0; i < pdtArrs.length; i++) {
//				System.out.printf("%s %s %n", pdtArrs[i].getCode(), pdtArrs[i].getName());
//			}
		}
		return pdt;
	}
}