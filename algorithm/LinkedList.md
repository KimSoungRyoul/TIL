

https://www.codewars.com/kata/582c297e56373f0426000098


~~~Java
// 모범답안은 재귀호출로 한줄로 풀어내는것 
public class Kata {

  public static String stringify(Node list) {
    return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
  }

}
~~~