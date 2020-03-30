package task1;

public enum Country implements ICountryInfo {
    BELARUS(207600, 9468000),
    RUSSIA(17075200, 143300000),
    POLAND(312568, 38167000),
    USA(9629091, 310241000),
    FRANCE(547030, 65447000),
    GREECE(131940, 11306000),
    GERMANY(357021, 81802000),
    ITALY(301230, 60402000),
    CHINA(9596960, 1339450000);

    private double area;
    private int numberOfPeople;

    Country(int area, int numberOfPeople) {
        this.area = area;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
