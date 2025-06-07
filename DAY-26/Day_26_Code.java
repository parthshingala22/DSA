class Tree{
    int data;
    Tree left;
    Tree right;

    Tree(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }

    Tree(int data1, Tree left1){
        this.data = data1;
        this.left = left1;
        this.right = null;
    }

     Tree(int data1, Tree left1, Tree right1){
        this.data = data1;
        this.left = left1;
        this.right = right1;
    }
}


class Day_26_Code {
    
}