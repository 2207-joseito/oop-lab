package bst;

import LaptopPackage.Laptop;

public class BSTree {
	private BSTNode root;
	private Boolean isStringCompare;
	
	public BSTree() {
		this.setRoot(null);
		this.isStringCompare = true;
	}
	
	public BSTree(Boolean isStringCompare) {
		this.setRoot(null);
		this.isStringCompare = isStringCompare;
	}
	
	public void insert(Laptop data) {
		BSTNode node = new BSTNode(data);

		if (this.root == null) {
			this.root = node;
			return;
		}
		
		BSTNode temp = this.root;
		while (temp != null) {
			int condition = this.isStringCompare 
					? temp.getData().getModel().compareTo(node.getData().getModel())
					: (temp.getData().getPrice() > node.getData().getPrice()) ? 1 : -1;
			
			if (condition > 0) {
				if (temp.getLeft() == null) {
					temp.setLeft(node);
					return;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(node);
					return;
				}
				temp = temp.getRight();
			}
		}
	}
	
	private void inorder(BSTNode node) {
		if (node == null)
			return;
		
		this.inorder(node.getLeft());
		System.out.println("\nModel: " + node.getData().getModel() + "\nPrice: " + node.getData().getPrice());
		this.inorder(node.getRight());
	}
	
	public void print() {
		this.inorder(this.root);
	}

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

}
