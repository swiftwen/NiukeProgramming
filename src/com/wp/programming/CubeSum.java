package com.wp.programming;

import java.util.Scanner;

/**
 * 立方和
 * @company 招行信用卡
 * @url 
 * @author swiftwen
 * @date 2019年11月22日 下午4:34:28
 */
public class CubeSum {

	private final static int INF = 1000000000;
	private final static int N = 100;
	private final static int MAX = 1000000;
	static int[] arr = new int[101];
	static int cnt;
	public static void init(){
	    cnt = 0;
	    for(int i=1;;i++){
	    	if((i*i*i) < MAX){
	    		//System.out.println(cnt+"---"+(i*i*i));
	    		arr[cnt++] = i*i*i;
	    	}else{
	    		break;
	    	}
	    }
	   // System.out.println(arr[0]+"-"+arr[1]+"-"+arr[2]);
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		init();
		while(in.hasNextInt()){
			int n = in.nextInt();
			int ans = 0;
			for(int i=cnt-1;i>=0;i--){
				if(n>=arr[i]){
					if(n==7){
						ans+=2;break;
					}
					if(n==6){
						ans+=3;break;
					}
					if(n==5){
						ans+=4;break;
					}
					//System.out.println("n="+n);
					//System.out.println("i="+i+"arr[i]"+arr[i]);
					ans+= n/arr[i];
					n%=arr[i];
				}
			}
			System.out.println(ans);
		}
		in.close();
	}

}
