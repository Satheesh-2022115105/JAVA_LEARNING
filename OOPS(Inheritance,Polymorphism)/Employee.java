package day8;

 public class Employee {
    String name;

    public Employee(String name) {
        System.out.println("Employee method constructor called");
        this.name = name;
        
        
        
    }
    public void displayName(){
        System.out.println("Employee name: "+name);
    } 

}

class Developer extends Employee{
    String language;

    public Developer( String name, String language) {
          System.out.println("DEveloper constructor called");
        super(name);
        this.language = language;
      
        
        
        
    }
    void displayLanguage(){
        System.out.println("Language is: "+language);
    }
    
}
class Senior_developer extends Developer{
    int experience;
    public Senior_developer(String language,String name,int experience){
        System.out.println("Seniordeveloper constructoor called");
        super(name,language);
        this.experience=experience;
        
         
       
    }
    void displayexp(){
        System.out.println("Experience  in yrs: "+experience);
    }
}

