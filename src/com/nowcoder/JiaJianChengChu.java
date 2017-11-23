/**
 * 有理数四则运算(20)
时间限制 1000 ms 内存限制 32768 KB 代码长度限制 100 KB 判断程序 Standard (来自 小小)
题目描述
本题要求编写程序，计算2个有理数的和、差、积、商。

输入描述:
输入在一行中按照“a1/b1 a2/b2”的格式给出两个分数形式的有理数，其中分子和分母全是整型范围内的整数，负号只可能出现在分子前，分

母不为0。


输出描述:
分别在4行中按照“有理数1 运算符 有理数2 = 结果”的格式顺序输出2个有理数的和、差、积、商。注意输出的每个有理数必须是该有理数的

最简形式“k a/b”，其中k是整数部分，a/b是最简分数部分；若为负数，则须加括号；若除法分母为0，则输出“Inf”。题目保证正确的输出中

没有超过整型范围的整数。

输入例子:
5/3 0/6

输出例子:
1 2/3 + 0 = 1 2/3

1 2/3 - 0 = 1 2/3

1 2/3 * 0 = 0

1 2/3 / 0 = Inf
 */
package com.nowcoder;

import java.util.Scanner;

public class JiaJianChengChu {

	//将字符串转化
	public static String fuck(String str) {
		String[] sp = str.split("/");
		if(sp[0].equals("0")) return "0";
		if(sp[0].compareTo(sp[1])<0) return str;
		else if(sp[0].compareTo(sp[1])==0) return "1";
		else return Integer.parseInt(sp[0])/Integer.parseInt(sp[1])+" "+(Integer.parseInt(sp[0])-Integer.parseInt(sp[1]))+"/"+sp[1];
	}
	public static void main(String[] args) {
		System.out.println(fuck("5/3"));
		Scanner sc = new Scanner(System.in);
		
	}
}
