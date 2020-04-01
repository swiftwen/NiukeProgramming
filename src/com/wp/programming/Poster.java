package com.wp.programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 海报
 * 题目描述
我们部门需要装饰墙，但是墙非常非常的长，有一千万米。我们会按顺序贴很多海报在上面，这些海报相互之间会重叠，请问下，最后还能看到哪些？（只看到一部分也算）
输入描述:
N表示N张海报
接下来每一行代表海报的左右边界（上下默认全满），Li，Ri，均为整数，大于0，小于一千万。海报按输入顺序张贴。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/a502e49967b44036918d93ff43be1930?tpId=98&tqId=32871&tPage=3&rp=3&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年12月02日 下午5:34:28
 */
public class Poster {

	private final static int INF = 1000000000;
	private final static int N = 1000100;
	static int[] arr = new int[N];
	public static void init(){
		for(int i=0;i<N;i++){
			arr[i] = 0;
		}
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			init();
			int maxVal = -INF;
			for(int i=0;i<n;i++){
				int lt = in.nextInt();
				int rt = in.nextInt();
				maxVal = Math.max(maxVal, rt);
				for(int j=lt;j<=rt;j++){
					arr[j] = i+1;
				}
			}
			Set<Integer> set = new HashSet<>();
			for(int i=1;i<=maxVal;i++){
				if(arr[i] > 0){
					set.add(arr[i]);
				}
			}
			System.out.println(set.size());
		}
		in.close();
	}

}
