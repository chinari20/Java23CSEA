// (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
// Customer: If any products ordered by customer, compare with the data stored and display the total price along with 
// the details of product.  (Use bean and client classes)

package projectjava;
import java.util.Scanner;
import java.util.HashSet;

class Product{
	int id;
	String name;
	double price;
	
	Product(int id, String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}

}
public class EcommerceApplication {
	public static void main(String args[]) {
		HashSet<Product> catalog = new HashSet<>();
		catalog.add(new Product(1,"sofa",2000.00));
		catalog.add(new Product(2,"table",1000.00));
		catalog.add(new Product(3,"bed",5000.00));
		
		for(Product p:catalog) {
			System.out.println(p);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product ids to order (seperate by commas): ");
		String input = sc.nextLine();
		
		double totalPrice=0.0;
		String[] ids = input.split(",");
		
		for(String s:ids) {
			int id=Integer.parseInt(s.trim());
		
			boolean found = false;
			for(Product p : catalog) {
				if(p.id == id) {
					System.out.println("ordered: "+p);
					totalPrice+=p.price;
					found=true;
					break;
				}
	
			}
			if(!found) {
				System.out.println("id not found");
			}
		}
		System.out.println("total price : "+totalPrice);
	}
}
