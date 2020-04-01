package com.wp.programming.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * @url https://www.nowcoder.com/practice/60594521f1db4d75ad78266b0b35cfbb?tpId=98&tqId=32965&tPage=8&rp=8&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年12月4日 下午4:23:52
 */
public class MinimumPair {

	private final static int INF = 1000000000;
	private final static int N = 10010;
	static int[] arr = new int[N];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}
			// 1  2 9   99 100 101
			Arrays.sort(arr,0,n);
			int maxVal = -INF;
			int minVal = INF;
			for(int i=0;i<n/2;i++){
				arr[i] += arr[n-1-i];
				maxVal = Math.max(maxVal, arr[i]);
				minVal = Math.min(minVal, arr[i]);
			}
			System.out.println(maxVal - minVal);
			
		}
		in.close();
	}
}
