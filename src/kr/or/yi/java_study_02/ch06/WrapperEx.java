package kr.or.yi.java_study_02.ch06;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = 31; //autoboxing 기본타입 -> 객체화
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");
		
		System.out.printf("%d %d %d %d %n",i, i2, i3, i4);
		
		System.out.println(Integer.bitCount(31));//bitCount : 31을 이진수로 변환 후 1의 갯수 출력
		System.out.println(i.toHexString(31)); //16진수변환
		System.out.println(i.toBinaryString(31)); //2진수변환
		System.out.println(i.toOctalString(31)); //8진수변환
		
		System.out.println("============================");
		System.out.println(i2.floatValue());
		System.out.println(i2.doubleValue());
		
		
		String str = i2.toString();
		System.out.println(str);
	}

}
