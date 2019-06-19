package model.dao;

import mode.entities.Department;

public interface DepartmentDAO {

	//opera�ao insert
	
	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Integer id);
	
	Department findById(Integer id);
	
	
	
}
