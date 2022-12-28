public class binaryTree {
    node root;
    class node{
        int data;
        node left,right;
        node(int d){
            this.data=d;
            left = null;
            right = null;
        }
    }
    public void insert(int value){
        root = insert(root,value);
    }
    public node insert(node root,int value){
        if(root==null){
            root = new node(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }
    public void postorder(){
        postorder(root);
    }
    public void postorder(node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    public void preorder(){
        preorder(root);
    }
    public void preorder(node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    } 
    public static void main(String args[]){
        binaryTree b = new binaryTree();
        b.insert(9);
        b.insert(4);
        b.insert(2);
        b.insert(8);
        b.insert(10);
        System.out.println("preorder traversal : ");
        b.preorder();
        System.out.println("inorder traversal : ");
        b.inorder();
    }    
}
