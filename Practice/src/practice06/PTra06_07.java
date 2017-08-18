package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i=1;i<=10;i++) {
			if(i==1) {
				System.out.println("□□□□□");
			}
			if(i==2||i==10) {
				System.out.println("■□□□□");
			}
			if(i==3||i==9) {
				System.out.println("■■□□□");
			}
			if(i==4||i==8) {
				System.out.println("■■■□□");
			}
			if(i==5||i==7) {
				System.out.println("■■■■□");
			}
			if(i==6) {
				System.out.println("■■■■■");
			}
		}
	}
}
