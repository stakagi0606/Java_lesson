package Study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson {

	public static void main(String[] args) {

		// System.inでキーボード入力を受け付ける
		Scanner scanner = new Scanner(System.in);


		System.out.println("名前を入力して、エンターを押してください");
		// 名前を入力
		String name = scanner.next();
		System.out.println("こんにちは"+ name + "さん、突然ですが問題です");


		System.out.println("[1] 日本の首都はどこでしょうか？");
		System.out.println("1：京都");
		System.out.println("2：奈良");
		System.out.println("3：東京");
		System.out.println("答えを半角数字で入力し，エンターを押してください =>");


		int answer = 0;
		while(answer != 3){
			// 答えを入力
			// TODO 文字で入力されたあとも入力しなおしできるようにしたい
			try{
				answer = scanner.nextInt();
				if(answer == 3) {
					System.out.println("正解です");
					scanner.close();
				}else {
					System.out.println("今は違います");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("数値で入力してください");
				break;
			}
		}
	}
}