package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;

class Product00{
	//필드
	private String code;
	private String name;

	//생성자
	public Product00(String code, String name) {
		this.code = code;
		this.name = name;
	}
	//메소드

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	
	
}

class Sale00{
	//필드
	private int no;
	private String code;
	private int price;
	private int saleCnt;
	private int marginRate;
	
	//생성자
	public Sale00(int no, String code, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.code = code;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	//메소드
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
	
	
}

public class Exam00 {

	public static void main(String[] args) {
//		String std01 = "1,이상원,90,90,90";
//		String[] std01Arr = std01.split(",");
//		
//		Student std = new Student(
//				Integer.parseInt(std01Arr[0]), 
//				std01Arr[1], 
//				Integer.parseInt(std01Arr[2]), 
//				Integer.parseInt(std01Arr[3]), 
//				Integer.parseInt(std01Arr[4]));
//		
//		System.out.println(std);
		
//		StringTokenizer st = new StringTokenizer(std01, ",");
		
		
		
		exam01();
		
	}

	private static void exam01() {
		//아래의 문장을 이용하여 Product클래스와 Sale클래스를 정의하고 
		//Product[] pdtArrs와 Sale[] saleArrs로 변경하시오.
		
		String[] productArr = {
				"A001,아메리카노", //code, name Product p = new Product(code, name)
				"A002,카푸치노", 
				"A003,헤이즐넛",
				"A004,에스프레소",
				"B001,딸기쉐이크",
				"B002,후르츠와인",
				"B003,팥빙수", 
				"B004,아이스초코"};
		
		for(int i=0; i<productArr.length;i++) {
			String[] prod0i = productArr[i].split(",");
			Product00 p0i = new Product00(prod0i [0], prod0i [1]);
			System.out.printf("%s %s %n",p0i.getCode(), p0i.getName());
		}
		
		Product00[] pdtArrs = convert_to_Product(productArr);
		System.out.println(Arrays.toString(pdtArrs));
		
		String[] saleArr = {
				"1,A001,4500,150,10", //no, code, price, saleCnt, marginRate
				"2,A002,3800,140,15", 
				"3,B001,5200,250,12", 
				"4,B001,4300,110,11",
				};
		
		for(int i = 0; i<saleArr.length; i++) {
			String[] sale0i = saleArr[i].split(",");
			int no = Integer.valueOf(sale0i[0]);
			String code = sale0i[1];
			int price = Integer.valueOf(sale0i[2]);
			int saleCnt = Integer.valueOf(sale0i[3]);
			int marginRate = Integer.valueOf(sale0i[4]);
			
			Sale00 sales0i = new Sale00(no, code, price, saleCnt, marginRate); 
			System.out.printf("%s %s %s %s %s %n",sales0i.getNo(),sales0i.getCode(),sales0i.getPrice(),sales0i.getSaleCnt(),sales0i.getMarginRate());
		}

		Sale00[] saleArrs = convert_to_Sale(saleArr);
	}

	private static Sale00[] convert_to_Sale(String[] saleArr) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Product00[] convert_to_Product(String[] productArr) {
		Product00[] pdt = new Product00[productArr.length];
		for(int i=0;i<productArr.length;i++) {
			
		}
		return pdt;
	}

}
