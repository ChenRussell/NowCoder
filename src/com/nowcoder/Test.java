package com.nowcoder;

public class Test {
	
	/**
	 * test
	 */
	public static void test() {
		char c = '1';
		System.out.println((int)c);

		String str = "-03";
		int i = Integer.parseInt(str);
		System.out.println(i);
		System.out.println(Math.pow(10, i));
		String str2 = "1.23400";
		double j = Double.parseDouble(str2);
		System.out.println(j*Math.pow(10, i));
		
		String str3 = "1.59";
//		System.out.println(Integer.parseInt(str3));
		System.out.println(Math.round(Double.parseDouble(str3)));
	}
	/**
	 * 测试 String类的方法
	 * @param args
	 */
	public static void testString(String str) {
//		System.out.println(str.value.length);
	}
	
	/**
	 * 测试小数的比较判断
	 * @param args
	 */
	public static void testDoubleCompare() {
		double a = 1.23;
		double b = 1.2300;
		System.out.println(a==b);
		System.out.println(0x1);
	}

	/**
	 * 测试 字符
	 * @param args
	 */
	public static void testChar() {
		char mode[] = new char[] {1 ,0 ,'X' ,9 ,8 ,7 ,6 ,5 ,4, 3 ,2};
		System.out.println(mode[0]=='1');
	}
	
	/**
	 * 测试 String类的replaceAll()方法
	 * @param args
	 */
	public static void testReplaceAll() {
		String a = "chenruichenrui";
		a = a.replaceAll("c", "");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testDoubleCompare();
//		System.out.println(Integer.parseInt("101",2));	//以二进制解析
//		testReplaceAll();
		System.out.println(Math.pow(2, 23));
		System.out.println(1<<23);
		System.out.println(1.00==1.0);
	}

}
