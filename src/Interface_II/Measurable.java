package Interface_II;


public interface Measurable {
    double getMeasure();
    static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return null; // or throw IllegalArgumentException
        }
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }
}