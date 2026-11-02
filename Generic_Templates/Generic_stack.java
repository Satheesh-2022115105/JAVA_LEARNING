package day11;

import java.util.Arrays;

public class Generic_stack<T> {
    //T[] arr;
    //A cleaner option is to declare the field as Object[] instead:
    Object[] arr;
    int top=-1;
    int default_size=10;

    public Generic_stack() {
        //arr=new T[default_size];Java doesn't allow you to create a generic type array
        //  directly because the actual type of T isn't available at runtime in the way Java
        //  needs to create that array.
        // For example, T might be Integer, String, or another type.
        arr=new Object[default_size];

    }
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==arr.length-1;
    }

    public void push(T item){
        if(isFull()){
            System.out.println("Stack Full");
        }
        else{
            arr[++top]=item;
        }
    }
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        else{
            return (T)arr[top--];
        }
    }
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return (T)arr[top];
    }

    public String toString(){
        //return Arrays.toString(arr);//this will display all elements even after pop 
        return Arrays.toString(Arrays.copyOf(arr, top+1 ));//displays array after pop,here top+1 beacuse
                                                        // its denotes length
    }
    
    
}
