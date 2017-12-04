/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[]list = line.split(",",0);
                Player player = new Player();

                player.setPosition(list[0]);
                player.setName(list[1]);
                player.setCountry(list[2]);
                player.setTeam(list[3]);

                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

        Collections.shuffle(array);



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してくださΩ
        int gkCount = 0;
        for (int i = 0; i < array.size(); i++) {
			if(array.get(i).getPosition().equals("GK")) {
				if (gkCount < 1) {
					System.out.println(array.get(i).toString());
					gkCount++;
				}
			}
        }

		int dfCount = 0;
	      for (int i2 = 0; i2 < array.size(); i2++) {
			if(array.get(i2).getPosition().equals("DF")) {
				if (dfCount < 4) {
					System.out.println(array.get(i2).toString());
					dfCount++;
				}
			}
	      }

		int mfCount = 0;
		   for (int i3 = 0; i3 < array.size(); i3++) {
			if(array.get(i3).getPosition().equals("MF")) {
				if (mfCount < 4) {
					System.out.println(array.get(i3).toString());
					mfCount++;
				}
			}
		   }

		int fwCount = 0;
		   for (int i4 = 0; i4 < array.size(); i4++) {
			if(array.get(i4).getPosition().equals("FW")) {
				if (fwCount < 2) {
					System.out.println(array.get(i4).toString());
					fwCount++;
				}
			}
		   }
	}
}










