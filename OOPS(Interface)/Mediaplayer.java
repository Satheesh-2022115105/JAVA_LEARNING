package day10;

public class Mediaplayer implements Media{
    @Override 
    public void start(){
        System.out.println("Music started");
    }
    @Override 
    public void stop(){
        System.out.println("Music stopped");
    }
    @Override 
    public void next(){
        System.out.println("Music switched to next song");
    }
    @Override 
    public void previous(){
        System.out.println("Music switched to previous song");
    }
}
