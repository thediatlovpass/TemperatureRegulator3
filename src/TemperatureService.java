public class TemperatureService {

    double changeTemp = 0.5;

    void enterTemperatures(Temperature temperature) {

        while (temperature.getActualTemperatureInDoubleFormat() != temperature.getExpectedTemperature()) {
            if (temperature.getActualTemperatureInDoubleFormat() < temperature.getExpectedTemperature()) {
                System.out.println("Zwiększam temperature o: " + changeTemp + " stopni/a");
                temperature.setActualTemperatureInDoubleFormat(temperature.getActualTemperatureInDoubleFormat() + changeTemp);
                System.out.println("Temp :" + temperature.getActualTemperatureInDoubleFormat());
            } else {
                System.out.println("Zmniejszam temperature o: " + changeTemp + " stopni/a");
                temperature.setActualTemperatureInDoubleFormat(temperature.getActualTemperatureInDoubleFormat() - changeTemp);
                System.out.println("Temp :" + temperature.getActualTemperatureInDoubleFormat());
            }
        }
        System.out.println("Osiągnięto temperaturę docelową: " + temperature.getExpectedTemperature() + "stopni");
    }
}

