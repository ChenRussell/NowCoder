package com.nowcoder.testClass.innerclass;

/**
 * �ֲ��ڲ����Ƕ�����һ����������һ��������������࣬���ͳ�Ա�ڲ�����������ھֲ��ڲ���ķ���Ȩ�޽����ڷ����ڻ��߸�
 * ��������
 */
public class LocalInnerClass {

    class People {
    }

    class Man {

    }
    public People getInnerClass() {
        class Woman extends People {        // �ֲ��ڲ���
            int age = 0;
        }
        return new Woman();
    }
}
