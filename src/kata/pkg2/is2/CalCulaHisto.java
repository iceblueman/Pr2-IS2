package kata.pkg2.is2;

public class CalCulaHisto {
    public static <T> Histogram <T> computeHisto(T[] vector){
        Histogram <T> histo = new Histogram<>();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
