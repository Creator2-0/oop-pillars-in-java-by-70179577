// Encapsulation Program 4: Temperature keeps Celsius private and converts on request
public class Encapsulation4_Temperature {

    static class Temperature {
        private double celsius;

        public Temperature(double celsius) {
            setCelsius(celsius);
        }

        public double getCelsius() {
            return celsius;
        }

        // absolute zero check - physical limit
        public void setCelsius(double celsius) {
            if (celsius >= -273.15) {
                this.celsius = celsius;
            } else {
                System.out.println("Below absolute zero is impossible");
            }
        }

        // derived values are computed, not stored
        public double getFahrenheit() {
            return celsius * 9 / 5 + 32;
        }

        public double getKelvin() {
            return celsius + 273.15;
        }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        System.out.println("C: " + t.getCelsius());
        System.out.println("F: " + t.getFahrenheit());
        System.out.println("K: " + t.getKelvin());
        t.setCelsius(-500);   // rejected
        System.out.println("Still: " + t.getCelsius());
    }
}
