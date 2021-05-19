package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

public interface ProductDao {
	
	public void insertProduct(Product productVO) throws Exception ;

	public Product findProduct(int prodNo) throws Exception ;
	
	public Map<String,Object> getProductList(Search search) throws Exception ;
	
	public void updateProduct(Product product) throws Exception ;
	
	public int getTotalCount(String sql) throws Exception ;
	
	
}



