package com.capge.flipkart.main;

import java.util.List;
import java.util.Scanner;

import com.capge.flipkart.bean.ProductBean;
import com.capge.flipkart.factory.ProductManager;
import com.capge.flipkart.service.ProductService;

public class ProductMain {

	public static void main(String[] args) {

		ProductBean product=new ProductBean();
		ProductService service=ProductManager.instanceOfProductServicesImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to show all product");
			System.out.println("press 2 to search for Product:");
			

			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				List<ProductBean> list=service.getAllProduct();
				if(list!=null){
					for(ProductBean product1:list){
						System.out.println(product1);
					}
				break;
				}
				
			case 2:
				System.out.println("Enter the name of Product:");
				String name=sc.next();
				
				Info.main(args);

				break;
				
			}
			
		}

	}
}
	
