public class Main{
    public static void main(String[] args){
        Tree t =new Tree(new int[] {1,2,4,-1,-1,5,7,-1,8,-1,-1,-1,3,9,11,-1,-1,10,-1,-1,-1});
        Node root=t.getroot();
        int heightofroot=Tree.heightofroot(root);
        System.out.println("height of tree is"+Tree.heightofroot(root));
     }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
    Tree(int[]nodes){
        this.root=buildTreeUsingArray(nodes);
        System.out.println(index);
    }
    public Node buildTreeUsingArray(int[]nodes){
        index++;
        if(index>=nodes.length){
            return null;
        }
        if(nodes[index]==-1)
        return null;
        Node newNode=new Node(nodes[index]);
        newNode.left=buildTreeUsingArray(nodes);
        newNode.right=buildTreeUsingArray(nodes);
        return newNode;
    }
    public static int heightofroot(Node root){
        if(root==null)
        return 0;
        int lh=heightofroot(root.left);
        int rh=heightofroot(root.right);
        return Math.max(lh,rh)+1;
    }
    Node getroot(){
        return root;
    }
}
