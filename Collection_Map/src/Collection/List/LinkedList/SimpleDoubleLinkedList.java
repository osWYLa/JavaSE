package Collection.List.LinkedList;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description  手动实现一个简单的双向链表
 * @Version
 */
public class SimpleDoubleLinkedList {
    public static void main(String[] args) {
        //简单双向链表
        //定义头节点
        Node first;
        Node node1 = new Node(null, null, "yuye1");
        first = node1;

        Node node2 = new Node(null, null, "yuye2");
        //将node2加入到链表
        node1.next = node2;
        node2.pre = node1;

        Node last = node2;

        //遍历(从first开始)
        Node temp = first;
        while (true){
            System.out.println(temp.name);
            if (temp.next == null) break;
            temp = temp.next;
        }

        System.out.println("==============");
        //遍历（从last开始）
        Node temp02= last;
        while (true){
            System.out.println(temp02.name);
            if (temp02.pre == null) break;
            temp02 = temp02.pre;

        }


    }
}

class Node {
    Node pre; //指向前一个节点
    Node next;//指向后一个节点
    String name;

    public Node(Node pre, Node next, String name) {
        this.pre = pre;
        this.next = next;
        this.name = name;
    }
}