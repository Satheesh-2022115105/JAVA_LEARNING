package day10;

public class Electric_engine implements Engine{


    @Override 
    public void start(){
        System.out.println("Electric car started");
    }
    @Override 
    public void stop(){
        System.out.println("Electric car stopped");
    }
    @Override 
    public void accelarate(){
        System.out.println("Electric car accelarated");
    }
    
    
}

    

