public class main
{
    public void main(String[] args) {
        tree root;
        myTree obj = new myTree();
        root = obj.createNewNode(2);
        root.left = obj.createNewNode(4);
        root.right = obj.createNewNode(6);
        root.left.left = obj.createNewNode(8);
    }
}
}
