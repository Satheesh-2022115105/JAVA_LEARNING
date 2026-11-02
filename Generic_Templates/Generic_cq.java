package day11;
import java.util.*;
public class Generic_cq<T>{
    Object[] arr;
    int default_size=10;
    int front=-1;
    int rear=-1;

    public Generic_cq() {
        arr=new Object[default_size];
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return (rear+1)%arr.length==front;
    }
    public void enqueue(T item){
        if(isFull()){
            throw new IllegalStateException("Queue Full");
        }
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=item;
    }

    public T dequeue() {
    if (isEmpty()) {
        throw new RuntimeException("Queue is Empty");
    }

    T item = (T) arr[front];

    if (front == rear) {
        front = -1;
        rear = -1;
    } else {
        front = (front + 1) % arr.length;
    }

    return item;
}
    public String toString(){
        return Arrays.toString(arr);
    }
    
    
}
