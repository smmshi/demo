import javax.xml.soap.Node;

/**
 * 链表反转
 */

public class test06 {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList(3);
        System.out.println(reverseList(nodeList).toString());

    }
    public static NodeList reverseList(NodeList head){
        if (head==null)
            return null;
        NodeList pre =null;
        NodeList next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    }

class NodeList{
    int val;
    NodeList next;

    public NodeList() {
    }

    public NodeList(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "NodeList{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

