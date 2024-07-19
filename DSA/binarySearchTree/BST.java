package DSA.binarySearchTree;

import java.util.ArrayList;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

    protected  TreeNode<E> root; // an example of object composition

    protected int size; // track the size of the inputed nodes in the array!


    public BST(E[] objects){
        for(int i = 0; i < objects.length; i++){
            insert(objects[i]);
        }
    }

    public boolean insert(E objects){
        if(objects == null){
            root = createNode(objects);
         }else{
            TreeNode<E> parentNode = null;  // point to the same struct as the root node
            TreeNode<E> currTreeNode = root; 
            while (currTreeNode != null) {
                if(objects.compareTo(currTreeNode.element) < 0){
                    parentNode = currTreeNode;
                    currTreeNode = currTreeNode.left;
                }else if(objects.compareTo(currTreeNode.element) > 0){
                    parentNode = currTreeNode;
                    currTreeNode = currTreeNode.right;
                }else{
                    return false; // duplicate code not inserted, incase the objects are equal!
                }
            }
            // attach that node to the parent node;
            if(objects.compareTo(parentNode.element) < 0){
                parentNode.left = createNode(objects);
            }else if (objects.compareTo(parentNode.element) > 0){
                parentNode.right = createNode(objects);

            }

         }
        size++;

        return true;
    }


    protected TreeNode<E> createNode(E o){
        return new TreeNode<E>(o);

    }

    @Override
    public void inOrder(){
        inorder(root); // recursive root search;

    }

    protected void inorder(TreeNode<E> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void preOrder(){
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root){
        if(root == null) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.element + " ");
    }


    @Override
    public void postOrder(){
        postOrder(root);
    }

    protected void postOrder(TreeNode<E> root){
        if(root == null)return;

        System.out.println(root.element);
        postOrder(root.left);
        postOrder(root.right);
    }


    @Override
    public int getSize(){
        return size;
    }

    public TreeNode<E> getRoot(){
        return root;
    }

    public ArrayList<TreeNode<E>> getPathOfE(E object){ 
        ArrayList<TreeNode<E>> list = new ArrayList<>();

        TreeNode<E> cuTreeNode = root; // root element for this path;

        while(cuTreeNode !=null){
            list.add(cuTreeNode);
            if(object.compareTo(cuTreeNode.element) < 0){
                cuTreeNode = cuTreeNode.left;

            }else if(object.compareTo(cuTreeNode.element) > 0){
                cuTreeNode = cuTreeNode.right;
            }else{
                break;
            }
        }
         return list;
    }

    public boolean delete(E object){

        TreeNode<E> parentNode = null;
        TreeNode<E> currentNode = root;


        while(currentNode != null){
            if(object.compareTo(currentNode.element) < 0){
                parentNode = currentNode;
                currentNode = currentNode.left;
            }else if(object.compareTo(currentNode.element) > 0){
                parentNode = currentNode;
                currentNode = currentNode.right;
            }else{
                break;
            }


            if(currentNode == null){ 
                //NullPointerException expected.
                return false;
            }
    
            // first observable case: what if the current left child is empty?
            if(currentNode.left == null){
                if(parentNode == null){
                    
                    root = currentNode.right;
    
                }else if(object.compareTo(parentNode.element) < 0){
                        parentNode.left = currentNode.right;
                    }else if(object.compareTo(parentNode.element) > 0){
                        parentNode.right = currentNode.right;
                    }
    
            } else{
                
            }
            
        }

      
        

        size--;
        return true;
    }




    }





