package lyhyalyh;

public class area {
	public static void main(String[] args) {
		int a1=2,b1=6,c1=5;
		Pillar v1=new Pillar(a1,b1,c1);
		System.out.println(v1.getVolumn());
	}
}
class Shape {
	int dim1;
	int dim2;
	Shape(int a,int b){
		dim1=a;
		dim2=b;
	}
	void getArea(){
	}
}
class Trangle extends Shape{
	Trangle(int a, int b) {
		super(a, b);
		// TODO 自动生成的构造函数存根
	}
	int getArea(int d,int h){
		return d*h;
	}
}
class Rectangle extends Shape{

	Rectangle(int a, int b) {
		super(a, b);
		// TODO 自动生成的构造函数存根
	}
	int getArea(int d,int h){
		return d*h/2;
	}
}
class Pillar extends Shape{
	int h2;
	Pillar(int a, int b,int h2) {
		super(a, b);
		this.h2=h2;
	}
	int getVolumn(){
		return dim1*dim2*h2;
	}
}