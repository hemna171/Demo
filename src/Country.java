
public class Country {
    private String countryName;
    private int temperatureC;

    public String getName() {
        return this.countryName;
    }

    public void setName(String countryName) {
        this.countryName = countryName;
    }

    public int getTempC() {
        return this.temperatureC;
    }

    public void setTempC(int temperatureC) {
        this.temperatureC = temperatureC;
    }



    public boolean checkTemperature() {
        boolean A = false;
        int tempF=0;
        tempF= this.temperatureC*9/5+32;
        if (this.temperatureC > 0) {
            A = false;
        } else {
            A = true;
            System.out.println("Temperature in Fahrenheit:"+tempF);
        }
        return A;
    }

}

