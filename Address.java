package smallStore;

public class Address {
    private String countryName;
    private String stateName;
    private String houseNumber;
    private String cityName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryName='" + countryName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
