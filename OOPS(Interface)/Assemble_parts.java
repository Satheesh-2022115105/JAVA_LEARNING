package day10;

public class Assemble_parts {
     private Engine engine;
     private Brake br;
     private Media mp;

    public Assemble_parts() {
        engine=new Diesel_engine();
        br=new Brake_fn();
        mp=new Mediaplayer();
    }

    public Assemble_parts(Engine engine, Brake br, Media mp) {
        this.engine = engine;
        this.br = br;
        this.mp = mp;
    }
    public void start(){
        engine.start();

    }
    public void stop(){
        engine.stop();
    }
    public void accelarate(){
        engine.accelarate();
    }
    public void brake(){
        br.brake();
    }
    public void emergency_brake(){
        br.emergency_brake();
    }
    public void mpstart(){
        mp.start();
    }
    public void mpstop(){
        mp.stop();
    }
    public void next(){
        mp.next();
    }
    public void previous(){
        mp.previous();
    }

     
    
}
