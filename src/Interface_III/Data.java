package Interface_III;
public class Data {
    public static void main(String[] args) {

        Person[] persons = {
                new Person("Alice", 165.5),
                new Person("Bob", 180.0),
                new Person("Charlie", 175.3),
                new Person("Diana", 160.2),
                new Person("Edward", 190.0)
        };
        double totalHeight = 0;
        for (Person person : persons){
            totalHeight+= person.height;
        }
        double averageHeight = totalHeight/ persons.length;
        Person tallestPerson = (Person) Measurable.largest(persons);
        System.out.println("Average Height is = " + averageHeight);
        System.out.println("Tallest person is = " + tallestPerson.getName() +  " " +tallestPerson.getHeight() );
    }
}