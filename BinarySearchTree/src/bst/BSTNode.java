package bst;

import LaptopPackage.Laptop;

public class BSTNode {
	private Laptop data;
	private BSTNode left, right;
	
	public BSTNode(Laptop data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Laptop getData() {
		return data;
	}

	public void setData(Laptop data) {
		this.data = data;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}
	
	
}
