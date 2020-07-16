import org.w3c.dom.Node;

public class tree<treeLeft> {

    public static treeLeft;
    int data;
        tree left;
        tree right;
        // getter setter bht jaroori h//

        public int getData()
        {
        return data;
    }

        public void setData()
        {
            this.data = data;
    }

    }

    class myTree
    {
        public tree createNewNode(int val)
        {
            tree newNode = new tree();
            newNode.data = val;
            return newNode;

        }


        class tree0peration {


            public void preOrder(tree root) {
                if (root == null) {
                    return;
                }
                System.out.println(root.data);

                preOrder(tree.left);
                preOrder(tree.right);
            }
        }

    }
