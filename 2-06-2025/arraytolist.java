class Main{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        Node head = LinkedList.arraytolist(nums);
        LinkedList list = new LinkedList();
        list.head=head;
        list.print();
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
      static Node arraytolist(int[]nums){
          LinkedList list = new LinkedList();
          for(int i=0;i<nums.length;i++){
              list.insertEnd(nums[i]);
      }
      return list.gethead();
}
}



