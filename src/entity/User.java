package entity;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class User {
	private String userId;
	private String userName;
	private Date dob;
	private String mobileNumber;
	private String emailId;
	private String userAddress;
	

}
