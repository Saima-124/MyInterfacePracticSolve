package Interface_XIV;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Objects;
public class UnboundedGrid {
    public class Location{
        public int row;
        public int column;
        public String description;

        public Location(int row, int column) {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public String getDescription() {
            return description;
        }
    }
    private HashMap<Location , String>grid;

    public UnboundedGrid() {
        grid = new HashMap<>();
    }
    public void add(int row,int column,String description){
        grid.put(new Location(row,column),description);
    }
    public String getDescription(int row,int column){
        return grid.get(new Location(row, column));
    }
    public ArrayList<Location>getDescribedLocations(){
        return  new ArrayList<>(grid.keySet());
    }
}
