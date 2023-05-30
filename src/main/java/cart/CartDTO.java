package cart;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartDTO {
	private int id;
	private String customer_id;
	private int product_id;
	private String product_name;
	private int product_price;
}
