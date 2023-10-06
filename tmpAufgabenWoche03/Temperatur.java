public class Temperature {
    
    public double temperatureCelsius;

    public Temperature(double temperature) {
        this.temperatureCelsius = temperature;
    }

    public Temperature() {
        this.temperatureCelsius = 20;
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public void setTemperatureCelsius(float temperature) {
        this.temperatureCelsius = temperature;
    }

    public double getTemperatureKelvin() {
        return this.temperatureCelsius + 273.15;
    }

    public double getTemperatureFahrenheit() {
        return (this.temperatureCelsius * 1.8) + 32;
    }

    public void changeTemperature(double temperatureChangeInKelvin) {
        this.temperatureCelsius += temperatureChangeInKelvin;
    }
}
