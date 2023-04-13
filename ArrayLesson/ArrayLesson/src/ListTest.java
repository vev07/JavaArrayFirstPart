import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        SingleLinkList<Contact> contactSingleLinkList = new SingleLinkList<>();

        contactSingleLinkList.addToEnd(new Contact(123,"Yevhen", "111111111"));
        contactSingleLinkList.addToEnd(new Contact(234, "Iryna","222222222"));
        contactSingleLinkList.addToEnd(new Contact(345,"Karyna", "3333333333"));
        contactSingleLinkList.addToEnd(new Contact(456, "Zlata", "444444444"));

        for (Object c: contactSingleLinkList) {
            System.out.println(c);
        }
        System.out.println("______________________");
        contactSingleLinkList.reverse();
        for (Object c: contactSingleLinkList) {
            System.out.println(c);
        }

    }
    static class Contact {


        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }
        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
    public static class SingleLinkList<T> implements Iterable {
        ListItem<T> head;
        ListItem<T> tail;
        @Override
        public Iterator iterator() {
            return new Iterator() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }
        private static class ListItem<T> {
            T data;
            ListItem<T> next;


        }

        public boolean isEmpty() {
            return head == null;
        }
        public void addToEnd(T item) {
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()) {
                head = newItem;
                tail = newItem;
            } else {
                tail.next = newItem;
                tail = newItem;

            }
        }
        public void reverse() {
            if (!isEmpty() && head.next != null) {
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }

        }

    }
}
