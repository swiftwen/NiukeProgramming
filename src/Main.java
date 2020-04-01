import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	
	static final int N = 1000010;
	static final int M = 10010;
	static int[] a = new int[N];
	static int[] b = new int[M];
	static int n,m;
	static int[] next = new int[M];
	static final Set<Integer> set = new HashSet<Integer>();
	public static void init(){
		for(int i=0;i<M;i++){
			next[i] = 0;
		}
	}
	public static void calNext(){
		init();
		int idx= 0;
		for(int i=1;i<m;i++){
			while(b[i] != b[idx] && idx > 0){
				idx = next[idx-1];
			}
			if(b[i] == b[idx]){
				idx++;
				next[i] = idx;
			}
		}
		/*for(int i=0;i<m;i++){
			System.out.println("i="+i+","+next[i]);
		}*/
	}
	public static int solve(){
		int idx = 0;
		for(int i=0;i<n;i++){
			while(b[idx] != a[i] && idx > 0){
				idx = next[idx-1];
			}
			if(b[idx] == a[i]){
				idx++;
			}
			if(idx == m){
				return i - m + 2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		set.add(1);
		set.add(3);
		System.out.println(set.size());
		Stack s = null;
		ArrayList list = null;
		LinkedList list2 = null;
		Scanner in = new Scanner(System.in);
		int ca = in.nextInt();
		while(ca-->0){
			n = in.nextInt();
			m = in.nextInt();
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
			}
			for(int i=0;i<m;i++){
				b[i] = in.nextInt();
			}
			
			calNext();
			System.out.println(solve());
			
		}
		in.close();
	}

}
