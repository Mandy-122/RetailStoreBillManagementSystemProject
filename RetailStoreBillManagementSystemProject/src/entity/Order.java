package entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Order {
	private String orderId;
	private String userId;
	private String userName;
	private List<Product> productsList;
	private double totalAmount;
	

}
