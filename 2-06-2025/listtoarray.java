class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.listtoarray();
    }
}
    class Node{
    int data;
    Node next;
    Node(int data){ ;
        this.data = data;
        this.next = null;
    }
    }
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
    void insertEnd(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    else{
var temp=head;
while(temp.next!=null){
    temp=temp.next;
}
temp.next=newNode;
}
}
int length(){
int length_=0;
var temp=head;
while(temp!=null){
    length_=length_+1;
    temp = temp.next;
}
return length_;
}
 void print(){
        var temp = head;
        System.out.print("elements in the list are:");
        while(temp!=null){
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
 }
      Node gethead(){
          return head;
      }
      void listtoarray(){
          LinkedList list=new LinkedList();
          Node temp=head;
          int j = length();
          int[]arr=new int[j];
          while(temp!=null){
              for(int i=0;i<arr.length;i++){
                  arr[i]=temp.data;
                  System.out.print(arr[i] +",");
                  temp=temp.next;
              }
          }
          System.out.println("------"+arr[2]);
      }
}