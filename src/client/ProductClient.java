package client;

import java.util.Scanner;

import presentation.ProductPresentaitonImpl;
import presentation.ProductPresentation;

public class ProductClient {

	public static void main(String[] args) {
		ProductPresentation productPresentation=new ProductPresentaitonImpl();
		 
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			productPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			productPresentation.performMenu(choice);
		}
	}

}
