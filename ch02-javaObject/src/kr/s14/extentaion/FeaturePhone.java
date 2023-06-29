package kr.s14.extentaion;

//자식클래스에 부모클래스를 상속
public class FeaturePhone extends Phone {
	private int pixel;//사진 화소수_사진 특화폰
	
	public FeaturePhone(String number, String model, String color, int pixel) {
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;	
	}
	
	public int getPixel() {
		return pixel;
	}

}//FeaturePhone
