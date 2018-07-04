import java.util.Stack;

/**
 * @ClassName BiTree1
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/12  18:23
 * Version 1.0
 **/
public class BiTree1 {
    private BiTreeNode root;
    BiTree1(){
        this.root = null;
    }
    BiTree1(BiTreeNode root){
        this.root = root;
    }
    BiTree1(String preTree,String inTree,int preIndex,int inIndex,int count){
        if(count > 0){
            char data = preTree.charAt(preIndex);
            int i = 0;
            for(;i<count;i++){
                if(data == inTree.charAt(i+inIndex)){
                    break;
                }
            }
            root = new BiTreeNode(data);
            root.leftchild = new BiTree1(preTree,inTree,preIndex+1,inIndex,i).root;
            root.rightchild = new BiTree1(preTree,inTree,preIndex+i+1,inIndex+i+1,count-i-1).root;
        }
    }


    void preTree(BiTreeNode tree){
        if(tree != null) {
            System.out.println(tree.data);
            preTree(tree.leftchild);
            preTree(tree.rightchild);
        }
    }

    void inTree(BiTreeNode tree){
        if(tree != null){
            inTree(tree.leftchild);
            System.out.println(tree.data);
            inTree(tree.rightchild);
        }
    }

    void afTree(BiTreeNode tree){
        if(tree != null){
            afTree(tree.leftchild);
            afTree(tree.rightchild);
            System.out.println(tree.data);
        }
    }

    void preTree1(){
        Stack<BiTreeNode> stack = new Stack();
        stack.push(root);
        while(stack != null){
            BiTreeNode ro = stack.pop();
            System.out.println(ro.data);
            if(ro.leftchild != null){
                System.out.println(ro.leftchild.data);
            }
            if(ro.rightchild != null){
                stack.push(ro.rightchild);
            }
            ro = ro.leftchild;
        }
    }

}
