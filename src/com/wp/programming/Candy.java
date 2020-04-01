package com.wp.programming;

import java.util.Scanner;

/**
 * 糖果分配
 * 题目描述
假设你是一位很有爱的幼儿园老师，想要给幼儿园的小朋友们一些小糖果。但是，每个孩子最多只能给一块糖果。对每个孩子 i ，都有一个胃口值 gi ，这是能让孩子们满足胃口的糖果的最小尺寸；并且每块糖果 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个糖果 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
注意：
你可以假设胃口值为正。
一个小朋友最多只能拥有一块糖果。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/c0e676f4cf9846c785ade34d9472951b?tpId=98&tqId=32866&tPage=3&rp=3&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午4:34:28
 */
public class Candy {

	private final static int INF = 1000000000;
	private final static int N = 10010;
	static int[] arr = new int[N];
	static int[] arr2 = new int[N];
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String need = in.nextLine();
			String[] needs = need.split(" +");
			String candy = in.nextLine();
			String[] candys = candy.split(" +");
			int cnt = 0;
			for(String cur : needs){
				arr[cnt++] = Integer.parseInt(cur);
			}
			int cnt2= 0;
			for(String cur : candys){
				arr2[cnt2++] = Integer.parseInt(cur);
			}
			int ans = 0;
			int j = 0;
			for(int i=0;i<cnt;i++){
				while(j<cnt2){
					if(arr2[j]>=arr[i]){
						ans++;
						j++;
						break;
					}
					j++;
				}
			}
			System.out.println(ans);
		}
		in.close();
	}

}
