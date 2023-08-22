package codewars.kyu6;


import java.util.function.Predicate;

/**
 * Title: Helpers<br>
 * Description:<br>
 * https://www.codewars.com/kata/582041237df353e01d000084/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/17
 */
public class FunWithListsFilter {
    static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
        while ((head != null) && !p.test(head.data)) head = head.next;
        return head == null ? null : new Node<>(head.data, FunWithListsFilter.filter(head.next, p));
    }

    static <T> Node<T> filter_V1(Node<T> head, Predicate<T> p) {
        if (head == null) return null;
        Node<T> returnHead = null;
        Node<T> curHead = null;
        Node<T> preHead = null;
        while (head != null) {
            if (p.test(head.data)) {
                curHead = new Node<>(head.data);
                if (returnHead == null) {
                    // 第一筆
                    returnHead = curHead;
                } else {
                    preHead.next = curHead;
                }
                preHead = curHead;
            }
            head = head.next;
        }
        return returnHead;
    }

    static class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }

        @Override
        public String toString() {
            return data + (next != null ? next.toString() : "");
        }
    }
}
