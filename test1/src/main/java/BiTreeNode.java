/**
 * @ClassName BiTreeNode
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/12  12:25
 * Version 1.0
 **/
public class BiTreeNode {
        public Object data;
        public BiTreeNode leftchild,rightchild;
        //空节点构造
        public BiTreeNode(){
            this(null);
        }
        //构造左右子节点为空的节点
        public BiTreeNode(Object data){
            this(data,null,null);
        }
        //构造有左右子节点的节点
        public BiTreeNode(Object data,BiTreeNode leftchild,BiTreeNode rightchild){
            this.data = data;
            this.leftchild = leftchild;
            this.rightchild = rightchild;
        }
}
