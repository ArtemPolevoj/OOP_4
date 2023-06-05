public class Element<T> {
    T obj;

    public Element(T obj) {
        this.obj = obj;
    }

    public void printElement() {
        System.out.println(obj + " - " + obj.getClass());
    }

}
