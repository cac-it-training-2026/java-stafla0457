package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("商品" + (i + 1) + "を入力してください：＞");
			String inputName = reader.readLine();
			itemNames[i] = inputName;
		}
		System.out.println("各商品の単価を順に入力してください：＞");
		for (int j = 0; j < 5; j++) {

			System.out.println(itemNames[j] + "の単価：＞");
			String inputPrice = reader.readLine();
			prices[j] = Integer.parseInt(inputPrice);

		}
		for (int k = 0; k < itemNames.length; k++) {

			System.out.println("登録商品一覧");
			System.out.println(itemNames[k] + ":" + prices[k]);
		}
	}
}
