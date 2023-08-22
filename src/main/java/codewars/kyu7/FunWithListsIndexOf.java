package codewars.kyu7;

/**
 * Title: FunWithListsIndexOf<br>
 * Description:<br>
 * https://www.codewars.com/kata/581c6b075cfa83852700021f/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/21
 */
public class FunWithListsIndexOf {
    static int indexOf(Node head, Object value) {
        int cnt = 0;
        while (head != null) {
            System.out.println("head.data = " + head.data);
            if (head.data.equals(value)) {
                return cnt;
            }
            ++cnt;
            head = head.next;
        }

        return -1;
    }

    static class Helpers {
        public static Node listFromArray(Object... input) {
            Node<Object> preNode = null;
            Node<Object> node = null;
            for (int i = input.length - 1; i >= 0; i--) {
                node = new Node<Object>(input[i], preNode);
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
