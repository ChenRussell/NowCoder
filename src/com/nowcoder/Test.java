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
	
	/**
	 * 包装类 128以内为true
	 */
	public static void testIntegerCompare(){
		Integer a = 128;
		Integer b = 128;
		System.out.println(a==b);
	}
	
	/**
	 * 测试引用传递
	 */
	class SimInt{
	    int value;
	    public SimInt(int value){
	        this.value=value;
	    }
	}
	
	public static void change1(SimInt si){
        si=new Test().new SimInt(3);//重新指向了新的对象，原对象不受影响
    }
    public static void change2(SimInt si){
        si.value=3;//通过引用操作对象内部成员，原对象被改变
    }
	
//    @Test
	public static void testPointer() {
		SimInt si1=new Test().new SimInt(1);
        System.out.println(si1.value);//输出1
        change1(si1);
        System.out.println(si1.value);//输出1
      change2(si1);
       System.out.println(si1.value);//输出3
	}
	
	/**
	 * 测试字符串值的比较
	 */
	public static void testString(){
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s2 == "ab"); // false
		System.err.println(s2 == "ab");
		System.out.println(s3 == "ab");	// true javac编译时可以对字符串常量直接相加的表达式进行优化,不必要等到运行时去进行加法运算处理,而是在编译时去掉其中的加号,直接将其编译成一个这些常量相连的结果
		String cr = "chenrui";	// 这种方式,java首先会在缓冲区查找是否有"chenrui"这个常量对象,有就直接将其地址赋值给cr,没有就创建一个"chenrui",然后将其赋值给cr
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
		//方法 一  
		long currentTimeMillis1 = System.currentTimeMillis();   
		//方法 二  
		long currentTimeMillis2 = Calendar.getInstance().getTimeInMillis();  
		//方法 三  
		long currentTimeMillis3 = new Date().getTime(); 
		System.out.println(currentTimeMillis1);
		System.out.println(currentTimeMillis2);
		System.out.println(currentTimeMillis3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testDoubleCompare();
//		System.out.println(Integer.parseInt("101",2));	//以二进制解析
//		testReplaceAll();
		
//		System.out.println(Math.pow(2, 23));
//		System.out.println(1<<23);
//		System.out.println(1.00==1.0);
//		System.out.println("提交到github");
//		System.out.println("a new message");
		
//		testIntegerCompare();
//		testString();
//		testMath();
//		testTimeString();
		testPointer();
	}

}
