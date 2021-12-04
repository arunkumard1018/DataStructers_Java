package DataStructers;

public class BST {
    public static void inorderTraverse(BTNode root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.leftChild);
        System.out.print(root.data+" ");
        inorderTraverse(root.rightChild);
    }
    public static BTNode insertBST(BTNode root, int data) {
        if(root == null){
            return new BTNode(data);
        }
        if (data < root.data) {
            root.leftChild = insertBST(root.leftChild,data);
        }
        else {
            root.rightChild = insertBST(root.rightChild,data);
        }
        return root;
    }

    // recursive Search
    public static boolean search(BTNode root, int key) {
        if (root == null) {
            return false;
        }
        if(key == root.data){
            return true;
        }
        if (key < root.data) {
            return search(root.leftChild,key);
        }
        return search(root.rightChild,key);
    }

    //Itrative Search
    public static boolean SearchBST_Itr(BTNode root, int key) {
        BTNode temp = root;
        while (temp != null) {
            if (key == temp.data) {
                return true;
            }
            if (key < temp.data) {
                temp = temp.leftChild;
            }else{
                temp = temp.rightChild;
            }
        }
        return false;
    }

    public static BTNode deleteBST(BTNode root, int key) {
        if(key< root.data){
            root.leftChild = deleteBST(root.leftChild,key);
        } else if (key > root.data) {
            root.rightChild = deleteBST(root.rightChild,key);
        }else{
            if(root.leftChild == null){
                BTNode temp = root.rightChild;
                return temp;
            } else if (root.rightChild == null) {
                return root.rightChild;
            }else{
                BTNode temp = InorderSuccesr(root.rightChild);
                root.data = temp.data;
                root.rightChild = deleteBST(root.rightChild,temp.data);
            }
        }
        return root;
    }

    public static BTNode InorderSuccesr(BTNode root) {
        BTNode curr = root;
        while (curr != null && curr.leftChild != null) {
            curr =curr.rightChild;
        }
        return curr;
    }

}
