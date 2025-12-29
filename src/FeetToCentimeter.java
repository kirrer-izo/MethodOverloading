public class FeetToCentimeter {

    public static void main(String[] args) {

        System.out.println(toCentimeters(6) + " cm");
        System.out.println(toCentimeters(6,5) + " cm");
    }

    public static double toCentimeters (int inches) {
        return (double) inches * 2.54;
    }

    public static double toCentimeters (int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return toCentimeters(totalInches);
    }
}
