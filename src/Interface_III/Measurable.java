package Interface_III;

public interface Measurable {
    double getMeasurable();
public static Measurable largest(Measurable[] objects){
    if(objects==null || objects.length==0){
        return null;
    }else {
        Measurable largest = objects[0];
        for(int i=1;i< objects.length;i++){
            if(objects[i].getMeasurable()> largest.getMeasurable()){
                largest=objects[i];
            }
        }
        return largest;
    }
}
}


