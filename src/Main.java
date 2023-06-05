public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        Element<Integer> value = new Element<>();
        value.printElement(10);
        Element<Double> valDob = new Element<>();
        valDob.printElement(100.23);
        Element<String> valStr = new Element<>();
        valStr.printElement("Строка");

        System.out.println("Задача 2.");
        Integer[] arrInt = new Integer[5];
        String[] arrStr = new String[5];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = "Str " + (int)(Math.random() * 100);
        }
        new MyArray<Integer>().printArray(arrInt);
        new MyArray<String>().printArray(arrStr);
    }
}