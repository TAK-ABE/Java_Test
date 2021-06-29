package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//practicetest4 制御構文
		//練習問題1
		//②のequalsが適切である。
		//equalsメソッドは大文字と小文字を区別して文字列と文字列の内容が一致するかどうかを判断。
		//①の==は文字列の比較ではなく、参照している文字列の場所の情報を比較している。
		//よって、各変数の参照先が同じ時だけ問題ないだけであり、推奨される方法ではないため。
		
		//練習問題2
		ArrayList <String> animal = new ArrayList<>();
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("蛇");
		
		//練習問題３
		String neko = "猫";
		if(animal.contains(neko)) {
			System.out.println("{" + neko + "}" + "はリストに含まれています");
		}
		else {
			System.out.println("{" + neko + "}" + "はリストに含まれていません");
		}
		
		
		//練習問題4
		int birthday = 2;
		switch(birthday) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日、天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日");
			break;
		///...といったように書いていって処理する 終わりませんでした。
		}
	}

}
