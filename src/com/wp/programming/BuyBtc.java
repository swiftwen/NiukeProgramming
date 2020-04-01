package com.wp.programming;

import java.util.Scanner;

/**
 * 比特币最佳买卖时机
 * 题目描述
给定一个正整数数组，它的第 i 个元素是比特币第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一次），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入比特币前卖出。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/08f70daa78bf45fea64d72523a3641f3?tpId=98&tqId=32862&tPage=2&rp=2&ru=%2Fta%2F2019test&qru=%2Fta%2F2019test%2Fquestion-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午4:34:28
 */
public class BuyBtc {

	private final static int INF = 1000000000;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String s = in.nextLine();
			String[] arr = s.split(" +");
			int len = arr.length;
			int ans = -INF;
			int minVal = Integer.parseInt(arr[0]);
			boolean flag = false;
			for(int i=1;i<len;i++){
				if(Integer.parseInt(arr[i])<minVal){
					minVal = Integer.parseInt(arr[i]);
				}else{
					flag=true;
					ans = Math.max(ans, Integer.parseInt(arr[i]) - minVal);
				}
			}
			if(!flag){
				ans = 0;
			}
			System.out.println(ans);
			
		}
		in.close();
	}

}
