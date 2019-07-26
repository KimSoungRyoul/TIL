public class Kata {

    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public static String stringify(Node node) {
        // Your code here.
        int data1= 0;
        StringBuilder stringBuilder =new StringBuilder();
        while(node != null){
           data1 = node.getData();
           stringBuilder.append(data1);
           stringBuilder.append(" -> ");
            node= node.getNext();
        }
        stringBuilder.append("null");


        return stringBuilder.toString();
    }

}