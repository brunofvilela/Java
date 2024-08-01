public class Main {

    public static void main (String[] arg) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = car1.model.trim();        
        car1.year = 2017;

        car2.model = "Jaguar";
        car2.year = 2024;

        print(Car.seila);

        car1.displayInfo();
        car2.displayInfo();
    }
    public static void print(Object value) {
        System.out.println(value);
    }
}

class Car {
    public String model = "";
    public int year = 2024;

    public static String seila = "qualquercoisa";

    public void displayInfo(){
        Main.print("""
        {
            "model": "%s",
            "year": %d
        }
        """.formatted(this.model, this.year));
    }
}