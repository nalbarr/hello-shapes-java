package model;

public class Square extends Shape {
  private Double _side;
	
  public Square(String name, Double side) {
	  super(name);
	  _side = side;
  }
  
  public Double getArea() {
	  return _side * _side;
  }  
}