package binarySearchTree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root == null) {
            return null;
        }
        return root.get(value);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return null;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            } else {
                // Caso temos um nó com dois filhos, primeiro substitui o valor em subtreeRoot com o menor valor da árvore a direita
                subtreeRoot.setData(subtreeRoot.getRightChild().min());
                // Depois apaga o nó original que tinha o menor valor da árvore a direita
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
            }
        }
        return subtreeRoot;
    }

    public int min() {
        return root == null ? Integer.MIN_VALUE : root.min();
    }

    public int max() {
        return root == null ? Integer.MAX_VALUE : root.max();
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }
}
