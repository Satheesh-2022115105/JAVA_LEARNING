package day7;
//import if file from another package like import day8.Classname
public class Package_import {
    public static void main(String[] args) {
        System.out.println("Checking");
        Package_another.calling_fun_from_another_package();
    }
}
