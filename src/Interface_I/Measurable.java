package Interface_I;

public interface Measurable {
    double getMeasure();
    static Measurable largest(Measurable[] objects){
        if(objects==null || objects.length==0){
            return null;
        }else {
            Measurable largest = objects[0];
            for(int i=1;i< objects.length;i++){
                if(objects[i].getMeasure()> largest.getMeasure()){
                    largest = objects[i];
                }
            }
            return largest;
        }
    }
    static Measurable smallest(Measurable[] objects){
        if(objects==null || objects.length==0){
            return null;
        }else{
            Measurable smallest = objects[0];
            for(int i=1;i< objects.length;i++){
              if(objects[i].getMeasure()<smallest.getMeasure()){
                  smallest=objects[i];
              }
            }
            return smallest;
        }

    }
}
