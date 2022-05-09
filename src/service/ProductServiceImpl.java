package service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import entity.User;
import persistance.ProductDao;
import persistance.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao=new ProductDaoImpl();
	@Override
	public Optional<User> getUserById(String userId) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = productDao.getUserById(userId);
		return optionalUser;
	}
	@Override
	public int addNewUser(String userName, Date dob, String mobileNumber, String emailId, String address) {
		// TODO Auto-generated method stub
		int rows=productDao.createNewUser(userName,dob,mobileNumber,emailId,address);
		System.out.println("Successful Impl");
		System.out.println(rows);
		return rows;
	}

	
	
}
