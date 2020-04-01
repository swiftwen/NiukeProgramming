package com.wp.programming;

import java.util.Scanner;

/**
题目描述
假设你正在玩跳格子（所有格子排成一个纵列）游戏。需要 跳完n 个格子你才能抵达终点。
每次你可以跳 1 或 2 个格子。你有多少种不同的方法可以到达终点呢？
注意：给定 n 是一个正整数。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/2ae1e475df394b9bbb7c6e5bf40be9ec?tpId=98&tqId=32865&tPage=3&rp=3&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午4:34:28
 */
public class Jump {

	private final static int INF = 1000000000;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n<=2){
				System.out.println(n);
				continue;
			}
			int n1 = 1,n2 = 2;
			int n3 = 0;
			for(int i=2;i<n;i++){
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.println(n3);
		}
		in.close();
	}

}
