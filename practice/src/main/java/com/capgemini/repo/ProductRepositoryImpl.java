package com.capgemini.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.beans.Product;
@Repository("Repo")
public class ProductRepositoryImpl implements IProductRepo {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	public Product addProduct(Product product) {
		entityManager.persist(product);
		entityManager.flush();
		return product;
	}

	@Override
	public Product findProduct(int productid) {
		Product product= entityManager.find(Product.class, productid);
		if(product==null)
			return null;
			product.setProductId(productid);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		entityManager.merge(product);
		entityManager.flush();
		return product;
	}

	@Override
	public List<Product> getProductList() {
		TypedQuery<Product> query=
				entityManager.createQuery
				("select prod from Product prod ", Product.class);
						
					List<Product> list= query.getResultList();
				return list;
	}

	@Override
	public Product removeProduct(int productid) {
		Product product= entityManager.find(Product.class, productid);
		entityManager.remove(product);
		entityManager.flush();
		return product;
	}

	@Override
	public List<String> getProductByBrand(String brand) {
		Query query=entityManager.
				createQuery("SELECT p.productName FROM Product p WHERE brand=:brand");
		query.setParameter("brand", brand);
		List<String> list=query.getResultList();
		return list;
	}

	@Override
	public List<Product> getProductByPriceRange(float min, float max) {
		String selAllQuery="SELECT p FROM Product p WHERE price BETWEEN :min AND :max";
		TypedQuery<Product> tq=entityManager.createQuery(selAllQuery,Product.class);
		tq.setParameter("min", min);
		tq.setParameter("max", max);
		List<Product> list=tq.getResultList();
		return list;
	}

}
