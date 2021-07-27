import java.io.*;
import java.util.*;

public class BSTrees {
  private TreeNode root;

  public BSTrees() {
    root = null;
  }

public void search(int key){
  TreeNode current = root;
  
  while (current != null){
    int currentValue = current.getData();
    if (currentValue == key){
       return;
  } else if (currentValue< key){
    current = current.getRight();
  } else {
    current = current.getLeft();
  }

}
}
public void insert(int key) {
    TreeNode newNode = new TreeNode(key);

    if (root == null) {
      root = newNode;
      return;
    }
    TreeNode front = root;
    TreeNode trailer;

    while (front != null) {
      int frontValue = front.getData();
      if (frontValue == key) {
        return;
      } else if (frontValue < key) {
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }
    if (key > front.getData()) {
      front.setRight(newNode);
    } else {
      front.setLeft(newNode);
    }

    
    // do we really want to return -1?
    return;
  }

  public void seed() {
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight(new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }

}