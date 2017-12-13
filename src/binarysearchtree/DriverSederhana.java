
package binarysearchtree;

public class DriverSederhana {
    public static void main(String[] args) {
        BinarySearchTree bt =new BinarySearchTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        System.out.println(bt.contains(2));
        
    }
}
