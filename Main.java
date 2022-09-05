package homework1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Goods store = new Goods();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter description of the item: ");
		store.setDescription(sc.nextLine());
		System.out.println("Enter price of the item: ");
		store.setPrice(sc.nextDouble());
		System.out.println("Enter weight of the item: ");
		store.setWeight(sc.nextDouble());
		System.out.println("Enter how many items in stock: ");
		store.setAmount(sc.nextInt());

		String essential = store.nameAndPrice(store.getDescription(), store.getPrice());
		String full = store.fullInfo(store.getDescription(), store.getPrice(), store.getWeight(), store.getAmount());

		System.out.println(essential);
		System.out.println(full);

		sc.close();

		Goods secondStore = new Goods("iPhone", 900.99, 0.454, 46);

		System.out.println(secondStore.toString());

		System.out.println(secondStore.nameAndPrice(secondStore.getDescription(), secondStore.getPrice()));
	}
}
