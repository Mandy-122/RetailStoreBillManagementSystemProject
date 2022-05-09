package persistance;

import java.sql.Date;
import java.util.Optional;

import entity.User;

public interface ProductDao {

	public Optional<User> getUserById(String userId);
	public int createNewUser(String userName, Date dob, String mobileNumber, String emailId, String address);
}

