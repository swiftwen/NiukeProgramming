package com.wp.programming.wy;

import java.util.ArrayList;
import java.util.List;

class Test {
    private static final int N = 11;
    static int[] flag = new int[N];
    static int[] arr = new int[N];
    static int[] idx = new int[N];
    public static void init(){
        for(int i=0;i<N;i++){
            flag[i] = 0;
            idx[i] = 0;
        }
    }
    public static void dfs(int k,int n,List<List<Integer>> list,int[] nums){
        if(k==n){
            List<Integer> tmpList = new ArrayList<>();
            for(int i=0;i<n;i++){
                tmpList.add(nums[arr[i]]);
            }
            list.add(tmpList);
            return;
        }
        for(int i=0;i<n;i++){
            if(flag[i] == 0){
            	//System.out.println(k+"---"+nums[i]);
            	//System.out.println("i="+i+",k="+k+","+arr[k]+","+bums[i]);
            	if(i != arr[k] && nums[arr[k]] == nums[i]){
            		continue;
            	}
            	
            	
            	
            	//System.out.println("i="+i+",k="+k+","+arr[k]+","+nums[i]);
                flag[i] =1;
                arr[k] = i;
                dfs(k+1,n,list,nums);
                flag[i] = 0;
            }
        }
        
        
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
    	init();
        List<List<Integer>> list = new ArrayList<>();
        dfs(0,nums.length,list,nums);
        return list;
    }
    public static void main(String[] args) {
    	int[] arr = new int[]{1,1,2,3};
		System.out.println(permuteUnique(arr));
	}
}