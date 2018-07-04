import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName BiTree
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/12  12:23
 * Version 1.0
 **/
public class BiTree {

        private BiTreeNode root;    //树的根节点
        public BiTree(){            //构造空树
            this.root = null;
        }
        public BiTree(BiTreeNode root){     //构造树
            this.root = root;
        }
        //根据先序中序建树
        public BiTree(String preOrder, String inOrder ,int preIndex,int inIndex,int count){
            if(count>0){
                char data = preOrder.charAt(preIndex);
                int i = 0;
                for( ; i<count; i++){
                    if(data == inOrder.charAt(i+inIndex))
                        break;
                }
                root = new BiTreeNode(data);
                root.leftchild = new BiTree(preOrder,inOrder,preIndex +1,inIndex,i).root;
                root.rightchild = new BiTree(preOrder,inOrder,preIndex + i + 1,inIndex + i + 1,count - i - 1).root;
            }
        }

        //先序遍历递归
        public void preRootTraverse(BiTreeNode T){
            if(T != null){
                System.out.print(T.data);
                preRootTraverse(T.leftchild);
                preRootTraverse(T.rightchild);
            }
        }
        //中序遍历递归
        public void inRootTraverse(BiTreeNode T){
            if(T != null){
                inRootTraverse(T.leftchild);
                System.out.print(T.data);
                inRootTraverse(T.rightchild);
            }
        }
        //后序遍历递归
        public void postRootTraverse(BiTreeNode T){
            if(T != null){
                postRootTraverse(T.leftchild);
                postRootTraverse(T.rightchild);
                System.out.print(T.data);
            }
        }

        //先序遍历非递归
        public void preRootTraverse(){
            BiTreeNode root = this.root;
            if(root != null){
                Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
                stack.push(root);
                while(!stack.isEmpty()){
                    root = (BiTreeNode)stack.pop();
                    System.out.print(root.data);
                    while(root != null){
                        if(root.leftchild != null) {
                            System.out.print(root.leftchild.data);
                        }
                        if(root.rightchild != null){
                            stack.push(root.rightchild);
                        }
                        root = root.leftchild;
                    }
                }
            }
        }
    void preTree1(){
        BiTreeNode root = this.root;
        if(root != null) {
            Stack<BiTreeNode> stack = new Stack();
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                System.out.println(root.data);
                while(root != null) {
                    if (root.leftchild != null) {
                        System.out.println(root.leftchild.data);
                    }
                    if (root.rightchild != null) {
                        stack.push(root.rightchild);
                    }
                    root = root.leftchild;
                }
            }
        }
    }

    void inTree1(){
         BiTreeNode root = this.root;
         if(root != null ){
             Stack<BiTreeNode> stack = new Stack();
             stack.push(root);
             while(!stack.empty()){
                 while(stack.peek() != null) {
                     stack.push(stack.peek().leftchild);
                 }
                 stack.pop();
                 if(!stack.empty()){
                     root = stack.pop();
                     System.out.println(root.data);
                     stack.push(root.rightchild);
                 }
             }


         }
    }
    void af1(){
        BiTreeNode root = this.root;
        if(root != null){
            Stack<BiTreeNode> stack = new Stack<>();
            stack.push(root);
            Boolean flag;
            BiTreeNode p = null;
            while(!stack.empty()){
                while(stack.peek() != null){
                    stack.push(stack.peek().leftchild);
                }
                stack.pop();
                while(!stack.empty()){
                    root = stack.peek();
                    if(root.rightchild == null || root.rightchild == p){
                        System.out.println(root.data);
                        stack.pop();
                        p = root;
                        flag = true;
                    }else{
                        stack.push(root.rightchild);
                        flag = false;
                    }

                    if(!flag){
                        break;
                    }
                }
            }
        }

    }
        //中序遍历非递归
        public void inRootTraverse(){
            BiTreeNode root = this.root;
            if(root != null){
                Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
                stack.push(root);
                while(!stack.isEmpty()){
                    while(stack.peek() != null){
                        stack.push(stack.peek().leftchild);
                    }
                    stack.pop();
                    if(!stack.isEmpty()){
                        root = stack.pop();
                        System.out.print(root.data);
                        stack.push(root.rightchild);
                    }
                }
            }
        }



        //后序遍历非递归
        public void postRootTraverse(){
            BiTreeNode root = this.root;
            if(root != null){
                Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
                stack.push(root);
                Boolean flag;
                BiTreeNode p = null;
                while(!stack.isEmpty()){
                    while(stack.peek() != null){
                        stack.push(stack.peek().leftchild);
                    }
                    stack.pop();
                    while(!stack.isEmpty()){
                        root = stack.peek();
                        if(root.rightchild == null || root.rightchild == p){
                            System.out.print(root.data);
                            stack.pop();
                            p = root;
                            flag = true;
                        }else{
                            stack.push(root.rightchild);
                            flag = false;
                        }
                        if(!flag){
                            break;
                        }
                    }
                }
            }
        }
        //层次遍历
        public void LevelTraverse(){
            BiTreeNode T = root;
            if(T != null){
                LinkedBlockingQueue<BiTreeNode> queue = new LinkedBlockingQueue<BiTreeNode>(4);
                queue.offer(T);
                while(!queue.isEmpty()){
                    T = queue.poll();
                    System.out.print(T.data);
                    if(T.leftchild != null){
                        queue.offer(T.leftchild);
                    }
                    if(T.rightchild != null){
                        queue.offer(T.rightchild);
                    }
                }
            }
        }



//  测试用，忽略
  public static void main(String[] args){
      String perOrder = "ABDHECFG";
      String inOrder = "HDBEAFCG";
      BiTree tree = new BiTree(perOrder,inOrder,0,0,8);
      tree.inTree1();
      System.out.println("先序遍历");
      tree.preRootTraverse();
    /*  System.out.println();
      tree.preRootTraverse(tree.root);
      System.out.println();
      System.out.println();

      System.out.println("中序遍历");
      tree.inRootTraverse();
      System.out.println();
      tree.inRootTraverse(tree.root);
      System.out.println();
      System.out.println();

      System.out.println("后序遍历");
      tree.postRootTraverse();
      System.out.println();
      tree.postRootTraverse(tree.root);
      System.out.println();
      System.out.println();

      System.out.println("层次遍历");
      tree.LevelTraverse();*/
  }

}
