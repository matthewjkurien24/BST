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
	public void insert(int element) throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // insert

	/**
	 * Remove specified element from the tree.
	 * If element not found, print
	 * "Element not found"
	 */
	public void delete(int element) throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // delete

	/**
	 * Print all elements according to preorder traversal
	 */
	public void preorder() throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // preorder

	/**
	 * Traverse the tree in preorder recursively
	 */
	public void preorderHelper(Node current) throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // preorderHelper

	/**
	 * Print all elements according to postorder traversal
	 */
	public void postorder() throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // preorder

	/**
	 * Traverse the tree in postorder recursively
	 */
	public void postorderHelper(Node current) throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // postorderHelper

	/**
	 * Print all elements according to inorder traversal
	 */
	public void inorder() throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // preorder

	/**
	 * Traverse the tree inorder recursively
	 */
	public void inorderHelper(Node current) throws NoSuchMethodException {
		throw new NoSuchMethodException("Implement");
	} // inorderHelper



} // BST