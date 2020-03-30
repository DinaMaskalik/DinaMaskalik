package task1;

public class CountryMain {

    public static void main(String[] args) {

        Country country = Country.BELARUS;

        Country country1 = Country.valueOf("BELARUS");

        System.out.println(country);
        System.out.println(country1);
        System.out.println(country == country1);

//        Country country2=Country.valueOf("INDIA");
//        System.out.println(country2);

        Country country2=Country.CHINA;
        System.out.println(country.compareTo(country2));
        System.out.println(country.compareTo(country1));

        CountryAreaComparator areaComparator=new CountryAreaComparator();
        System.out.println(areaComparator.compare(country1,country2));
    }


}
