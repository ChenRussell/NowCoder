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
     * ���� String��ķ���
     *
     * @param args
     */
    public static void testString(String str) {
        // System.out.println(str.value.length);
    }

    /**
     * ����С���ıȽ��ж�
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
     * ���� �ַ�
     *
     * @param args
     */
    @Test
    public void testChar() {
        char mode[] = new char[]{1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println(mode[0] == '1'); // false
        System.out.println(mode[0]);    // ����1��Ӧ���ַ�Ϊ
    }

    /**
     * ���� String���replaceAll()����
     *
     * @param args
     */
    public static void testReplaceAll() {
        String a = "chenruichenrui";
        a = a.replaceAll("c", "");
        System.out.println(a);
    }

    /**
     * ��װ�� 128����Ϊtrue Integer a = 100 �����ڲ����������ģ� Integer i = Integer.valueOf(100);
     * �Զ�װ�� ��valueOf�����ڲ���ȥȡ���棨Ĭ�Ϸ�Χ [-128, 127]�� �����ᴴ���¶��� (��Ԫģʽ,-128��127)
     */
    @Test
    public void testIntegerCompare() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true, �����128����false
        Integer c = new Integer(127);
        Integer d = new Integer(127);
        System.out.println(c == d); // false

        // �Զ����������
        int i = 127;
        System.out.println(c == i); // true ��Ϊ i Ϊ��������,c���Զ�����,����ֵ�Ƚ�,����true
        System.out.println(new Double(127.0) == i);   // true, �Զ�����??
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
        System.out.println(c == (a + b));   // true ,"==" ��������������Զ�����
        System.out.println(c.equals(a + b));// true
        System.out.println(g == (a + b));   // true ,�������������Զ�����
        System.out.println(g.equals(a + b));// false
    }

    /**
     * �������ô���,�����൱��һ��ָ��
     */
    class SimInt {
        int value;

        public SimInt(int value) {
            this.value = value;
        }
    }

    public static void change1(SimInt si) {
        si = new TestDemo().new SimInt(3);// ����ָ�����µĶ���ԭ������Ӱ��
    }

    public static void change2(SimInt si) {
        si.value = 3;// ͨ�����ò��������ڲ���Ա��ԭ���󱻸ı�
    }

    // @Test
    public static void testPointer() {
        SimInt si1 = new TestDemo().new SimInt(1);
        System.out.println(si1.value);// ���1
        change1(si1);
        System.out.println(si1.value);// ���1
        change2(si1);
        System.out.println(si1.value);// ���3
    }

    /**
     * �����ַ���ֵ�ıȽ�
     */
    @Test
    public void testString() {
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 == "ab"); // false
        System.err.println(s2 == "ab"); // ��ӡ��ֵΪ��ɫ
        System.out.println(s3 == "ab"); // true
        // javac����ʱ���Զ��ַ�������ֱ����ӵı��ʽ�����Ż�,����Ҫ�ȵ�����ʱȥ���мӷ����㴦��,�����ڱ���ʱȥ�����еļӺ�,ֱ�ӽ�������һ����Щ���������Ľ��
        String cr = "chenrui"; // ���ַ�ʽ,java���Ȼ��ڻ����������Ƿ���"chenrui"�����������,�о�ֱ�ӽ����ַ��ֵ��cr,û�оʹ���һ��"chenrui",Ȼ���丳ֵ��cr
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
     * ����ʱ���
     */
    public static void testTimeString() {
        // ���� һ
        long currentTimeMillis1 = System.currentTimeMillis();
        // ���� ��
        long currentTimeMillis2 = Calendar.getInstance().getTimeInMillis();
        // ���� ��
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
        // System.out.println(a == b); ��ͬ���͵�������Ƚ�,���뱨��
        System.out.println(a.equals(b)); // false,��ͬ����,����false
        System.out.println(a.equals(c)); // false
    }

    @Test
    public void testProtected() {
        SubClass sc = new SubClass();
        // System.out.println(sc.a); // �����protected��Ա,ֻ���������ͬһ�����ڱ�����,�����ǲ��ɼ���invisible
        sc.getSuperInfo();
    }

    /**
     * finallyһ������try
     * catch�е�return֮ǰִ��,�������finallyʹ����return����throw���,����ʹtrycatch�е�return����throwʧЧ
     * finally�е�return���Ḳ��try-catch�е�return���
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
     * �����ַ���������
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
     * ����������ʽ 1.ʲô��������ʽ��̰�����̰��ƥ�� �磺String str="abcaxc"; Patter p="ab.*c";
     * ̰��ƥ��:������ʽһ����������󳤶�ƥ�䣬Ҳ������ν��̰��ƥ�䡣������ʹ��ģʽpƥ���ַ���str���������ƥ�䵽��abcaxc(ab.*c)��
     * ��̰��ƥ�䣺����ƥ�䵽����ͺã����ٵ�ƥ���ַ���������ʹ��ģʽpƥ���ַ���str���������ƥ�䵽��abc(ab.*c)�� 2.����������������ģʽ
     * Ĭ����̰��ģʽ�������ʺ���ֱ�Ӽ���һ���ʺţ����Ƿ�̰��ģʽ�� ���ʣ�{m,n}��m��n�� �������� +��һ������� ����0��һ��
     * �������Բ����Ĳ��ͣ�Ȼ�������Ŀ .��ʾ��\n֮��������ַ� ��ʾƥ��0-���� +��ʾƥ��1-���� (?=Expression)
     * ˳���ӣ�(?=\\()����ƥ�������� ����ģʽ���� src=".*? (?=\\()�� " �����������
     * ��Ϊƥ�䵽��һ��"�ͽ�����һ��ƥ�䡣����������ƥ�䡣��Ϊ�������
     */
    @Test
    public void testRegularExp() {
        String str = "������(������)(������)(������)";

        String patStr = ".*?(?=\\()"; // (?=Expression) ˳���ӣ�(?=\\()����ƥ��������; �����ʺ���ֱ�Ӽ���һ���ʺţ����Ƿ�̰��ģʽ��

        Pattern pattern = Pattern.compile(patStr);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    public void testRegularExp2() {
        String text = "(content:\"rcpt to root\";pcre:\"word\";)";
        String rule1 = "content:\".+\""; // ̰��ģʽ
        String rule2 = "content:\".+?\""; // ��̰��ģʽ

        System.out.println("�ı���" + text);
        System.out.println("̰��ģʽ��" + rule1);
        Pattern p1 = Pattern.compile(rule1);
        Matcher m1 = p1.matcher(text);
        while (m1.find()) {
            System.out.println("ƥ������" + m1.group(0));
        }

        System.out.println("��̰��ģʽ��" + rule2);
        Pattern p2 = Pattern.compile(rule2);
        Matcher m2 = p2.matcher(text);
        while (m2.find()) {
            System.out.println("ƥ������" + m2.group(0));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testException() {
        String str = null;
        System.out.println(str.length());
        System.out.println("���Ե�Ԫ���Ե�expected");
    }

    @Test
    public void testAltInsert() throws Exception {
        System.out.println("idea ��ݼ������Ͱ�!");
    }

    /**
     * �����ַ�������ĳ�ʼ��
     * @throws Exception
     */
    @Test
    public void testStringArray() throws Exception {
        String[] arr = new String[10];
        System.out.println(arr[0]); // null
        System.out.println(arr.length); // 10
    }

    /**
     * ����ArrayList
     * ��ָ��ArrayList���ͣ��������ݣ��ٴ�ȡ��ʱ��Ĭ����Object���ͣ�
     * �������Ĺؼ���instanceof�ؼ��֣�instanceofִ��ʱ��������java������ƣ�ʶ�������Ϣ��
     * @throws Exception
     */
    @Test
    public void testList() throws Exception {
        List list1 = new ArrayList();
        list1.add(0);
        list1.add('c');
        List list2 = list1;
        System.out.println(list1 == list2); // true
        Object o = list1.get(0);    // �õ�����Object����
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
     * ��̬���������������,���ᱨ��ָ���쳣
     * @throws Exception
     */
    @Test
    public void testStaticMethod() throws Exception {
        TestDemo t = null;
        t.hello();  // ���ᱨ��
    }

    /**
     * ����ģ��
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
            System.out.println("E");    // �����쳣
        }
    }

    public void throwException(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();   // ���쳣,��������ִ��
                } else {
                    System.out.println(i);
                }
            }finally {
                System.out.println("e");
            }
        }
    }

    public void changeArgs(Integer... a) {    // a��һ������
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    /**
     * ���Ա䳤����,--->�﷨��,�ڱ䳤��������֮ǰ,����Ա����ʹ��������������ƹ��ܵ�
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
        // System.out.println(Integer.parseInt("101",2)); //�Զ����ƽ���
        // testReplaceAll();

        // System.out.println(Math.pow(2, 23));
        // System.out.println(1<<23);
        // System.out.println(1.00==1.0);
        // System.out.println("�ύ��github");
        // System.out.println("a new message");

        // testIntegerCompare();
        // testString();
        // testMath();
        // testTimeString();
        testPointer();
    }

}
