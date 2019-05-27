package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //define a região para us, para o uso do "." (Ponto)
		
		Scanner sc = new Scanner(System.in); // inicializa a variavel sc para a leitura de dados
		
		// inicio leitura dos dados do objeto
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		System.out.print("Price: ");
		
		double price = sc.nextDouble();
		
		
		//retirado para o teste de sobrecarga
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		//System.out.println();
		
		// final da leitura
		
		Product product = new Product(name, price); //objeto istanciado e inicializado com o construtor
		
		//metodos getters e setters
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		
		product.setPrice(500.00);
		System.out.println("Update price: " + product.getPrice());
		
		//Fim getters e setters
		
		System.out.println("Product data: " + product); //Imprime o que foi lido e o resultado
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: "); // aumenta a quantidade
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		System.out.println();
		System.out.println("Updated data: " + product);//Imprime o que foi lido e o resultado
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: "); // diminui a quantidade
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product); //Imprime o que foi lido e o resultado
		
		sc.close();
		
	}
}
