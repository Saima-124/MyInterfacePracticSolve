package Interface_XIII;
import java.util.ArrayList;
public class Grid {
    public class Location{
        int row;
        int column;
        String description;

        public Location(int row, int column, String description) {
            this.row = row;
            this.column = column;
            this.description = description;
        }
    }
    private int numRows, numColumns;
    private ArrayList<Location>locations;

    public Grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        locations= new ArrayList<>();
    }
    public void add( int row,int column,String description){
        if(row<0 || row>numRows || column<0 || column>numColumns){
            System.out.println("Invalid row and column");
        }
        for(Location location : locations){
            if(location.row==row && location.column==column){
                location.description=description;
                return;
            }
        }
        locations.add(new Location(row, column, description));
    }
    public String getDescription(int row, int column){
        for(Location location : locations){
            if(location.row==row && location.column==column){
                 return location.description;
            }
        }
        return null;
    }
    public ArrayList<Location>getDescribedLocations(){
        return new ArrayList<>(locations);
    }
}
