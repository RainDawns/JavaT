package jiepu.Java.homework.Day13;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 19:06<br/>
 *
 * @author lnh<br />
 */
public class MyLinkedList<T> {
    private class Node<T> {
        //存放元素的值
        private T data;
        //存放上一个节点
        private Node pre;
        //存放下一个节点
        private Node next;

        public Node(T data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

    }

    private Node Header;
    private Node tail;
    private int size;

    public MyLinkedList() {
        Header = null;
        tail = null;
    }

    //补全以下四种方法
    public void add(T o) {
        //第一次添加时
        if (size == 0) {
            Header = new Node(o, null, null);
            tail = Header;
            //非首次添加且
        } else {
            Node newnode = new Node(o, tail, null);
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public void add(int index, T o) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("双链表越界");
            //首部添加
        } else if (index == 0) {
            Node newnode = new Node(o, null, Header);
            Header = newnode;
            if (tail == null) {
                tail = Header;
            }
            //尾部添加
        } else if (index == size - 1) {
            Node newnode = new Node(o, tail, null);
            tail.next = newnode;
            tail = newnode;

        } else {
            Node o1 = get(index - 1);
            Node prev = o1.pre;
            Node next = o1.next;
            Node newnode = new Node(o, prev, next);
            prev.next = newnode;
            next.pre = newnode;
        }
        size++;
    }

    public void remove(int index) {
        if (size == 0) {
            throw new RuntimeException("双链表为空");
        }
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("双链表越界");
            //只有一个数据还要移除
        } else if (index == 0 && size == 1) {
            Header = null;
            tail = null;
            //头部长度大于1
        } else if (index == 0 && size > 1) {
            Header = Header.next;
            Header.pre = null;
            //尾部移除且长度大于1
        } else if (index == size - 1) {
            tail = tail.pre;
            tail.next = null;
        } else {
            Node cu = get(index);
            Node prev = cu.pre;
            Node next = cu.next;
            prev.next = next;
            next.pre = prev;
        }
        size--;
    }


    public Node get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("双链表越界");
        } else {
            Node cunode = Header;
            int i = 0;
            while (i < index) {
                cunode = cunode.next;
                i++;
            }
            return cunode;
        }
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            StringBuilder builder = new StringBuilder("[");
            for (Node cu = Header; cu != null; cu = cu.next) {
                builder.append(cu.data.toString() + ",");
            }
            int len = builder.length();
            return builder.delete(len - 1, len).append("]").toString();
        }
    }


    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("23");
        list.add("2");
        list.add("45");
        list.remove(2);
        list.add(0, "78");
        list.add(list.size - 1, "67");
        System.out.println(list);
//        System.out.println(list.get(2).data);

    }
}

