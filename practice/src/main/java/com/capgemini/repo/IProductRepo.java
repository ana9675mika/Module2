package com.capgemini.repo;

import java.util.List;

import com.capgemini.beans.Product;


public interface IProductRepo {
	
	public Product addProduct(Product product);
	public Product findProduct(int productid);
	public Product updateProduct(Product product);
	public List<Product> getProductList();
public Product removeProduct(int productid);

public List<String> getProductByBrand(String brand);
public List<Product> getProductByPriceRange(float min,float max);
}
