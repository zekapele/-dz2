public class Main {
    // Конвертація миль у кілометри
   public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Конвертація кілометрів у милі
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
   double miles = 10;
        double kilometers = 16.0934;

        System.out.println(miles + " миль = " + milesToKilometers(miles) + " км");
        System.out.println(kilometers + " км = " + kilometersToMiles(kilometers) + " миль");
        // System.out.println("first commit------infooo");
    }
}
