package com.nowcoder.swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ChenRui on 2018/3/30
 * <p>
 * ��Ŀ����
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 */
public class FindPath {

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        while (!stack.empty() || root!=null) {
            while (root != null) {
                sum += root.val;
                stack.push(root);
                root = root.left;
                if (sum == target) checkEqual(arr,stack, sum, target);
            }

            if (!stack.empty()) {
                TreeNode pop = stack.pop();
                sum -= pop.val;
                root = pop.right;
            }
//            if (sum == target)
        }
        return arr;
    }

    void checkEqual(ArrayList<ArrayList<Integer>> arr,Stack<TreeNode> stack, int sum, int target) {
        ArrayList<Integer> list = new ArrayList<>();
//        if (sum == target) {
//            list.addAll(stack);
//            stack.forEach(x->list.addAll());
//            Collection.add
            for (TreeNode o : stack) {
                list.add(o.val);
            }
//        }
        arr.add(list);
    }

    public static void main(String[] args) {
        FindPath obj = new FindPath();
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(3);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(2);
        node.left.right = null;

        ArrayList<ArrayList<Integer>> path = obj.findPath(node, 6);
        System.out.println(path.size());
        for (int i = 0; i < path.size(); i++) {
//            path.get(i).forEach(System.out::println);
            for (Integer integer : path.get(i)) {
                System.out.println(integer);
            }
            System.out.println("*******");
        }
    }
}
