package model;

public abstract class Shape {
	protected String _name;
	protected Double _size;
	
	public Shape(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public Double getArea() {
		return _size;
	}
}
