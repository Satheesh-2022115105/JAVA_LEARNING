package day10;

public class Brake_fn implements Brake {
    @Override 
    public void brake(){
        System.out.println("Brake applied");
    }
    @Override 
    public void emergency_brake(){
        System.out.println("Emergency brake applied");
    }
    
}
