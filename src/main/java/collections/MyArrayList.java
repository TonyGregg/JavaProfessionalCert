package collections;

import java.util.AbstractList;

//public static <T> List<T> asList(T[] a) {
//    return new MyArrayList<T>(a);
//}

class MyArrayList<T> extends AbstractList<T> {

  private final T[] a;

  MyArrayList(T[] array) {
      a = array;
  }

  public T get(int index) {
      return a[index];
  }

  public T set(int index, T element) {
      T oldValue = a[index];
      a[index] = element;
      return oldValue;
  }

  public int size() {
      return a.length;
  }
}