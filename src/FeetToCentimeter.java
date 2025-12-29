public class FeetToCentimeter {

    public static void main(String[] args) {

        System.out.println(toCentimeters(6));
        System.out.println(toCentimeters(6,5));
    }

    public static double toCentimeters (int inches) {
        return (double) inches * 2.54;
    }

    public static double toCentimeters (int foot, int inches) {
        int totalInches = (foot * 12) + inches;
        return toCentimeters(totalInches);
    }
}
