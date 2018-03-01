package com.nowcoder;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.nowcoder.testClass.SubClass;
import org.omg.PortableInterceptor.INACTIVE;

public class TestDemo {

    /**
     * test
     */
    public static void test() {
        char c = '1';
        System.out.println((int) c);

        String str = "-03";
        int i = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(Math.pow(10, i));
        String str2 = "1.23400";
        double j = Double.parseDouble(str2);
        System.out.println(j * Math.pow(10, i));

        String str3 = "1.59";
        // System.out.println(Integer.parseInt(str3));
        System.out.println(Math.round(Double.parseDouble(str3)));
    }

    /**
     * 测试 String类的方法
     *
     * @param args
     */
    public static void testString(String str) {
        // System.out.println(str.value.length);
    }

    /**
     * 测试小数的比较判断
     *
     * @param args
     */
    @Test
    public void testDoubleCompare() {
        double a = 1.23;
        double b = 1.2300;
        System.out.println(a == b); // true
        System.out.println(0x1);    // 1
    }

    /**
     * 测试 字符
     *
     * @param args
     */
    @Test
    public void testChar() {
        char mode[] = new char[]{1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println(mode[0] == '1'); // false
        System.out.println(mode[0]);    // 数字1对应的字符为
    }

    /**
     * 测试 String类的replaceAll()方法
     *
     * @param args
     */
    public static void testReplaceAll() {
        String a = "chenruichenrui";
        a = a.replaceAll("c", "");
        System.out.println(a);
    }

    /**
     * 包装类 128以内为true Integer a = 100 它的内部就是这样的： Integer i = Integer.valueOf(100);
     * 自动装箱 而valueOf方法内部会去取缓存（默认范围 [-128, 127]） ，不会创建新对象。 (享元模式,-128到127)
     */
    @Test
    public void testIntegerCompare() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true, 如果是128则是false
        Integer c = new Integer(127);
        Integer d = new Integer(127);
        System.out.println(c == d); // false

        // 自动拆箱的例子
        int i = 127;
        System.out.println(c == i); // true 因为 i 为基本类型,c会自动拆箱,进行值比较,返回true
        System.out.println(new Double(127.0) == i);   // true, 自动拆箱??
    }

    @Test
    public void testIntegerCompare2() throws Exception {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Float g = 3.0f;
        System.out.println(c == d); // true
        System.out.println(e == f); // false
        System.out.println(c == (a + b));   // true ,"==" 遇到算术运算会自动拆箱
        System.out.println(c.equals(a + b));// true
        System.out.println(g == (a + b));   // true ,遇到算术运算自动拆箱
        System.out.println(g.equals(a + b));// false
    }

    /**
     * 测试引用传递,引用相当于一个指针
     */
    class SimInt {
        int value;

        public SimInt(int value) {
            this.value = value;
        }
    }

    public static void change1(SimInt si) {
        si = new TestDemo().new SimInt(3);// 重新指向了新的对象，原对象不受影响
    }

    public static void change2(SimInt si) {
        si.value = 3;// 通过引用操作对象内部成员，原对象被改变
    }

    // @Test
    public static void testPointer() {
        SimInt si1 = new TestDemo().new SimInt(1);
        System.out.println(si1.value);// 输出1
        change1(si1);
        System.out.println(si1.value);// 输出1
        change2(si1);
        System.out.println(si1.value);// 输出3
    }

    /**
     * 测试字符串值的比较
     */
    @Test
    public void testString() {
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 == "ab"); // false
        System.err.println(s2 == "ab"); // 打印的值为红色
        System.out.println(s3 == "ab"); // true
        // javac编译时可以对字符串常量直接相加的表达式进行优化,不必要等到运行时去进行加法运算处理,而是在编译时去掉其中的加号,直接将其编译成一个这些常量相连的结果
        String cr = "chenrui"; // 这种方式,java首先会在缓冲区查找是否有"chenrui"这个常量对象,有就直接将其地址赋值给cr,没有就创建一个"chenrui",然后将其赋值给cr
        String cr2 = "chenrui"; //
        System.out.println(cr == "chenrui"); // true
        System.out.println(cr == cr2); // true
        System.out.println(new String("cr") == new String("cr")); // false
    }

    public static void testMath() {
        double d1 = -0.5;
        System.out.println("Ceil d1=" + Math.ceil(d1));
        System.out.println("floor d1=" + Math.floor(d1));
        System.out.println(Math.ceil(0.5));
        System.out.println(Math.floor(0.5));
        System.out.println(Math.round(0.5));
    }

    /**
     * 测试时间戳
     */
    public static void testTimeString() {
        // 方法 一
        long currentTimeMillis1 = System.currentTimeMillis();
        // 方法 二
        long currentTimeMillis2 = Calendar.getInstance().getTimeInMillis();
        // 方法 三
        long currentTimeMillis3 = new Date().getTime();
        System.out.println(currentTimeMillis1);
        System.out.println(currentTimeMillis2);
        System.out.println(currentTimeMillis3);
    }

    @Test
    public void testEqual() {
        Integer a = 2;
        Long b = 2L;
        Double c = 2.0;
        // System.out.println(a == b); 不同类型的引用相比较,编译报错
        System.out.println(a.equals(b)); // false,不同类型,返回false
        System.out.println(a.equals(c)); // false
    }

    @Test
    public void testProtected() {
        SubClass sc = new SubClass();
        // System.out.println(sc.a); // 父类的protected成员,只能在子类或同一个包内被访问,否则是不可见的invisible
        sc.getSuperInfo();
    }

    /**
     * finally一定会在try
     * catch中的return之前执行,但是如果finally使用了return或者throw语句,将会使trycatch中的return或者throw失效
     * finally中的return语句会覆盖try-catch中的return语句
     *
     * @param num
     * @return
     */
    public int getNumber(int num) {
        try {
            int result = 2 / num;
            return result;
        } catch (Exception e) {
            // TODO: handle exception
            return 0;
        } finally {
            if (num == 0)
                return -1;
            if (num == 1)
                return 1;
        }
    }

    @Test
    public void printNumber() {
        System.out.println(getNumber(0));
        System.out.println(getNumber(1));
        System.out.println(getNumber(2));
        System.out.println(getNumber(3));
    }

    /**
     * 测试字符串的连接
     */
    @Test
    public void testStringConnection() {
        String str = "hello world";
        str = str + 100;
        System.out.println(str);
        if (true) {
        }
    }

    /**
     * 测试正则表达式 1.什么是正则表达式的贪婪与非贪婪匹配 如：String str="abcaxc"; Patter p="ab.*c";
     * 贪婪匹配:正则表达式一般趋向于最大长度匹配，也就是所谓的贪婪匹配。如上面使用模式p匹配字符串str，结果就是匹配到：abcaxc(ab.*c)。
     * 非贪婪匹配：就是匹配到结果就好，就少的匹配字符。如上面使用模式p匹配字符串str，结果就是匹配到：abc(ab.*c)。 2.编程中如何区分两种模式
     * 默认是贪婪模式；在量词后面直接加上一个问号？就是非贪婪模式。 量词：{m,n}：m到n个 ：任意多个 +：一个到多个 ？：0或一个
     * 以上来自博主的博客，然后这道题目 .表示除\n之外的任意字符 表示匹配0-无穷 +表示匹配1-无穷 (?=Expression)
     * 顺序环视，(?=\\()就是匹配正括号 懒惰模式正则： src=".*? (?=\\()） " 结果：北京市
     * 因为匹配到第一个"就结束了一次匹配。不会继续向后匹配。因为他懒惰嘛。
     */
    @Test
    public void testRegularExp() {
        String str = "北京市(海淀区)(朝阳区)(西城区)";

        String patStr = ".*?(?=\\()"; // (?=Expression) 顺序环视，(?=\\()就是匹配正括号; 在量词后面直接加上一个问号？就是非贪婪模式。

        Pattern pattern = Pattern.compile(patStr);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    public void testRegularExp2() {
        String text = "(content:\"rcpt to root\";pcre:\"word\";)";
        String rule1 = "content:\".+\""; // 贪婪模式
        String rule2 = "content:\".+?\""; // 非贪婪模式

        System.out.println("文本：" + text);
        System.out.println("贪婪模式：" + rule1);
        Pattern p1 = Pattern.compile(rule1);
        Matcher m1 = p1.matcher(text);
        while (m1.find()) {
            System.out.println("匹配结果：" + m1.group(0));
        }

        System.out.println("非贪婪模式：" + rule2);
        Pattern p2 = Pattern.compile(rule2);
        Matcher m2 = p2.matcher(text);
        while (m2.find()) {
            System.out.println("匹配结果：" + m2.group(0));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testException() {
        String str = null;
        System.out.println(str.length());
        System.out.println("测试单元测试的expected");
    }

    @Test
    public void testAltInsert() throws Exception {
        System.out.println("idea 快捷键是真猛啊!");
    }

    /**
     * 测试字符串数组的初始化
     * @throws Exception
     */
    @Test
    public void testStringArray() throws Exception {
        String[] arr = new String[10];
        System.out.println(arr[0]); // null
        System.out.println(arr.length); // 10
    }

    /**
     * 测试ArrayList
     * 不指定ArrayList类型，存入数据，再次取出时，默认是Object类型；
     * 但这个题的关键是instanceof关键字，instanceof执行时类似利用java反射机制，识别对象信息。
     * @throws Exception
     */
    @Test
    public void testList() throws Exception {
        List list1 = new ArrayList();
        list1.add(0);
        list1.add('c');
        List list2 = list1;
        System.out.println(list1 == list2); // true
        Object o = list1.get(0);    // 得到的是Object类型
        System.out.println(o instanceof Integer);
        System.out.println(list1.get(0) instanceof Integer);    // true
        System.out.println(list2.get(0) instanceof Integer);    // true
        System.out.println(list2.get(1) instanceof Character);  // true
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testJVMMemory() throws Exception {
        int i = 0;
        i = i++;
        System.out.println(i);  // 0
    }

    public static void hello() {
        System.out.println("hello");
    }

    /**
     * 静态方法不依赖与对象,不会报空指针异常
     * @throws Exception
     */
    @Test
    public void testStaticMethod() throws Exception {
        TestDemo t = null;
        t.hello();  // 不会报错
    }

    /**
     * 测试模数
     *
     * @throws Exception
     */
    @Test
    public void testMode() throws Exception {
        System.out.println(100%3);  // 1
        System.out.println(100%3.0);// 1.0
        System.out.println(7.0%3);  // 1.0
    }

    @Test
    public void testThrowException() throws Exception {
        try {
            throwException(new int[]{0, 1, 2, 3, 4, 5});
        } catch (Exception e){
            System.out.println("E");    // 捕获异常
        }
    }

    public void throwException(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();   // 抛异常,方法结束执行
                } else {
                    System.out.println(i);
                }
            }finally {
                System.out.println("e");
            }
        }
    }

    public void changeArgs(Integer... a) {    // a是一个数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    /**
     * 测试变长参数,--->语法糖,在变长参数出现之前,程序员就是使用数组来完成类似功能的
     * @throws Exception
     */
    @Test
    public void testChangeArgs() throws Exception {
        changeArgs(1);
        changeArgs(2,3);
        changeArgs(2,3,4,5,6);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // testDoubleCompare();
        // System.out.println(Integer.parseInt("101",2)); //以二进制解析
        // testReplaceAll();

        // System.out.println(Math.pow(2, 23));
        // System.out.println(1<<23);
        // System.out.println(1.00==1.0);
        // System.out.println("提交到github");
        // System.out.println("a new message");

        // testIntegerCompare();
        // testString();
        // testMath();
        // testTimeString();
        testPointer();
    }

}
