
public class Rectangle extends Shape{
	double lengh;
	double width;
	
	public Rectangle(String color, double lengh, double width) {
		super(color); // 부모클래스의 생성자 호출
		System.out.println("Rectangle 클래스의 생성자 호출");
		this.lengh = lengh;
		this.width = width;
	}
	
	// 추상 매서드를 정의
	double area() {
		return lengh * width;
	}
	public String toString() {
		return "사각형 색상은 " + super.getColor() +
				" 그리고 면적은 " + area();
	}

}
