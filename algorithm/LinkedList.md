

https://www.codewars.com/kata/582c297e56373f0426000098


~~~Java
// 모범답안은 재귀호출로 한줄로 풀어내는것 
public class Kata {

  public static String stringify(Node list) {
    return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
  }

}
~~~


https://www.codewars.com/kata/55be95786abade3c71000079/solutions/java


~~~Java

//한줄로 되는데 여러 if로직을 사용함;;
class Node {

  int data;
  Node next = null;
  
  Node(final int data) {
    this.data = data;
  }
  
  Node(final int data, Node next) {
    this(data);
    this.next = next;
  }
  
  public static Node push(final Node head, final int data) {
    return head == null ? new Node(data) : new Node(data, head);
  }
  
  public static Node buildOneTwoThree() {
    return new Node(1, new Node(2, new Node(3)));
  }
}
~~~