public class Calculate {

    public double add(float a, float b) {
        return a + b;
    }
    public double subtract(float a, float b) {
        return a - b;
    }
    public double multiply(float a, float b) {
        return a * b;
    }

    public double divide(float a, float b) {
        return a / b;
    }
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        System.out.println(obj.add(2, 5));
        System.out.println(obj.subtract(2, 5));
        System.out.println(obj.multiply(2, 5));
        System.out.println(obj.divide(2, 5));
    }
}
