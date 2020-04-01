package com.wp.programming;

import java.util.Scanner;

class Test {
    private final static int INF = 1000000000;
	private final static int N = 1010;
	static int[][] flag = new int[N][N];
	static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    static int ans;
    public static void init(){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				flag[i][j] = 0;
			}
		}
		ans = -1;
	}
    public static int longestIncreasingPath(int[][] matrix) {
        init();
       for(int i=0;i<matrix.length;i++){
	    	for(int j=0;j<matrix[i].length;j++){
	    		
	    		dfs(i,j,1, matrix);
	    	}
	    }
        return ans;
    }
    	public static void dfs(int x, int y, int dep, int[][] arr){
		if(dep>ans){
			ans = dep;
		}
		for(int i=0;i<4;i++){
		    int nextX = x+dir[i][0];
		    int nextY = y+dir[i][1];
		    if(nextX < 0 || nextX >=arr.length){
		    	continue;
		    }
		    if(nextY <0 || nextY >= arr[nextX].length || y>=arr[nextX].length){
		    	continue;
		    }
		    if(flag[nextX][nextY] == 1){
		    	continue;
		    }
		    if(arr[nextX][nextY] == arr[x][y]){
		    	continue;
		    }
		    if(arr[nextX][nextY] < arr[x][y]){
		    	if(dep==1){
		    		return;
		    	}
		    	continue;
		    }
		    flag[nextX][nextY] = 1;
		    
		    dfs(nextX,nextY,dep+1,arr);
		    
		    flag[nextX][nextY] = 0 ;
		}
	}
    	public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
    		int n = 3;
    		int[][] arr2 = new int[3][3];
    		for(int i=0;i<n;i++){
    			for(int j=0;j<n;j++){
    				arr2[i][j] = in.nextInt();
    			}
    		}
			System.out.println(longestIncreasingPath(arr2));
		}
}