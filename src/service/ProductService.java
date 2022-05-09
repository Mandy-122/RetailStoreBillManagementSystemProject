package service;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import entity.User;
public interface ProductService {
	

	Optional<User> getUserById(String userId);
	public int addNewUser(String userName, Date dob, String mobileNumber, String emailId, String address);
}
