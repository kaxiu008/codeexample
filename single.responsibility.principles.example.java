import java.lang.Math.*;
import java.util.*;

public class HelloWorld{
    
    public static class Square
    {
        public Integer length;
        
        public Square(Integer length)
        {
            this.length = length;
        }
    }
    
    public static class Circle
    {
        public Integer radius;
        
        public Circle(Integer radius)
        {
            this.radius = radius;
            System.out.println("radius of a new Circle is: " + this.radius);
        }
    }
    
    public static class Caculator
    {
        public Object shapes[];
        
        //List<Double> areas = new ArrayList<Double> ();  output will run sum() again, and areas will have duplicate objects, unless it's been created in sum() scope. 
        
        public Caculator(Object shapes[])
        {
            this.shapes = shapes;
            //System.out.println(this.shapes);
        }
        
        public String sum()
        {
            List<Double> areas = new ArrayList<Double> (); 
            
            for(Object shape : this.shapes){
                if(shape instanceof Square) {
                    Square s = (Square)shape;
                    areas.add(Math.pow(s.length, 2));
                }  else if (shape instanceof Circle) {
                    Circle c = (Circle)shape;
                    areas.add(Math.PI*Math.pow(c.radius, 2));
                }
            }
            
            Double sum = 0.0;
            sum = areas.stream()
            .mapToDouble(a -> a)
            .sum();

            return sum.toString(); 

        }
        
        public String output()
        {
            return "Sum of the areas of provided shapes: " + this.sum();
        } 
    } 

    public static void main(String []args){
        Object shapes[] = {
            new Circle(2),
            new Square(5),
            new Square(6),
        };
        
        Caculator areas = new Caculator(shapes);

        System.out.println("this is the output(): " + areas.output());
    }
    
}
