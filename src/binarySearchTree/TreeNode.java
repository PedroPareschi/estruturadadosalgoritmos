package binarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int data) {
        if (data == this.data) {
            return;
        }
        if (data < this.data) {
            if (leftChild == null) {
                leftChild = new TreeNode(data);
            } else {
                leftChild.insert(data);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(data);
            } else {
                rightChild.insert(data);
            }
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            return leftChild == null ? null : leftChild.get(value);
        } else {
            return rightChild == null ? null : rightChild.get(value);
        }
    }

    public int min() {
        return leftChild == null ? data : leftChild.min();
    }

    public int max() {
        return rightChild == null ? data : rightChild.max();
    }

    public void traversePreOrder() {
        System.out.println(this);
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.println(this);
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
