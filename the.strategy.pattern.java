public class HelloWorld{
    
    public static abstract class Duck {
        FlyBehavior flyBehavior;

        public Duck() {}
          
        public abstract void display();
          
        public void performFly() {
            flyBehavior.fly();
        }
      
        public void swim() {
            System.out.println("All ducks float, even decoys!");
        }
      
        public void setFlyBehavior(FlyBehavior fb) {
            flyBehavior = fb;
        }
    }

    public interface FlyBehavior {
        public void fly();
    }
    
    
    public static class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying!!");
        }
    }
    
    public static class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can't fly.");
        }
    }
    
    public static class FlyRocketPowered implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying with a rocket!");
        }
    }
    
    public static class MallarDuck extends Duck {
        public MallarDuck() {
            flyBehavior = new FlyWithWings();
        }
      
        public void display() {
          System.out.println("I'm a mallar duck.");
        }
    }
    
    public static class ModelDuck extends Duck {
        public ModelDuck() {
            flyBehavior = new FlyNoWay();
        }
      
        public void display() {
            System.out.println("I'm a model duck.");
        }
    }
    
    public static void main(String []args) {
        
        Duck mallar = new MallarDuck();
        mallar.display();
        mallar.performFly();
        
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
