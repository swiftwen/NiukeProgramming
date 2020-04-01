package com.wp.programming.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @url https://www.nowcoder.com/practice/52f25c8a8d414f8f8fe46d4e62ef732c?tpId=98&tqId=32964&tPage=8&rp=8&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019-12-03
 */
public class PlantTree {

	private final static int INF = 1000000000;
	private final static int N = 100010;
	static int[] arr = new int[N];

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int p = in.nextInt();
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr,0,n);
			int maxLen = 0;
			for(int i=0;i<n;i++){
				if(n-i+1<=maxLen){
					break;
				}
				for(int j=i+maxLen;j<n;j++){
					if(arr[i]*p>=arr[j] && maxLen<=j-i+1){
						maxLen = j-i+1;
					}else if(arr[i]*p>=arr[j] && maxLen >j-i+1){
						
						continue;
					}else{
						break;
					}
				}
			}
			System.out.println(maxLen);
		}
		in.close();
	}

}
