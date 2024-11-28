package Interface_III;

public class Person implements Measurable{
    public String name;
    public double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }
    @Override
    public double getMeasurable(){
        return height;
            }
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
