package com.nowcoder.swordoffer;

/**
 * Created by ChenRui on 18-3-28
 * <p>
 * ��Ŀ����
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class VerifySquenceOfBST {

    public boolean verifySquenceOfBST(int [] sequence) {
        int root = sequence[sequence.length - 1];

        boolean bool = checkBST(sequence, 0, sequence.length - 1);
        return bool;
    }

    boolean checkBST(int seq[], int start, int end) {
        if (start ==end) return true;
        int root = seq[end];
        int tag=0;
        for (int i = start; i < end; i++) {
            if (seq[i]>root) {
                tag=i;
                break;
            }
        }
        boolean flag = true;
        for (int i = tag; i < end; i++) {
            if (seq[i]<root)
                return false;
        }
//        return true;
        boolean left=true;
//        if (end>0)
        left= checkBST(seq, start, tag-1);

        boolean right = true;
//        if (end>0)
        right = checkBST(seq, tag, end-1);

        return left && right ;

    }

    public static void main(String[] args) {
        int arr[] = {5,7,6,9,11,10,8};
        int arr2[] = {7,4,6,5};
        VerifySquenceOfBST obj = new VerifySquenceOfBST();
        boolean bool = obj.checkBST(arr, 0, arr2.length - 1);
        System.out.println(bool);
    }
}
