package com.wp.programming.wy;

import java.util.Scanner;

/**
 * 
 * @author swiftwen
 * @date 2020年1月8日 下午3:47:05
 */
public class Main {
	
	final static int N = 10010;
	static int[] b = new int[N];
	static int[] a = new int[N*100];
	static int[] next =new int[N];
	static int n,m;
	public static void init(){
		for(int i=0;i<N;i++){
			next[i] = 0;
		}
	}

	public static void quickSort(int[] arr,int lt,int rt){
		if(lt>=rt){
			return;
		}
		int l = lt;
		int r = rt;
		int pivot = arr[lt];
		while(l<=r){
			while(l<=r && arr[r]>=pivot){
			    r--;
			}
			arr[l] = arr[r];
			while(l<=r && arr[l]<pivot){
				l++;
			}
		    arr[r] = arr[l];
		}
		quickSort(arr,lt,r-1);
		quickSort(arr,r+1,rt);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{111,8,-1,3,1000,-5,9};
		quickSort(arr,0,arr.length-1);
		for(int a : arr){
			System.out.print(a+" ");
		}
	}

}
