package com.nowcoder.testClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ChenRui on 18-4-17
 */
public class IteratorTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        // ʹ��iterator����ʱ��ɾ��Ԫ�ز������쳣
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("e")) {
                iterator.remove();
            }
            else System.out.println(next);
        }

        System.out.println("size: "+list.size());
        System.out.println("**************");

        /*
          �������������ڶ���Ԫ�ز�ɾ����Ԫ��ʱ��ʹ�б���size-1������cursor��
          ��ʱhasNext()����false���Բ��ٵ���next()��������checkForComodification()�����޸���֤��
         */
        for (String s : list) {
            if (s.equals("e")) list.remove(s);
            else System.out.println(s);
        }
    }
}