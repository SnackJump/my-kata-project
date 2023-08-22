package codewars.kyu7;

/**
 * Title: FunWithListsLength<br>
 * Description:<br>
 * https://www.codewars.com/kata/581e476d5f59408553000a4b/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/17
 */
public class FunWithListsLength {
    static int length(Node head) {
        if (head == null) return 0;
        return length(head.next) + 1;
    }

    static int length_v1(Node head) {
        if (head == null) {
            return 0;
        }
        int cnt = 1;
        while (head.next != null) {
            System.out.println(head.data);
            ++cnt;
            head = head.next;
        }
        return cnt;
    }


    static class Helpers {
        public static Node listFromArray(int... input) {
            Node<Integer> preNode = null;
            Node<Integer> node = null;
            for (int i = input.length - 1; i >= 0; i--) {
                node = new Node<Integer>(input[i], preNode);
                preNode = node;
            }
            return node;
        }
    }

    static class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
