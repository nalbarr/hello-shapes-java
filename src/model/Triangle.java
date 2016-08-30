package model;

public class Triangle extends Shape {
  private Double _base;
  private Double _height;
  
  public Triangle(String name, Double base, Double height) {
	  super(name);
	  _base = base;
	  _height = height;
  }
  
  public Double getSize() {
	  return 0.5 * _base * _height;
  }
}