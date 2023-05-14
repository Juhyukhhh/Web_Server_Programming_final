package dto;

public class ReviewDTO {
	private int review_num;
	private String id;
	private int product_num;
	private String review_date;
	private int rate;
	private String content;
	private boolean isDeleted;
	
	public ReviewDTO(int review_num, String id, int product_num, String review_date, int rate, String content, boolean isDeleted) {
		this.review_num = review_num;
		this.id = id;
		this.product_num = product_num;
		this.review_date = review_date;
		this.rate = rate;
		this.content = content;
		this.isDeleted = isDeleted;
	}
	
	public int getReview_num() {
		return review_num;
	}
	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public String getReview_date() {
		return review_date;
	}
	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
