public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        Element<Integer> valInt = new Element<>(10);
        valInt.printElement();
        Element<Double> valDob = new Element<>(100.23);
        valDob.printElement();
        Element<String> valStr = new Element<>("Строка");
        valStr.printElement();

    }
}