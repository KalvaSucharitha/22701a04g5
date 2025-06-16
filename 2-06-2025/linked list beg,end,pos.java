class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
       list.insertEnd(10);
       list.insertEnd(20);
       list.insertEnd(30);
       list.insertEnd(50);
       list.insertBeg(100);
       list.insertPos(63,1);
       list.insertPos(02,3);
       list.insertPos(52,5);
       Node temp =list.head;
        System.out.print("The linked list elements are:");
       while(temp!=null){
           System.out.print( +temp.data+ ",");
           temp = temp.next;
       }
    }
}
class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
void insertBeg(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
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
void insertPos(int data,int pos){
int length1 = length();
Node newNode = new Node(data);
if(pos>=0 && pos<=length1){
    if(pos ==0){
        insertBeg(data);
    }
    else if(pos==length1){
        insertEnd(data);
    }else {
        var temp = head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    }
    else{
        System.out.println("the pos is invalid:");
    }
    } void print(){
        var temp = head;
        System.out.println("elements in the list are:");
        while(temp!=null){
            System.out.println(temp.data + "---->");
            temp = temp.next;
        }
        System.out.print("null \n");
    }
    }

