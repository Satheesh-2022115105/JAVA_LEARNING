package day8;
public class Method_overloading {
    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,char b){
        return a+(int)b;
    }
    int add(char a,int b){
        return (int)a+b;
    }
    
    
}
