package com.wp.programming.wy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @url https://www.nowcoder.com/practice/b7985769dc434d85a16717908669bcab?tpId=98&tqId=32967&tPage=8&rp=8&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年12月4日 下午4:34:30
 */
public class Cost {

	private final static int INF = 1000000000;
	private final static int N = 10010;
	static int[] arr = new int[N];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			arr[0] = in.nextInt();
			arr[1] = in.nextInt();
			arr[2] = in.nextInt();
			Arrays.sort(arr,0,3);
			int ans = 0;
			ans += arr[1]-arr[0];
			ans += arr[2]-arr[1];
			System.out.println(ans);
			
		}
		in.close();
	}
}
