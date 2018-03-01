package com.nowcoder.testClass.innerclass;

/**
 * 匿名内部类
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {
        new Thread(new Runnable() {     // 匿名内部类
            @Override
            public void run() {
                System.out.println("this is a anonymous class!");
            }
        }).start();

        new Thread(() -> System.out.println("this is another anonymous class!")).start();
    }
}
