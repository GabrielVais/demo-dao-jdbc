package model.dao;

import java.util.List;

import mode.entities.Seller;


public interface SellerDAO {

	//operaçao insert
	
	void insert(Seller obj);
	
	void update(Seller obj);
	
	void deleteById(Integer id);
	
	SellerDAO findById(Integer id);
	
	
	List<SellerDAO>findAll();	
}
