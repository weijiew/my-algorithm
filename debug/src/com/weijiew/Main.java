package com.weijiew;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        Main main = new Main();
        System.out.println(main.numIdenticalPairs(a));
    }
    int numIdenticalPairs(int[] nums) {
        int[] a =new int [100];
        int ans = 0;
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i] - 1;
            ans += a[k]++;
        }
        return ans;
    }
}
