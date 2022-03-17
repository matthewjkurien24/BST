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













	} // main
} // Test