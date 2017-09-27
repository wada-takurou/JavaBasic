package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、それぞれかかった時間と残りのガソリンの量を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.color = "Red";
		car1.gasoline = 60;
		
		car2.color = "Blue";
		car2.gasoline = 40;
		
		car3.color = "Green";
		car3.gasoline = 50;
		
		final int distance = 200;
		
		int i1 = 0;
		int count1 = 0;
		while(true) {
			i1+= car1.run();
			count1++;

			System.out.println(i1);


			if(i1>=distance) {
				System.out.println("目的地まで"+count1+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
				break;
			}

			if(car1.gasoline==0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		int i2 = 0;
		int count2 = 0;
		while(true) {
			i2+= car2.run();
			count2++;

			System.out.println(i2);


			if(i2>=distance) {
				System.out.println("目的地まで"+count2+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
				break;
			}

			if(car1.gasoline==0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		int i3 = 0;
		int count3 = 0;
		while(true) {
			i3+= car3.run();
			count3++;

			System.out.println(i3);


			if(i3>=distance) {
				System.out.println("目的地まで"+count3+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
				break;
			}

			if(car3.gasoline==0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}

	}
}
