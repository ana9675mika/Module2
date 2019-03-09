package com.capgemini.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.beans.Product;
import com.capgemini.repo.IProductRepo;
@Transactional
@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductRepo repo;
	

	public IProductRepo getRepo() {
		return repo;
	}

	public void setRepo(IProductRepo repo) {
		this.repo = repo;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.addProduct(product);
	}

	@Override
	public Product findProduct(int productid) {
		// TODO Auto-generated method stub
		return repo.findProduct(productid);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.updateProduct(product);
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return repo.getProductList();
	}

	@Override
	public Product removeProduct(int productid) {
		// TODO Auto-generated method stub
		return repo.removeProduct(productid);
	}

	@Override
	public List<String> getProductByBrand(String brand) {
		// TODO Auto-generated method stub
		return repo.getProductByBrand(brand);
	}

	@Override
	public List<Product> getProductByPriceRange(float min, float max) {
		// TODO Auto-generated method stub
		return repo.getProductByPriceRange(min, max);
	}

}
