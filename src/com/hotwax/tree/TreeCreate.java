package com.hotwax.tree;

public class TreeCreate {
    Node root;

    public void insert(int key){
        Node node=new Node(key);
        if(root==null) {
            root = node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null){
            if(temp.data>key){
                prev=temp;
                temp=temp.left;
            }
            else if (temp.data<key){
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.data>key)
            prev.left=node;
        else prev.right=node;
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    void preorderRec(Node root)
    {
        if (root != null) {
            System.out.print(root.data+" ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
    void postorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
    Node deleteRec(Node root, int key)
    {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);

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
    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public boolean search(Node root, int key)
    {
        if (root == null)
            return false;

        if (root.data == key)
            return true;
        boolean res1 = search(root.left, key);
        if(res1) return true;
        boolean res2 = search(root.right, key);

        return res2;
    }

}
