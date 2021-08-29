import java.lang.Math.*;
import java.util.*;

public class HelloWorld{
    
    public static class Square
    {
        public Integer length;
        
        public Square(Integer length)
        {
            this.length = length;
            System.out.println("length of a new Square is: " + this.length);
        }
        
        public Integer getLength()
        {
            return length;
        }
        
        public void test(){
            System.out.println("This is a test");
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
                    System.out.println("1");
                    //System.out.println(shape);
                    //System.out.println(shape.length);
                    //System.out.println((Square)shape.length);
                    Square s = (Square)shape;
                    System.out.println(s);
                    System.out.println(s.length);
                    areas.add(Math.pow(s.length, 2));
                }  else if (shape instanceof Circle) {
                    System.out.println("2");
                    //System.out.println(shape);
                    Circle c = (Circle)shape;
                    System.out.println(c);
                    System.out.println(c.radius);
                    areas.add(Math.PI*Math.pow(c.radius, 2));
                }
            }
            
         /*   Double sum = 0.0;
            for(Double d : areas)
                sum += d;
            System.out.println("this is the sum(): " + sum.toString()); 
            return sum.toString(); */
            
            Double sum = 0.0;
            sum = areas.stream()
            .mapToDouble(a -> a)
            .sum();

            //System.out.println(sum); 
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
        
        Square s2 = new Square(7);
        Circle c1 = new Circle(4);
        Square s1 = new Square(3);
        System.out.println(s1);
        System.out.println(s1.length);
        System.out.println(s1.getLength());
        
        Object shapes1[] = new Object[]{c1, s1, s2,};
        
        Caculator areas = new Caculator(shapes);
        
        //Date now = new Date();
        //System.out.println("now: " + now);
        //System.out.println("Hello World");
        //System.out.println(shapes[1].test());
        System.out.println("this is new Caculator object: " + areas);
        System.out.println("this is the sum(): " + areas.sum());
        System.out.println("this is the output(): " + areas.output());
    }
    
}
