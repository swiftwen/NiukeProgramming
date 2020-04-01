package com.wp.programming;

import java.util.Scanner;

/**
 * 鸡鸭分类问题
 * 题目描述
        农场有n只鸡鸭排为一个队伍，鸡用“C”表示，鸭用“D”表示。当鸡鸭挨着时会产生矛盾。需要对所排的队伍进行调整，
        使鸡鸭各在一边。每次调整只能让相邻的鸡和鸭交换位置，现在需要尽快完成队伍调整，你需要计算出最少需要调整多少
        次可以让上述情况最少。例如：CCDCC->CCCDC->CCCCD这样就能使之前的两处鸡鸭相邻变为一处鸡鸭相邻，
        需要调整队形两次。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/f87616abbac44842b43f24ddd3cf49e8?tpId=98&tqId=32861&tPage=2&rp=2&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午4:09:57
 */
public class ClassifyChickenAndDuck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String s = in.nextLine();
			int minStep = 0;
			char[] arr = s.toCharArray();
			char target = s.charAt(0);
			int len = s.length();
			for(int i=1;i<len;i++){
				if(arr[i] == target){
					continue;
				}else{
					for(int j=i+1;j<len;j++){
						if(arr[j]==target){
							arr[j]=arr[i];
							arr[i]=target;
							minStep += j-i;
							break;
						}
					}
				}
			}
			System.out.println(minStep);
		}
		in.close();
	}

}
