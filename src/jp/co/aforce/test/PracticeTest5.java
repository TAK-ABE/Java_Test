package jp.co.aforce.test;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//PracticeTest5
		//練習問題1
		int fortune = new java.util.Random().nextInt(5);
		switch(fortune){
		case 1:
			System.out.println("fortuneが１なら吉です");
			break;
		case 2:
			System.out.println("fortuneが2なら吉です");
			break;
		case 3:
			System.out.println("fortuneが3なら吉です");
			break;
		default:
			System.out.println("それ以外の数値は凶です");
			
		}
		
		//練習問題2
		int i = 1;
		int sum = 0;
		for(i = 1; i < 100; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("7の倍数の和は" + i + "です");
		
		//練習問題3
		int x = 1;
		int y = 1;
		for(x = 1; x <= 9; x++) {
			for(y = 1; y <= 9; y++) {
				if(y ==1) {
					System.out.println("");
				}
				System.out.print(" ");
				System.out.print(x*y);
			}
		}
	}

}
