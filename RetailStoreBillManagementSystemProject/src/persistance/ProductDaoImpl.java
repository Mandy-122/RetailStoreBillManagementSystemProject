package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import entity.Category;
import entity.Product;
import entity.User;

public class ProductDaoImpl implements ProductDao {

	@Override
	public Optional<User> getUserById(String userId) {
		// TODO Auto-generated method stub

		User user = null;
		PreparedStatement preparedStatement = null;
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://127.0.0.1:3306/retailstorebillmanagementsystem", "root", "wiley");) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			preparedStatement = connection.prepareStatement("SELECT * FROM USER WHERE user_id = ? ;");

			preparedStatement.setString(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String userID = resultSet.getString("user_id");
				String userName = resultSet.getString("user_name");
				String phoneNumber = resultSet.getString("phone_number");
				String emailId = resultSet.getString("email_id");
				Date dob = resultSet.getDate("date_of_birth");
				String address = resultSet.getString("address");
				user = new User(userId, userName, dob, phoneNumber, emailId, address);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Optional<User> optionalUser = Optional.ofNullable(user);
		return optionalUser;
	}

	@Override
	public int createNewUser(String userName, Date dob, String mobileNumber, String emailId, String address) {
		int rows = 0;
		PreparedStatement preparedStatement = null;
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_system", "root",
				"wiley");) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement = connection.prepareStatement(
					"INSERT INTO USERS(USER_NAME, PHONE_NUMBER, EMAIL_ID,DATE_OF_BIRTH, ADDRESS) VALUES (?,?,?,?,?)");
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, mobileNumber);
			preparedStatement.setString(3, emailId);
			preparedStatement.setDate(4, (java.sql.Date) dob);
			preparedStatement.setString(5, address);

			rows = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			rows = 0;
		} catch (SQLException e) {
			rows = 0;
		}
		return rows;
	}

}
