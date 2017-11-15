/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee1 = new Employee(NAMEDATA[0],MAILDATA[0],PASSDATA[0],QUATERDATA[0][0],QUATERDATA[1][0]);

		Employee employee2 = new Employee(NAMEDATA[1],MAILDATA[1],PASSDATA[1],QUATERDATA[0][1],QUATERDATA[1][1]);

		Employee employee3 = new Employee(NAMEDATA[2],MAILDATA[2],PASSDATA[2],QUATERDATA[0][2],QUATERDATA[1][2]);

	}
}
