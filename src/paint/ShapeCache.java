
package paint;


public class ShapeCache {
    public MyShape getShape(String shape,double x1,double y1,double x2,double y2){
        //if(shape.equalsIgnoreCase("triangle"))  return new Triangle();
        if(shape.equals("rectangle")) return new Rectangle(x1,y1,x2,y2);
        if(shape.equals("square"))    return new Square(x1,y1,x2,y2);
        if(shape.equals("circle"))    return new Circle(x1,y1,x2,y2);
        if(shape.equals("ellipse"))   return new Ellipse(x1,y1,x2,y2);
        if(shape.equals("line"))      return new Line(x1,y1,x2,y2);
        if(shape.equals("triangle"))  return new Triangle(x1,y1,x2,y2);
        return null;
    }
}
