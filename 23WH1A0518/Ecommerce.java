package JavaPractice;

import java.util.*;
//import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("number of products you want to add");
		int numOfProduts = scan.nextInt();
		int i;
		HashSet<Product> productsSet = new HashSet<Product>();
		for (i=0;i<numOfProduts;i++) {
			Product product = new Product();
			System.out.println("enter Product id");
			product.setId(scan.nextInt());
			System.out.println("enter Product Name");
			product.setName(scan.next());
			System.out.println("enter Product price");
			product.setPrice(scan.nextDouble());
			productsSet.add(product);
		}
		//Use iterator to Extract Data
		Iterator iterator = productsSet.iterator();
		while(iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product.getId()+"\t" + product.getName()+"\t" + product.getPrice()+"\t");
	}

	}
}
