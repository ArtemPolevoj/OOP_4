public class MyMax<T extends Comparable> {
    public T getMax(T t1, T t2){
        if (t1.compareTo(t2) > 0) return t1;
        else  return  t2;

    }
}
