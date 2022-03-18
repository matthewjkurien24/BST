package cs2725.p2;

/**
 * Node class for holding integer and directing binary search
 */
class Node {

	private int key;
	private Node parent;
	private Node leftChild;
	private Node rightChild;

	/**
	 * Construct a node with key -1, null parent, and null right/left node
	 */
	public Node() {
		this.key = -1;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	} // Node

	/**
	 * Construct a node with a predetermined key, null parent,
	 * and null right/left node
	 */
	public Node(int key) {
		this.key = key;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	} // Node(int key)

	/**
	 * Construct a node with a predetermined key, parent,
	 * and predetermined right/left node
	 */
	public Node(int key, Node parent, Node leftChild, Node rightChild) {
		this.key = key;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	} // Node(int key, Node parent, Node leftChild, Node rightChild)

	/**
	 * Return the integer key
	 */
	public int getKey() {
		return this.key;
	} // getKey

	/**
	 * Return Node's parent node
	 */
	public Node getParent() {
		return this.parent;
	} // getParent

	/**
	 * Return Node's right child
	 */
	public Node getLeft() {
		return this.leftChild;
	} // getLeft

	/**
	 * Return Node's left child
	 */
	public Node getRight() {
		return this.rightChild;
	} // getRight

	/**
	 * Set the integer key
	 */
	public void setKey(int key) {
		this.key = key;
	} // setKey

	/**
	 * Set Node's parent node
	 */
	public void setParent(Node node) {
		this.parent = node;
	} // setParent

	/**
	 * Set Node's right child
	 */
	public void setLeft(Node node) {
		this.leftChild = node;
	} // setLeft

	/**
	 * Set Node's left child
	 */
	public void setRight(Node node) {
		this.rightChild = node;
	} // setRight
} // Node


/**
 * Class representing the binary search tree object
 */
public class BST {

	private Node root;
	private int counter;

	/**
	 * Constructor for empty BST
	 */
	public BST() {
		this.root = null;
		this.counter = 0;
	} // BST

	/**
	 * Return number of elements within the tree
	 */
	public int size() {
		return this.counter;
	} // size

	/**
	 * Insert an element into the BST.
	 * Duplicates are not allowed.
	 * If duplicate found, print
	 * "Element is already in tree!"
	 */
	public void insert(int element) {
		Node node = this.root;
		boolean found = false;
		Node newNode = new Node(element);

		// Empty BST Case
		if (this.counter == 0) {
			this.root = newNode;
			this.counter++;
			found = true;
			return;
		} // if

		// Traverse BST
		while (found == false) {
			// Check Left
			if (element < node.getKey()) {
				if (node.getLeft() != null) {
					node = node.getLeft();
				} else {
					found = true;
				} // if else
			// Check Right
			} else if (element > node.getKey()) {
				if (node.getRight() != null) {
					node = node.getRight();
				} else {
					found = true;
				} // if else
			// Check Duplicate
			} else if (element == node.getKey()) {
				System.out.println("Element is already in tree!");
				found = true;
			} // if else if else if
		} // while not found
		// System.out.println(); // --------- Debug -----------

		// Add new element
		if (element < node.getKey()) {
			// Add Left
			node.setLeft(newNode);
			newNode.setParent(node);
			this.counter++;
		} else {
			// Add Right
			node.setRight(newNode);
			newNode.setParent(node);
			this.counter++;
		} // if else
	} // insert

	/**
	 * Remove specified element from the tree.
	 * If element not found, print
	 * "Element not found"
	 */
	public void delete(int element) {
		if (this.counter == 0) {
			// Empty Tree
			System.out.println("Element not found");
		} else if (this.counter == 1) {
			// Tree with 1 node
			if (this.root.getKey() == element) {
				this.root = null;
				this.counter = 0;
			} else {
				System.out.println("Element not found");
			} // if else
		} else {
			// Tree with more than 1 node
			Node node = this.root;
            boolean found = false;
            boolean notFound = false;
            // Traverse BST
            while (found == false) {
                // Check Left
                if (element < node.getKey()) {
                    if (node.getLeft() != null) {
                        node = node.getLeft();
                    } else {
                    	System.out.println("Element not found");
                        found = true;
                        notFound = true;
                    } // if else
                // Check Right
                } else if (element > node.getKey()) {
                    if (node.getRight() != null) {
                        node = node.getRight();
                    } else {
                    	System.out.println("Element not found");
                        found = true;
                        notFound = true;
                    } // if else
                // Check Duplicate
                } else if (element == node.getKey()) {
                    found = true;
                } // if else if else if
            } // while not found

            // Account for node not in tree and bypass this logic
            // Account for root deletion in each case
            // Delete Node
            if (notFound == false) {
            	if (node.getRight() == null && node.getLeft() == null) {
	            	// Node to delete is a leaf
	            	if (node == this.root) {
	            		root = null;
	            	} else {
	            		if (node.getParent().getKey() < element) {
							node.getParent().setRight(null);
						} else {
							node.getParent().setLeft(null);
						} // if else
	            	} // if else
					this.counter--;
				} else if (node.getLeft() != null && node.getRight() == null) {
					// Node to delete has one child on left
					if (node == this.root) {
						this.root = this.root.getLeft();
					} else {
						if (node.getParent().getKey() > element) {
							node.getParent().setLeft(node.getLeft());
						} else {
							node.getParent().setRight(node.getLeft());
						} // if else
					} // if else
					// Set Child's Parent and decrement
					node.getLeft().setParent(node.getParent());
					this.counter--;
				} else if (node.getRight() != null && node.getLeft() == null) {
					// Node to delete has one child on right
					if (node == this.root) {
						this.root = this.root.getRight();
					} else {
						if (node.getParent().getKey() > element) {
							node.getParent().setLeft(node.getRight());
						} else {
							node.getParent().setRight(node.getRight());
						} // if else
					} // if else
					// Set Child's Parent and decrement
					node.getRight().setParent(node.getParent());
					this.counter--;
				} else {
					// Node to delete has two children
					Node largest = largestHelper(node.getLeft());
					this.delete(largest.getKey());
					node.setKey(largest.getKey());
				}// if else if else if else
            } // if the element is not found
		} // if else if else
	} // delete

	/**
	 * Returns the node containing the largest key in the
	 * given subtree.
	 */
	public Node largest() {
		return largestHelper(this.root);
	} // largest

	/**
	 * Helper method for traversing to the largest key node
	 */
	public Node largestHelper(Node current) {
		boolean found = false;
		// Traverse for largest node
		while (found == false) {
			if (current.getRight() != null) {
				current = current.getRight();
			} else {
				found = true;
			} // if else
		} // while not found
		return current;
	} // largest

	/**
	 * Helper method for traversing to the smallest key node
	 */
	public Node smallestHelper(Node current) {
		boolean found = false;
		// Traverse for smallest node
		while (found == false) {
			if (current.getLeft() != null) {
				current = current.getLeft();
			} else {
				found = true;
			} // if else
		} // while not found
		return current;
	} // largest

	/**
	 * Print all elements according to preorder traversal
	 */
	public void preorder() {
		preorderHelper(this.root);
	} // preorder

	/**
	 * Traverse the tree in preorder recursively
	 */
	private void preorderHelper(Node current) {
		if (current == null) {
			return;
		} else {
			System.out.print(current.getKey() + " ");
			preorderHelper(current.getLeft());
			preorderHelper(current.getRight());
		} // if else
	} // preorderHelper

	/**
	 * Print all elements according to postorder traversal
	 */
	public void postorder() {
		postorderHelper(this.root);
	} // postorder

	/**
	 * Traverse the tree in postorder recursively
	 */
	private void postorderHelper(Node current) {
		if (current == null) {
			return;
		} else {
			postorderHelper(current.getLeft());
			postorderHelper(current.getRight());
			System.out.print(current.getKey() + " ");
		} // if else
	} // postorderHelper

	/**
	 * Print all elements according to inorder traversal
	 */
	public void inorder() {
		inorderHelper(this.root);
	} // preorder

	/**
	 * Traverse the tree inorder recursively
	 */
	private void inorderHelper(Node current) {
		if (current == null) {
			return;
		} else {
			inorderHelper(current.getLeft());
			System.out.print(current.getKey() + " ");
			inorderHelper(current.getRight());
		} // if else
	} // inorderHelper
} // BST