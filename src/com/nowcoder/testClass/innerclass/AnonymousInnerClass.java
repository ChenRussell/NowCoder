package com.nowcoder.testClass.innerclass;

/**
 * �����ڲ���
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {
        new Thread(new Runnable() {     // �����ڲ���
            @Override
            public void run() {
                System.out.println("this is a anonymous class!");
            }
        }).start();

        new Thread(() -> System.out.println("this is another anonymous class!")).start();
    }
}
