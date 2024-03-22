import java.util.Iterator;

public class MyCollection<T> implements Iterable<T> {

  private T[] items;
  private int size;

  public void MyCollection(T[] items) {
    this.items = items;
    this.size = items.length;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int currentIndex = 0;

      @Override
      public boolean hasNext() {
        return currentIndex < size;
      }

      @Override
      public T next() {
        return items[currentIndex];
      }
    };
  }
}
