
public class Triangle{
	private Vertex v1, v2, v3;
	
	
	public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		this.v1 = new Vertex(x1, y1);
		this.v2 = new Vertex(x2, y2);
		this.v3 = new Vertex(x3, y3);
	}
	
	public double get_Area() {
		return ((this.v1.get_x() * this.v2.get_y()) + (this.v1.get_y() * this.v3.get_x()) + (this.v2.get_x() * this.v3.get_y()) - (this.v2.get_y() * this.v3.get_x()) - (this.v1.get_y() * this.v2.get_x()) - (this.v1.get_x() * this.v3.get_y())) / 2;
	}
	
	
	public static void main(String[] args) {
		//Triangle t1 = new Triangle(-2,3,5,3,-1,6);
		Triangle t1 = new Triangle(2,3,4,5,3,3);
		
		System.out.println("El área del triangulo es " + t1.get_Area() + " m^2");
	}
}