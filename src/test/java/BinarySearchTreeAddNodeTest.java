// The purpose of this code segment is to provide test code for the insertKey() method in BinarySearchTreeAddNode.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTreeAddNodeTest {

// Test to insert one item into an empty tree.

@Test
public void InsertOneItem() {
  BinarySearchTreeAddNode bst = new BinarySearchTreeAddNode(); 
  bst.insertKey(45);
  assertEquals(45, bst.root.key);
}

// Test to insert two items into an empty tree.

@Test
public void InsertTwoItems() {
  BinarySearchTreeAddNode bst = new BinarySearchTreeAddNode(); 
  bst.insertKey(45);
  bst.insertKey(10); 
  assertEquals(45, bst.root.key);
  assertEquals(10, bst.root.left.key);

}

}

