package day10;
public class Diesel_engine implements Engine{

    @Override 
    public void start(){
        System.out.println("Diesel car started");
    }
    @Override 
    public void stop(){
        System.out.println("Diesel car stopped");
    }
    @Override 
    public void accelarate(){
        System.out.println("Diesel car accelarated");
    }
    
    
}
