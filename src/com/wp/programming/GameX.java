package com.wp.programming;

import java.util.Scanner;
/**
 * 题目描述
 * 我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。

如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；2 和 5 可以互相旋转成对方；6 和 9 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。

现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/41b0f2f813da4c0cb68ef298b60a19a2?tpId=98&tqId=32864&tPage=3&rp=3&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午5:49:21
 */
public class GameX {

	private final static int INF = 1000000000;
	private final static int N = 1010;
	static int[] arr = new int[N];
	static int[] flag = new int[N];
	static int v;
	static int cnt;
	static int[] val = new int[]{0,1,2,5,6,8,9};
	public static void init(){
		for(int i=0;i<N;i++){
			arr[i] = -1;
			flag[i] = 1;
			cnt = 0;
		}
	}
	public static void dfs(int k,int n){
		if(k==n){
			int ans = 0;
			for(int i=0;i<n;i++){
				ans = ans*10 + arr[i];
			}
			if(ans>0 && ans<=v){
				for(int i=0;i<n;i++){
					if(arr[i]==2 || arr[i]==5 || arr[i]==6 || arr[i] == 9){
						cnt++;
						break;
					}
				}
			}
			return;
		}
		for(int i=0;i<val.length;i++){
			arr[k] = val[i];
			dfs(k+1, n);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			init();
			v = in.nextInt();
			String s = v+"";
			dfs(0,s.length());
			System.out.println(cnt);
		}
		in.close();
	}

}
