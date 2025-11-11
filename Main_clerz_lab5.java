// Node class 
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// BST class
class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

// Inorder 
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

// Preorder
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
//Postorder
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

 //Search for a value
    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    // Delete key
    void deleteKey(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null) return root;

        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

  // Find minimum value
    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    
  // Path from root to value
    void path(int data) {
        pathRec(root, data);
        System.out.println();
    }

   boolean pathRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            System.out.print(root.data);
            return true;
        }
        if (data < root.data) {
            if (pathRec(root.left, data)) {
                System.out.print(" -> " + root.data);
                return true;
            }
        } else {
            if (pathRec(root.right, data)) {
                System.out.print(" -> " + root.data);
                return true;
            }
        }
        return false;
    }
}

class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
      BST lab5Tree = new BST();
      
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
      int[] insertedValues = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
      for (int value : insertedValues) {
          lab5Tree.insert(value);
      }
      
    // Delete the value 17.
      lab5Tree.deleteKey(17);
      
    // Traverse and output the values using inorder (sorted).
      System.out.print("\nInorder Traversal: ");
      lab5Tree.inorder();
      System.out.println();

    // Traverse and output the values using postorder.
      System.out.print("Postorder Traversal: ");
      lab5Tree.postorder();
      System.out.println();

    // Traverse and output the values using preorder.
      System.out.print("Preorder Traversal: ");
      lab5Tree.preorder();
      System.out.println();

    // Display the result of a search for the value 36.
      System.out.println("\nSearch for 36: " + lab5Tree.search(36));

    // Display the result of a search for the value 37.
      System.out.println("Search for 37: " + lab5Tree.search(37));

    // Using the path() method, display the path from the root to 2.
      System.out.print("\nPath to 2: ");
      lab5Tree.path(2);

    // Display the path from the root to 34.
      System.out.print("Path to 34: ");
      lab5Tree.path(34);
  }
}