package day11;
import java.util.*;
public class Generic_queue<T> {
    Object[] arr;
    int default_size=10;
    int rear=-1;
    int front =0;

    public Generic_queue() {
        arr=new Object[default_size];
    }

    public boolean isEmpty(){
        return front>rear;
    }
    public boolean isFull(){
        return rear==arr.length-1;
    }
    public void enqueue(T item){
        if(isFull()){
            throw new RuntimeException("Queue is Full");
        }
        arr[++rear]=item;
    }
    public T dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return (T)arr[front++];
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(arr, front, rear+1));
    }
    
    
}
