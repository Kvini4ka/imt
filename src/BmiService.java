public class BmiService {
    public int calculate(int m, int h) {
        int result;
        int gap;
        gap = h * h;
        result = (m * 10000) / gap;
        return result;
    }
}
