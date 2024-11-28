package Interface_XIII;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(5,5);
        grid.add(0,0,"Top corner");
        grid.add(3,3,"Middle corner");
        grid.add(7,7,"Bottom corner");
        System.out.println("Description of 0 and 0 point is : " + grid.getDescription(0,0));
        System.out.println("Description of 3 and 3 point is : " + grid.getDescription(3,3));
        System.out.println("Description of 7 and 7 point is : " + grid.getDescription(7,7));
        System.out.println("Description of Locations : ");

        for (Grid.Location loc : grid.getDescribedLocations()){
            System.out.println("Row: " + loc.row + ", Column: " + loc.column + ", Description: " + loc.description);
        }

    }
}
