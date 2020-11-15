import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        System.out.println("Witaj w programie Regulacja temperatury");
        TemperatureService temperatureService = new TemperatureService();
        Temperature temperature = new Temperature();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę aktualną: ");
        temperature.setActualTemperatureInDoubleFormat(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj temperaturę oczekiwaną: ");
        temperature.setExpectedTemperature(scanner.nextInt());
        scanner.nextLine();
        temperatureService.enterTemperatures(temperature);
    }
}
