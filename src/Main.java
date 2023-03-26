public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int result = service.calculate(98, 187);
        System.out.printf("Ваш bmi-индекс = " + result);
    }
}