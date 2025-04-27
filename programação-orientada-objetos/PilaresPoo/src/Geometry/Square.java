package Geometry;

public record Square(double side) implements GeometricArea {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
