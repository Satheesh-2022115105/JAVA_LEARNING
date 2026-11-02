package day6;

public class Constructor_learning {
   public static void main(String[] args) {
    Students s1=new Students();
    s1.intro();
    Students s2=new Students(11,"AJAY",93.7f);
    System.out.println(s2.name+" "+s2.rollno+" "+s2.marks);
    
    //reference
    Students s3=s2;
    s3.name="vijay";
    System.out.println(s2.name); 

    //copy constructor
    Students s4=new Students(s2);
    System.out.println(s4.marks);

    s4.changemark(99.9f);
    System.out.println("Changed mark: "+s4.marks);
   }
}

   
 class Students{
    int rollno;
    String name;
    float marks;

    Students(){
       System.out.println("Objected Created");
       this(0,"default name",0.0f);
    }
    
    Students(Students other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
    }
    Students(int rollno,String name,float marks){
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }

    public void intro(){
        System.out.println("My Name is:"+name);
    }
    public void changemark(float marks){
        this.marks=marks;
    }
}



