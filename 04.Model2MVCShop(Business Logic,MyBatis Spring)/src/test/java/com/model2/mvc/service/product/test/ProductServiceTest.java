package com.model2.mvc.service.product.test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.user.UserService;


/*
 *	FileName :  UserServiceTest.java
 * �� JUnit4 (Test Framework) �� Spring Framework ���� Test( Unit Test)
 * �� Spring �� JUnit 4�� ���� ���� Ŭ������ ���� ������ ��� ���� �׽�Ʈ �ڵ带 �ۼ� �� �� �ִ�.
 * �� @RunWith : Meta-data �� ���� wiring(����,DI) �� ��ü ����ü ����
 * �� @ContextConfiguration : Meta-data location ����
 * �� @Test : �׽�Ʈ ���� �ҽ� ����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/commonservice.xml" })
public class ProductServiceTest {

	//==>@RunWith,@ContextConfiguration �̿� Wiring, Test �� instance DI
	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;

	//@Test
	public void testAddProduct() throws Exception {
		System.out.println("ProductSetviceTest ����");
		
		Product product = new Product();
		product.setPrice(10000);
		product.setFileName("testFileName");
		product.setManuDate("ManuDate");
		product.setProdDetail("testProdDetail");
		product.setProdName("testProdName");
		System.out.println("ProductSetviceTest ����"+product);
						
		productService.addProduct(product);
		System.out.println("�Ϸ�"); 
	 }	 
	
	//@Test
	public void testGetProduct() throws Exception {
		Product product = new Product();
		
		product = productService.getProduct(10061);
		System.out.println("testGetProduct"+product);
	}
	
	@Test
	public void testUpdateProduct() throws Exception{
		
		System.out.println("ProductServiceTest testUpdateProduct()����");
		Product product = productService.getProduct(10061);
		System.out.println("ProductServiceTest testUpdateProduct()��");
		
		product.setProdName("Name1");
		product.setProdDetail("Detail1");
		product.setManuDate("21-05-18");
		product.setPrice(200);
		product.setFileName("FileName1");
		
		System.out.println("productService.updateProduct����");
		productService.updateProduct(product);
		System.out.println("productService.updateProduct��");
		
		product = productService.getProduct(10061);
		
	}
	
}