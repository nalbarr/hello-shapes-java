package model;

public class Square extends Shape {
  private Double _side;
	
  public Square(String name, Double side) {
	  super(name);
	  _side = side;
  }
  
  public Double getSize() {
	  return _side * _side;
  }  
}