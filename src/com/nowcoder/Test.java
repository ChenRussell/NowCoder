package com.nowcoder;

import java.util.Calendar;
import java.util.Date;

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
	
	/**
	 * ��װ�� 128����Ϊtrue
	 */
	public static void testIntegerCompare(){
		Integer a = 128;
		Integer b = 128;
		System.out.println(a==b);
	}
	
	/**
	 * �������ô���
	 */
	class SimInt{
	    int value;
	    public SimInt(int value){
	        this.value=value;
	    }
	}
	
	public static void change1(SimInt si){
        si=new Test().new SimInt(3);//����ָ�����µĶ���ԭ������Ӱ��
    }
    public static void change2(SimInt si){
        si.value=3;//ͨ�����ò��������ڲ���Ա��ԭ���󱻸ı�
    }
	
//    @Test
	public static void testPointer() {
		SimInt si1=new Test().new SimInt(1);
        System.out.println(si1.value);//���1
        change1(si1);
        System.out.println(si1.value);//���1
      change2(si1);
       System.out.println(si1.value);//���3
	}
	
	/**
	 * �����ַ���ֵ�ıȽ�
	 */
	public static void testString(){
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s2 == "ab"); // false
		System.err.println(s2 == "ab");
		System.out.println(s3 == "ab");	// true javac����ʱ���Զ��ַ�������ֱ����ӵı��ʽ�����Ż�,����Ҫ�ȵ�����ʱȥ���мӷ����㴦��,�����ڱ���ʱȥ�����еļӺ�,ֱ�ӽ�������һ����Щ���������Ľ��
		String cr = "chenrui";	// ���ַ�ʽ,java���Ȼ��ڻ����������Ƿ���"chenrui"�����������,�о�ֱ�ӽ����ַ��ֵ��cr,û�оʹ���һ��"chenrui",Ȼ���丳ֵ��cr
		String cr2 = "chenrui";	//
		System.out.println(cr == "chenrui");	// true
		System.out.println(cr == cr2);			// true
		System.out.println(new String("cr") == new String("cr"));	// false
	}
	
	public static void testMath() {
		double d1 = -0.5;
		System.out.println("Ceil d1="+Math.ceil(d1));
		System.out.println("floor d1="+Math.floor(d1));
		System.out.println(Math.ceil(0.5));
		System.out.println(Math.floor(0.5));
		System.out.println(Math.round(0.5));
	}
	
	public static void testTimeString() {
		//���� һ  
		long currentTimeMillis1 = System.currentTimeMillis();   
		//���� ��  
		long currentTimeMillis2 = Calendar.getInstance().getTimeInMillis();  
		//���� ��  
		long currentTimeMillis3 = new Date().getTime(); 
		System.out.println(currentTimeMillis1);
		System.out.println(currentTimeMillis2);
		System.out.println(currentTimeMillis3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testDoubleCompare();
//		System.out.println(Integer.parseInt("101",2));	//�Զ����ƽ���
//		testReplaceAll();
		
//		System.out.println(Math.pow(2, 23));
//		System.out.println(1<<23);
//		System.out.println(1.00==1.0);
//		System.out.println("�ύ��github");
//		System.out.println("a new message");
		
//		testIntegerCompare();
//		testString();
//		testMath();
//		testTimeString();
		testPointer();
	}

}
