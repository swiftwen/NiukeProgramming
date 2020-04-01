package com.wp.programming;

import java.util.Scanner;

/**
 * 爱吃喵粮的小招喵
 * 题目描述
小招喵喜欢吃喵粮。这里有 N 堆喵粮，第 i 堆中有 p[i] 粒喵粮。喵主人离开了，将在 H 小时后回来。
小招喵可以决定她吃喵粮的速度 K （单位：粒/小时）。每个小时，她将会选择一堆喵粮，从中吃掉 K 粒。如果这堆喵粮少于 K 粒，她将吃掉这堆的所有喵粮，然后这一小时内不会再吃更多的喵粮。  
小招喵喜欢慢慢吃，但仍然想在喵主人回来前吃掉所有的喵粮。
返回她可以在 H 小时内吃掉所有喵粮的最小速度 K（K 为整数）。
 * @company 招行信用卡
 * @url https://www.nowcoder.com/practice/336d00e600f8496287d0d472678da774?tpId=98&tqId=32863&tPage=2&rp=2&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @author swiftwen
 * @date 2019年11月22日 下午4:34:28
 */
public class Cat {

	private final static int INF = 1000000000;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String line = in.nextLine();
			//System.out.println("line="+line);
			int h = in.nextInt();
			String[] vals = line.split(" +");
			int lt = 1;
			int rt = 1;
			for(String val : vals){
				if(rt < Integer.valueOf(val)){
					rt = Integer.valueOf(val);
				}
			}
			int mid = (lt+rt)>>1;
			while(lt <= rt){
				mid = (lt+rt)>>1;
			    int cnt = 0;
			    for(String val : vals){
			    	int v = Integer.valueOf(val);
			    	if(v % mid == 0){
			    		cnt += v/mid;
			    	}else{
			    		cnt += v/mid;
			    		cnt++;
			    	}
			    }
			    //System.out.println("cnt="+cnt);
			    //System.out.println(lt+"---"+rt+"----"+mid);
			    if(cnt>=h){
			    	lt = mid+1;
			    }else{
			    	rt = mid-1;
			    }
			}
			mid++;
			//System.out.println("mid="+mid);
			int m = mid;
			while(m-->1){
				int cnt = 0;
			    for(String val : vals){
			    	int v = Integer.valueOf(val);
			    	if(v % m == 0){
			    		cnt += v/m;
			    	}else{
			    		cnt += v/m;
			    		cnt++;
			    	}
			    }
			   // System.out.println("cnt="+cnt);
			    if(cnt<=h){
			    	mid = m;
			    }else{
			    	break;
			    }
			}
			 
			System.out.println(mid);
			in.nextLine();
		}
		in.close();
	}

}
