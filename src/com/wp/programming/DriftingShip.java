package com.wp.programming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 漂流船
 * 题目描述
公司组织团建活动，到某漂流圣地漂流，现有如下情况：
员工各自体重不一，第 i 个人的体重为 people[i]，每艘漂流船可以承载的最大重量为 limit。
每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
为节省开支，麻烦帮忙计算出载到每一个人所需的最小船只数(保证每个人都能被船载)。
 * @company 招行信用卡
 * @url 
 * @author swiftwen
 * @date 2019年12月02日 下午5:03:00
 */
public class DriftingShip {

	private final static int INF = 1000000000;
	private final static int N = 1010;
	static int[] arr = new int[N];
	static int[] flag = new int[N];
	public static void init(){
		for(int i=0;i<N;i++){
			flag[i] = 0;
		}
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String line = in.nextLine();
			int limit = in.nextInt();
			init();
			int cnt = 0;
			for(String s : line.split(" +")){
				arr[cnt++] = Integer.parseInt(s);
			}
			Arrays.sort(arr,0,cnt);
			int ans = 0;
			boolean overWeight = false;
			for(int i=cnt-1;i>=0;i--){
				if(arr[i]>limit){
					overWeight = true;
					break;
				}
				for(int j=i-1;j>=0;j--){
					if(flag[j]==0 && arr[i]+arr[j]<=limit){
						flag[j] = 1;
						flag[i] = 1;
						ans++;
						break;
					}
				}
				if(flag[i]==0){
					ans++;
					flag[i] =1;
				}
			}
			System.out.println(ans);
			in.nextLine();
		}
		in.close();
	}

}
