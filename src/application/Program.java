package application;
import java.util.Date;
import mode.entities.Department;
import mode.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Department obj = new Department(1, "Books");
		
		Seller seller = 
				new Seller(21, 
						"bob", "bob@gmail.com",
						new Date(), 
						3000.00, obj);
		
		System.out.println(seller);

	}

}
