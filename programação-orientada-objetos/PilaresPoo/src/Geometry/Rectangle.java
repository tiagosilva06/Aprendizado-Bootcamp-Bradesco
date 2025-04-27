package Geometry;

public record Rectangle(double height, double base) implements GeometricArea {

	@Override
	public double getArea() {
		return base * height;
	}

}
