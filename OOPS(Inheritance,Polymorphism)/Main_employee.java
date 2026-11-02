package day8;
public class Main_employee {
    public static void main(String[] args) {
        Employee sd=new Senior_developer("java","Ragul",3);
        //can access only parents methods ie displayname
        sd.displayName();
        Senior_developer  s=(Senior_developer )sd;
        //downcast can access all
        s.displayName();
        s.displayLanguage();
        
        s.displayexp();
        
    }
    
}
