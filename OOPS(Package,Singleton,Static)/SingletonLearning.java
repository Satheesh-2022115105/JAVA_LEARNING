package day7;

public class SingletonLearning {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}

class Singleton {

    private static Singleton instance =new Singleton();

    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

