package com.nowcoder.testClass;

public class SubClass extends SuperClass {
	
	public void getSuperInfo() {
		System.out.println(this.a);
	}
	
	public static void printInfo() {
		System.out.println("this is a static function!");
	}
}
