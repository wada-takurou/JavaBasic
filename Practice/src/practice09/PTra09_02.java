package practice09;
/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};
		shuffleArray(array);
		
		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです

		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください
	}
	public static String[] shuffleArray(String[] array) {
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
		System.out.println(list);
		return (String[]) list.toArray();
	}
}
