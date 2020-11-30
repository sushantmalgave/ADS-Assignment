
class Node{
    int key;
    Node left;
    Node right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }

}



public class BinaryTree {
        Node root;
        BinaryTree()
        {
            root = null;

        }
        void printPostorder(Node node)
        {
            if(node == null)
                return;

                printPostorder(node.left);
                printPostorder(node.right);
                System.out.println(node.key + " ");

            }
            void printInorder(Node node)
            {
                if(node == null)
                    return;
                printInorder(node.left);
                System.out.println(node.key+" ");
                printInorder(node.right);

            }

            void printPreorder(Node node)
            {
                if(node == null)
                    return;
                System.out.println(node.key + " ");
                printPreorder(node.left);
                printPreorder(node.right);

            }

            public void printPostOrder()
            {
                printPostorder(root);
            }
            public void printInOrder()
            {
                printInorder(root);
            }
            public void printPreOrder()
            {
                printPreorder(root);
            }

public static void  main(String []args)
{
    BinaryTree tree=new BinaryTree();
    tree.root=new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
    tree.root.left.left=new Node(4);
    tree.root.left.right=new Node(5);

    System.out.println("preorder traversal of binary tree is");
    tree.printPreOrder();

    System.out.println("Inorder traversal of binary tree is");
    tree.printInOrder();

    System.out.println("Postorder traversal of binary tree is");
    tree.printPostOrder();




}
}



