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
	 * ���� String��ķ���
	 * @param args
	 */
	public static void testString(String str) {
//		System.out.println(str.value.length);
	}
	
	/**
	 * ����С���ıȽ��ж�
	 * @param args
	 */
	public static void testDoubleCompare() {
		double a = 1.23;
		double b = 1.2300;
		System.out.println(a==b);
		System.out.println(0x1);
	}

	/**
	 * ���� �ַ�
	 * @param args
	 */
	public static void testChar() {
		char mode[] = new char[] {1 ,0 ,'X' ,9 ,8 ,7 ,6 ,5 ,4, 3 ,2};
		System.out.println(mode[0]=='1');
	}
	
	/**
	 * ���� String���replaceAll()����
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
//		System.out.println(Integer.parseInt("101",2));	//�Զ����ƽ���
//		testReplaceAll();
		System.out.println(Math.pow(2, 23));
		System.out.println(1<<23);
		System.out.println(1.00==1.0);
	}

}
