package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {
	private int prouduct_id;
	private String name_of_product;
	private int category_id;
	private int stock_available;
	private double price;

}
