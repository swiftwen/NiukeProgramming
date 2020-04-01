package com.wp.programming;

import java.util.Scanner;

/**
 * 员工考勤
 *题目描述
给定一个字符串来代表一个员工的考勤纪录，这个纪录仅包含以下两个字符：
'A' : Absent，缺勤
'P' : Present，到场
如果一个员工的考勤纪录中不超过两个'A'(缺勤),那么这个员工会被奖赏。

如果你作为一个员工，想在连续N天的考勤周期中获得奖赏，请问有多少种考勤的组合能够满足要求
 * @company 招行信用卡
 * @url 
 * @author swiftwen
 * @date 2019年12月02日 下午4:37:28
 */
public class WorkAttence {

	private final static int INF = 1000000000;
	private final static int N = 10010;
	static int[] dp = new int[N];
	public static void init(){
		for(int i=0;i<N;i++){
			dp[i] = 0;
		}
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String line = in.nextLine();
			init();
			if(line.length()<=2){
				if(line.length()==1){
					System.out.println(1);
				}else{
					String s = ""+line.charAt(0)+line.charAt(1);
					if(Integer.parseInt(s)<=26){
						System.out.println(2);	
					}else{
						System.out.println(1);
					}
				}
				continue;
			}
			dp[0] = 1;
			String s = ""+line.charAt(0)+line.charAt(1);
			if(Integer.parseInt(s)<=26){
				dp[1]=2;
			}else{
				dp[1]=1;
			}
			for(int i=2;i<line.length();i++){
				String ss = ""+line.charAt(i-1)+line.charAt(i);
				int cnt = 0;
				if(Integer.parseInt(ss)>26){
					cnt=-1;
				}
				if(cnt<0){
					dp[i] = dp[i-1];
				}else{
					dp[i] = dp[i-1]+dp[i-2];
				}
				
			}
			System.out.println(dp[line.length()-1]);
		}
		in.close();
	}

}
