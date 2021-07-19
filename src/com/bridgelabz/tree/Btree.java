package com.bridgelabz.tree;

public class Btree {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public class BinarySearchTree {
        // Insert Method
        public Node insert(Node root, int val) {
            if (root == null) {
                return craeteNewNode(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else if (val > root.data) {
                root.right = insert(root.right, val);
            }
            return root;
        }

        // New Node Creation Method
        public Node craeteNewNode(int temp) {
            Node bst = new Node();
            bst.data = temp;
            bst.left = null;
            bst.right = null;
            return bst;
        }

        public void print(Node root) { // print method
            if (root == null) {
                return;
            }
            print(root.left);
            System.out.println(root.data);
            print(root.right);
        }

        // Search Node in given BST
        public boolean nodePresent(Node root, int val) {
            if (root == null) {
                return false;
            }
            Boolean isPresent = false;

            while (root != null) {
                if (val < root.data) {
                    root = root.left;
                } else if (val > root.data) {
                    root = root.right;
                } else {
                    isPresent = true;
                    break;
                }

            }
            return isPresent;
        }

    }

    public void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree...!!!");

        BinarySearchTree Btree = new BinarySearchTree();
        Node root = null;

        root = Btree.insert(root, 56);
        root = Btree.insert(root, 30);
        root = Btree.insert(root, 70);
        root = Btree.insert(root, 22);
        root = Btree.insert(root, 40);
        root = Btree.insert(root, 60);
        root = Btree.insert(root, 95);
        root = Btree.insert(root, 11);
        root = Btree.insert(root, 65);
        root = Btree.insert(root, 3);
        root = Btree.insert(root, 6);
        root = Btree.insert(root, 63);
        root = Btree.insert(root, 67);

        Btree.print(root);
        System.out.println(Btree.nodePresent(root, 63));
    }
}
