package iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    GoodLinkedList some_object = new GoodLinkedList();
    for (int i = 9; i > 0; --i)
      some_object.insertBack(i);
    GoodLinkedListIterator it = some_object.createIterator();
    while (!it.isDone()) {
      System.out.print(it.get() + "  ");
      it.next();
    }
    System.out.println();
  }
}