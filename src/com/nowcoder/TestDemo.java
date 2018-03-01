package com.nowcoder;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.nowcoder.testClass.SubClass;

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
    public static void testDoubleCompare() {
        double a = 1.23;
        double b = 1.2300;
        System.out.println(a == b);
        System.out.println(0x1);
    }

    /**
     * ���� �ַ�
     *
     * @param args
     */
    public static void testChar() {
        char mode[] = new char[]{1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println(mode[0] == '1');
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
    public static void testString() {
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 == "ab"); // false
        System.err.println(s2 == "ab");
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

        long i = 0xfffL;
        double x = 0.9239f;
        System.out.println(i);
        System.out.println(x);
        ThreadLocal threadLocal = new ThreadLocal();

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

    @Test(expected = NullPointerException.class)
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

    @Test
    public void testSomething() throws Exception {
        HashMap hashMap = new HashMap();
        int i = 0;
        int j = 0;
        String[] strings = {"������", "����", "��ԲԲ", "AngelaBaby"};
        while (true) {
            i++;
            j++;
            if (j == strings.length) j = 0;
            System.out.println(strings[j] + ", i wanna fuck you " + i + " times, suck my dick��");
            Thread.sleep(500);
            if (i == 100) break;
        }
    }

    @Test
    public void testHashCode() throws Exception {
        TestDemo testDemo = new TestDemo();
        TestDemo testDemo2 = new TestDemo();
        TestDemo testDemo3 = testDemo;
        new Object();
        System.out.println(testDemo.hashCode());
        System.out.println(testDemo2.hashCode());
        System.out.println(testDemo3.hashCode());
        int a = 4, b = 6;    // 100 110
        int i = a ^ b;  // ���
        System.out.println(i);
    }

    static int f = 3;
    @Test
    public void testAssignment() throws Exception {
        long t = 012;   // �˽���
        float f = -412;
        double d = 0x12345678;
//        byte b = 128;     // byte�ķ�ΧΪ-128-127
        System.out.println(d);
        System.out.println(t);
        System.out.println(this.f); 
    }

    @Test
    public void testLambda() throws Exception {

        File file = new File("C:/Users\\hasee\\Downloads");
        /**
         * java8 lambda���ʽ
         */
        File[] files = file.listFiles((File f) -> f.getName().endsWith(".3gp"));
        /**
         * ԭʼд��
         */
        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".3gp");
            }
        });
        for (File fi :
                files1) {
            System.out.println(fi.getName());
        }

        System.out.println("---------------�ָ���-------------------");
        for (File fi : files) {
            System.out.println(fi.getName());
        }

        System.out.println("-----------------�ָ���-----------------");
        File[] files2 = file.listFiles(f -> f.getName().endsWith(".3gp"));
        for (File fi :
                files2) {
            System.out.println(fi.getName());
        }
    }

    /**
     * ʹ��lambda���ʽ��������ڲ���
     * <p>
     * �ܽ᣺�������﷨��ʽ���Կ�����Lambda���ʽ����Ҫ���þ��Ǵ��������ڲ���ķ����﷨��������������ɡ�
     * 1.�β��б��β��б�����ʡ���β����͡�����β��б����ֻ��һ�������������������б��Բ����Ҳ����ʡ�ԡ�
     * 2.��ͷ(->).����ͨ��Ӣ�Ļ��ߺźʹ��ڷ�����ɡ�
     * 3.����顣��������ֻ����һ����䣬Lambda���ʽ����ʡ�Դ����Ļ����ţ���ô�������Ͳ�Ҫ�û����ű�ʾ��������
     * lambda�����ֻ��һ��return��䣬��������ʡ��return�ؼ��֡�
     *
     * @throws Exception
     */
    @Test
    public void testLambda2() throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is original way!");
            }
        }).start();
        new Thread(() -> System.out.println("it's is a lambda function!")).start();
        System.out.println("this is main thread!");

        new Runnable() {
            @Override
            public void run() {
                System.out.println("this is not lambda way!");
            }
        }.run();
        Runnable r = () -> {
            System.out.println("this is lambda way!");
        };  // lambda���ʽ���������ڲ���
        r.run();
    }

    /**
     * ʹ��lambda���ʽ�Լ��Ͻ��е���
     */
    @Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java", "scala", "python");
        //before java8
        for (String each : languages) {
            System.out.println(each);
        }
        //after java8
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);
    }

    @Test
    public void testCount() throws Exception {
        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            count = count++;  // count��ֵ����countֵ��������count�ԼӲ�Ӱ��count�����������ʽ��������
        }
        System.out.println("count*num: "+(count*num));
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
