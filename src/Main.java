public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75;
        double height = 1.85;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}