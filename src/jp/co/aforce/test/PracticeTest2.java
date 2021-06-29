package jp.co.aforce.test;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//PracticeTest2 演算子
		
		int x = 10;
		int y = 28;
		double z = 3.14;
		
		//練習問題1
		System.out.println(x*y);
		
		//練習問題2
		System.out.println("y ÷ x は" + (y/x) +  " 余りは" + (y%x));
		
		//練習問題3
		double seki = y * z;
		System.out.println(seki);
		
		//練習問題4
		seki++;
		System.out.println(seki);
		
		//練習問題5
		int age = 22;
		int randomNumber = new java.util.Random().nextInt(101);
		
		if( age > randomNumber) {
			System.out.println("randomNumber = " + randomNumber + " 私の方が年上です");
		}
		else if( age < randomNumber) {
			System.out.println("randomNumber = " + randomNumber + " 私の方が年下です");
		}
		else if( age == randomNumber) {
			System.out.println("randomNumber = " + randomNumber + " 私と同い年です");
		}
		else {
			
		}
	}
}
