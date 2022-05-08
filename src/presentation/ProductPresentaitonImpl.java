package presentation;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import entity.User;
import service.ProductService;
import service.ProductServiceImpl;

public class ProductPresentaitonImpl implements ProductPresentation{
	private ProductService productService=new ProductServiceImpl();

	public void showMenu() {
		System.out.println("1. User login");
		System.out.println("2. Show Product Categories");
		System.out.println("3. Add product to cart");
		System.out.println("4. Exit");
		
	}
	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		String userId="";
		
		switch(choice) {
		case 1: 
			System.out.println("Enter user id:");
			userId=sc.next();
			Optional<User> usersList=productService.getUserById(userId);
			if(usersList.isPresent()) {
				System.out.println(usersList.get());
			}
			else {
				System.out.println("User is not present");
				System.out.println("Please enter these details to create a new account");
				String userName="",mobileNumber="",emailId="",address="",dob="";
				System.out.println("Enter your name:");
				userName=sc.next();
				System.out.println("Enter your mobile number");
				mobileNumber=sc.next();
				System.out.println("Enter your emailId");
				emailId=sc.next();
				System.out.println("Enter your date of birth in 'YYYY-MM-DD' format:");
				dob=sc.next();
			}
			
		}
		
	}


}
