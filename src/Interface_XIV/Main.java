package Interface_XIV;

public class Main {
    public static void main(String[] args) {
        UnboundedGrid grid = new UnboundedGrid();
        grid.add(0,0,"Origin point");
        grid.add(100,200,"Far Corner");
        grid.add(-50,-50,"Negative Corner");
        System.out.println("Description Location : ");
        for(UnboundedGrid.Location location : grid.getDescribedLocations()){
            System.out.println("Row = " + location.row + " " + "Column = " + location.column);
        }
    }
}
