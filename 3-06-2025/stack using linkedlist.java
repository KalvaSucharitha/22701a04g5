class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    this.next=null;
   } 
}
class Stack {
    Node top;
    Stack(){
    this.top=null;
}
boolean isEmpty(){
    return (top==null);
}
void push(int val){
    Node newNode=new Node(val);
    newNode.next=top;
    top=newNode;
}
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
    }
    int peak(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
    void print(){
        Node temp=top;
        System.out.println("Stack contents(top to bottom):");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    int length(){
        int length=0;
        Node temp=top;
        while(temp!=null){
            length++;
        temp=temp.next;
        }
    return length;
    }
}
class Main {
    public static void main(String[] args) {
       Stack stack=new Stack();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
       int val=stack.pop();
       System.out.println("removed value:" +val);
       stack.print();
       System.out.println("length of stack:" +stack.length());
       System.out.println(stack.peak());
    }
}