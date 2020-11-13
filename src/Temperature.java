public class Temperature {
    private int actualTemperature;
    private int expectedTemperature;
    private double actualTemperatureInDoubleFormat = actualTemperature;


    public Temperature() {
    }

    public Temperature(int actualTemperature, int expectedTemperature) {
        this.actualTemperature = actualTemperature;
        this.expectedTemperature = expectedTemperature;
    }

    public int getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(int actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public int getExpectedTemperature() {
        return expectedTemperature;
    }

    public void setExpectedTemperature(int expectedTemperature) {
        this.expectedTemperature = expectedTemperature;
    }

    public double getActualTemperatureInDoubleFormat() {
        return actualTemperatureInDoubleFormat;
    }

    public void setActualTemperatureInDoubleFormat(double actualTemperatureInDoubleFormat) {
        this.actualTemperatureInDoubleFormat = actualTemperatureInDoubleFormat;
    }
}
