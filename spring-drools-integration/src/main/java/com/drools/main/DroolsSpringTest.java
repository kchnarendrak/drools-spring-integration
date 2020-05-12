package com.drools.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.drools.model.Product;
import com.drools.service.ProductServiceImpl;

public class DroolsSpringTest {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ProductServiceImpl bean = ((ProductServiceImpl) applicationContext
				.getBean("ProductServiceImpl"));

		Product product = new Product();
		product.setType("gold");

		bean.CalculateDiscount(product);

		showDiscount(product);
	}

	private static void showDiscount(Product product) {
		System.out.println("The discount is " + product.getDiscount());
	}
}

