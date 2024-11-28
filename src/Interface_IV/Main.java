package Interface_IV;

public class Main {
    public static void main(String[] args) {
        Sequence multiplesOf = Sequence.multiplesOf(3);
        System.out.println("First  five multiples of 3 : ");
        for(int i=0;i<5;i++){
            System.out.println(multiplesOf.next());
        }
        Sequence powerOf = Sequence.powersOf(2);
        System.out.println("First five power of 2 : ");
        for(int i=0;i<5;i++){
            System.out.println(powerOf.next());
        }
    }
}
