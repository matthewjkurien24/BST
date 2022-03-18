package cs2725.p2;
import cs2725.p2.Node;
import cs2725.p2.BST;

public class Test {
	public static void main(String[] args) {


		boolean nodeDebug = true;
		boolean bstDebug = true;


		// Ok actual test cases tho
		System.out.println("\nTesting: \n");


		if (nodeDebug == true) {
			// node class test
			// empty node
			System.out.println("Node Tests:");
			Node node = new Node();
			System.out.print("Empty node getKey() Test: ");
			if (node.getKey() == -1) {
				System.out.println("OK");
			} else {
				System.out.println("Failed, key=" + node.getKey());
			} // if else

			// setKey test
			System.out.print("Empty node setKey(5), getKey() Test: ");
			int keyTest = 5;
			node.setKey(5);
			if (node.getKey() == 5) {
				System.out.println("OK");
			} else {
				System.out.println("Failed, key=" + node.getKey());
			} // if else
			System.out.print("Node setKey(20), getKey() Test: ");
			keyTest = 20;
			node.setKey(20);
			if (node.getKey() == 20) {
				System.out.println("OK");
			} else {
				System.out.println("Failed, key=" + node.getKey());
			} // if else


			// set left child and get left child test
			System.out.print("setLeft(Node node) and getLeft() Test: ");
			Node nodeLeft = new Node();
			node.setLeft(nodeLeft);
			if (node.getLeft().equals(nodeLeft)) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else

			// set right child and get right child test
			System.out.print("setRight(Node node) and getRight() Test: ");
			Node nodeRight = new Node();
			node.setRight(nodeRight);
			if (node.getRight().equals(nodeRight)) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else

			// set parent and get parent test
			System.out.print("setParent(Node node) and getParent() Test: ");
			nodeLeft.setParent(node);
			nodeRight.setParent(node);
			if (nodeLeft.getParent().equals(nodeRight.getParent())) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else


			// Node(int key, Node parent, Node leftChild, Node rightChild) test
			System.out.println("\nNode(int key, Node parent, Node leftChild, Node rightChild) Tests:");
			Node nodeP = new Node(6);
			Node nodeL = new Node(2);
			Node nodeR = new Node(7);
			Node nodeTest = new Node(5, nodeP, nodeL, nodeR);
			System.out.print("getLeft() Test: ");
			if (nodeTest.getLeft().equals(nodeL) && nodeTest.getLeft().getKey() == 2) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else

			System.out.print("getRight() Test: ");
			if (nodeTest.getRight().equals(nodeR) && nodeTest.getRight().getKey() == 7) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else

			System.out.print("getParent() Test: ");
			if (nodeTest.getParent().equals(nodeP) && nodeTest.getParent().getKey() == 6) {
				System.out.println("OK");
			} else {
				System.out.println("Failed");
			} // if else

		}
		
		


		// BST tests
		// Empty BST
		System.out.println("\n\nBST Tests:");
		BST bst = new BST();
		System.out.print("Empty BST Test: ");
		if (bst.size() == 0) {
			System.out.println("OK");
		} else {
			System.out.println("Failed, Size=" + bst.size());
		} // if else

		/** Insert Debugging
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);
		bst.insert(11);
		bst.insert(5);

		BST bst1 = new BST();
		bst1.insert(5);
		bst1.insert(10);
		bst1.insert(15);
		bst1.insert(7);
		bst1.insert(20);

		System.out.println("\nNew");

		BST bst2 = new BST();
		bst2.insert(20);
		bst2.insert(10);
		bst2.insert(5);
		bst2.insert(3);
		bst2.insert(7);
		bst2.insert(15);
		bst2.insert(13);
		bst2.insert(17);
		bst2.insert(30);
		bst2.insert(25);
		bst2.insert(23);
		bst2.insert(27);
		bst2.insert(35);
		bst2.insert(33);
		bst2.insert(37);
		*/

		BST bst1 = new BST();
		bst1.insert(8);
		bst1.insert(3);
		bst1.insert(1);
		bst1.insert(6);
		bst1.insert(4);
		bst1.insert(7);
		bst1.insert(10);
		bst1.insert(14);
		bst1.insert(13);


		bst1.preorder();

		//System.out.println();

		//bst1.getLargest();
		//Node nodeLargest = bst1.largest();
		//System.out.println(nodeLargest.getKey());



		System.out.println();
		BST bst2 = new BST();
		bst2.insert(60);
		bst2.insert(20);
		bst2.insert(100);
		bst2.insert(80);
		bst2.insert(120);
		bst2.preorder();


		System.out.println("\nNew Tests");
		BST tree = new BST();

        tree.insert(4);

        tree.insert(5);

        tree.insert(2);

        tree.insert(9);

        tree.insert(6);

        tree.insert(11);

        tree.insert(10);

        tree.insert(8);

        tree.insert(1);

        tree.insert(14);

        System.out.println("Example 1: preorder traversal");

        System.out.println("Expected:\t" + "4 2 1 5 9 6 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        System.out.println("\nExample 2: postorder traversal");

        System.out.println("Expected:\t" + "1 2 8 6 10 14 11 9 5 4");

        System.out.print("Your Tree:\t");

        tree.postorder();

        System.out.println("\nExample 3: inorder traversal");

        System.out.println("Expected:\t" + "1 2 4 5 6 8 9 10 11 14");

        System.out.print("Your Tree:\t");

        tree.inorder();

        tree.delete(1);

        System.out.println("\nExample 4: preorder traversal after a deleting a "

                           + "leaf");

        System.out.println("Expected:\t" + "4 2 5 9 6 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        tree.delete(6);

        System.out.println("\nExample 5: preorder traversal after a deleting a "

                           + "node with one child");

        System.out.println("Expected:\t" + "4 2 5 9 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        tree.delete(8);

        System.out.println("\nExample 6: preorder traversal after a deleting a "

                           + "node with two children");

        System.out.println("Expected:\t" + "4 2 5 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        System.out.println("\nExample 7: size of the tree after insertions and "

                           + "deletions");

        System.out.println("Expected:\t" + "7");

        System.out.println("Your Tree:\t" + tree.size());
		









	} // main
} // Test