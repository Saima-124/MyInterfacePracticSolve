package Interface_XII;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Apple");
        bag.add("Orange");
        bag.add("Apple");
        System.out.println("Apple is = " + bag.count("Apple"));
        System.out.println("Orange is = " + bag.count("Orange"));
        System.out.println("Banana is = " + bag.count("Banana"));
    }
}
