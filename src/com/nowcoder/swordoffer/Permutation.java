package com.nowcoder.swordoffer;

import java.util.ArrayList;

/**
 * Created by ChenRui on 2018/4/5
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,
 * ���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 */
public class Permutation {

    public ArrayList<String> permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        char[] chars = str.toCharArray();
        ArrayList<Character> tempList = new ArrayList<>();
        boolean used[] = new boolean[chars.length];
        backTracking(res, tempList, chars, used);
        return res;
    }

    private void backTracking(ArrayList<String> res, ArrayList<Character> tempList, char[] chars, boolean used[]) {

        if (tempList.size() == chars.length && !res.contains(String.valueOf(tempList.toString()))) {
            res.add(tempList.toString());
        } else {

            for (int i = 0; i < chars.length; i++) {
                if (used[i]) continue;
                tempList.add(chars[i]);
                used[i] = true;
                backTracking(res, tempList, chars, used);
                tempList.remove(tempList.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String str = "abb";
        ArrayList<String> res = new Permutation().permutation(str);
//        System.out.println(res);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
