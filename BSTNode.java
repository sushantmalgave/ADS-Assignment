import java.util.*;
public class BSTNode {

    BSTNode left,right;
    int data;

    public BSTNode()
    {

        left = null;
        right = null;
        data=0;

    }
    public BSTNode(int n)
    {
       left = null;
       right = null;
       data = n;
    }
    public void setLeft(BSTNode n)
    {
        left = n;

    }
    public void setRight(BSTNode n)
    {
        right=n;
    }
    public BSTNode getLeft()
    {
        return left;
    }
    public BSTNode getRight()
    {
        return right;
    }

    public void setData(int d)
    {
        data = d;
    }

    public int getData()
    {
        return data;
    }
}
class BST
{
    private BSTNode root;
    public BST()
    {
        root = null;
    }
    public boolean isEmpty()
    {
        return root == null;

    }
    public void insert(int data)
    {
        root = insert(root, data);
    }
    private BSTNode insert(BSTNode node,int data)
    {
        if(node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left=insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
            return node;
    }
    public void delete(int k)
    {
        if(isEmpty())
            System.out.println("Tree empty");
        else if(search(k) == false)
            System.out.println("sorry" +k+"is not present");
        else
        {
            root = delete(root, k);
            System.out.println(k+"deleted from the tree");
        }
    }
    private BSTNode delete(BSTNode root,int k)
    {
        BSTNode p,p2,n;
        if(root.getData()==k)
        {
            BSTNode lt,rt;
            lt = root.getLeft();
            rt = root.getRight();
            if(lt == null && rt == null)
                return null;
            else if(lt == null)
            {
                p = rt;
                return  p;
            }
            else if(rt == null)
            {
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p= rt;
                while (p.getLeft()!=null)
                    p = p.getLeft();
                    p.setLeft(lt);
                    return p2;
            }
        }
        if(k<root.getData())
        {
            n = delete(root.getLeft(),k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(),k);
            root.setRight(n);
        }
        return root;
    }
    public int countNodes()
    {
        return countNodes(root);
    }
//    private int countNodes()
//    {
//        return countNodes(root);
//    }

    private int countNodes(BSTNode r)
    {
        if(r == null)
            return 0;
        else
        {
            int l = 1;
            l +=countNodes(r.getLeft());
            l +=countNodes(r.getRight());
            return  l;
        }

    }
    public boolean search(int val)
    {
        return search(root, val);
    }
    private boolean search(BSTNode r, int val) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else {
                found = true;
                break;
            }
                found = search(r, val);
            }
            return found;

        }


        public void inorder()
        {
            inorder(root);
        }
        private void inorder(BSTNode r)
        {
            if(r != null)
            {
                inorder(r.getLeft());
                System.out.println(r.getData()+ "");
                inorder(r.getRight());
            }
        }
        public void preorder(BSTNode r)
        {
            if(r!=null)
            {
                System.out.println(r.getData()+" ");
                preorder(r.getLeft());
                preorder(r.getRight());
            }
        }
        public void postorder()
        {
            postorder(root);
        }
        private void postorder(BSTNode r)
        {
            if(r!=null)
            {
                postorder(r.getLeft());
                preorder(r.getRight());
                System.out.println(r.getData()+" ");
            }
        }

    public void preorder() {
    }
}
class BinarySearchTree
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        BST bst=new BST();
        System.out.println("Binary search tree test\n");
        char ch;
        do {
            System.out.println("\n binary search tree operations\n");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer elememnt to insert");
                    bst.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the integer element to delete");
                    bst.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.println("enter the integer elment search");
                    System.out.println("Search result :" + bst.search(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Nodes = " + bst.countNodes());
                    break;
                case 5:
                    System.out.println("empty status =" + bst.isEmpty());
                    break;
                default:
                    System.out.println("Wrong entry \n");
                    break;
            }

            System.out.println("\n post order:");
            bst.postorder();
            System.out.println("\n preorder:");
            bst.preorder();
            System.out.println("\n Inorder");
            bst.inorder();
            System.out.println("\n do you want to continue(type y or \n");
            ch = sc.next().charAt(0);
        }
        while(ch == 'Y' || ch =='y');

        }
    }