package com.hexaware.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	IProductService service =		context.getBean(ProductServiceImp.class);
    	
    	
    		Product product = new Product(101, "Mobile", 50000);
    	
    		boolean isCreated =	service.createProduct(product);
    		
    		System.out.println("Is record created "+isCreated);
    	
    		context.close();
    	
    }
}
