package com.wp;

public class KMP {

    final static int N = 1000010;
    static int[] next = new int[N];

    public static void init(){
        for(int i=0;i<N;++i){
            next[i] = -1;
        }
    }
    public static void calNext(String s){

        if(null == s || s.trim().length() == 0){
            return;
        }
        int len = s.length();

        int idx = 0;
        for(int i = 0;i <= len;i++){
            while(idx>0 && s.charAt(i) != s.charAt(idx)){
                idx = next[idx-1];
            }
            if(s.charAt(i) == s.charAt(idx)){
                idx++;
                next[i] = idx;
            }
        }
    }
    public static void kmp(String s){

        int len = s.length();

        for(int i=0;i<len;i++){

        }
    }
    public static void main(String[] args){

        int i = 1;
        System.out.println("xxx"+i);

    }
}
