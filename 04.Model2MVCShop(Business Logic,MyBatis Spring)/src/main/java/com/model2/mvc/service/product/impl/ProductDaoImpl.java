package com.model2.mvc.service.product.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductDao;

@Repository("productDaoImpl")
public class ProductDaoImpl implements ProductDao {
	
//	Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void insertProduct(Product product) throws Exception {
		System.out.println("insertProduct 시작");
		sqlSession.insert("ProductMapper.addProduct", product);
		System.out.println("insertProduct 끝");

	}

	@Override
	public Product findProduct(int prodNo) throws Exception {
		return sqlSession.selectOne("ProductMapper.getProduct", prodNo);
	}


	@Override
	public void updateProduct(Product product) throws Exception {
		System.out.println("updateProduct 시작");
		sqlSession.update("ProductMapper.updateProduct", product);
		System.out.println("updateProduct끝");
	}

	@Override
	public Map<String, Object> getProductList(Search search) throws Exception {
//		return sqlSession.selectList("ProductMapper.getProductList", search);
		return null;
	}

	@Override
	public int getTotalCount(String sql) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
