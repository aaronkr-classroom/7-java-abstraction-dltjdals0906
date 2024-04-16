
public class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color); // 부모클래스의 생성자 호출
		System.out.println("Circle 클래스의 생성자 호출");
		this.radius = radius;
	}
	
	// 추상 매서드를 정의
	double area() {
		return radius * radius * 3.14; // Math에서 PI변수 있다.
	}
	public String toString() {
		return "원 색상은 " + super.getColor() +
				" 그리고 면적은 " + area();
	}

}
