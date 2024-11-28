package Interface_IV;

public interface Sequence {
    int next();
    static Sequence multiplesOf(int n){
        return new Sequence() {
            private int current =0;
            @Override
            public int next() {
               current+=n;
               return current;
            }
        };
    }
    static Sequence powersOf(int n){
        return new Sequence() {
            private int current = 1;
            @Override
            public int next() {
               int result = current;
               current*=n;
               return current;

            }
        };
    }
}
