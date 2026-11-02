package day7;
public class Static_var_learning {
    public static void main(String[] args) {
       Project p1=new Project("Arc",1);
       Project p2=new Project("qwert", 2) ;
       System.out.println(Project.total_count);
       Project.display1();
       p1.display();
       p2.display();
    }
    
}
class Project{
    String Teamname;
    int teamid;
    static int total_count;

   
    
    Project(String Teamname,int teamid){
        this.Teamname=Teamname;
        this.teamid=teamid;
        Project.total_count+=1;
    }
     static void display1(){
        System.out.println("static Display fn");
        //System.out.println(this.teamid); not possible because u cannot access non-static var in static fn
       System.out.println(total_count);
       
       

    }
    void display(){
        System.out.println("non static display fn");
       System.out.println(this.teamid);
       System.out.println(this.Teamname);
       System.out.println(Project.total_count);

    }
}
