package es.ull.esit.pai.exposition.FactoryMethod;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
