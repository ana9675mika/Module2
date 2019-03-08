package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Product;
import com.capgemini.service.IProductService;


@RestController
public class ProductController {
 
	@Autowired
	IProductService service;

	public IProductService getService() {
		return service;
	}

	public void setService(IProductService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST,produces="application/json")
	public Product addProduct(@RequestBody Product product)
	{
		product=service.addProduct(product);
		return product;
	}
	
	@RequestMapping(value="/getProductById/{prodid}",method=RequestMethod.POST,produces="application/json")
	public Product getProductById(@PathVariable int prodid)
	{
		Product product=service.findProduct(prodid);
		return product;
	}
	
		@RequestMapping(value="/updateProduct",
				consumes="application/json",
				method=RequestMethod.POST)
	public Product updateProduct(@RequestBody Product product) {
			product=service.updateProduct(product);
			return product;
	}
	
	@RequestMapping(value="/deleteProduct/{prodid}",
		produces="application/json",
		method=RequestMethod.POST)
	public Product removeProduct(@PathVariable int prodid)
	{
	Product product=service.removeProduct(prodid);
	return product;
	}
	
	@RequestMapping(value="/getProductList",produces="application/json")
	public List<Product> getProductList()
	{ 
	List<Product> list=service.getProductList();
	return list;
   }
	
	@RequestMapping(value="/getProductListByBrand/{brand}",produces="application/json")
	public List<Product> getProductListByBrand(@PathVariable String brand)
	{ 
	List<Product> list=service.getProductByBrand(brand);
	return list;
   }
	
	@RequestMapping(value="/getProductListByPriceRange/{min}/{max}",produces="application/json")
	public List<Product> getProductListByPriceRange(@PathVariable float min,@PathVariable float max)
	{ 
	List<Product> list=service.getProductByPriceRange(min, max);
	return list;
   }
	
	
}
	
	
