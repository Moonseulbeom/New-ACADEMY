package kr.s11.array;

public class Book {
	//멤버변수
	private String category;//분류
	private String name;//책이름
	private int price;//가격
	private double discount;//할인율
	

	//생성자
	public Book() {}
	public Book(String category, String name, int price, double discount) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.discount =discount;
	}
	
	//멤버메서드
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
