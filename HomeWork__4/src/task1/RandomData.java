package task1;

import java.time.LocalDate;

public class RandomData {

    public String getNick() {

        String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 25)));
        }

        return builder.toString();
    }

    public String getPersonPassword() {
        String letters = "0123456789";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 9)));
        }

        return builder.toString();
    }

    public LocalDate getPersonRegistration() {
//        GregorianCalendar calendar=new GregorianCalendar(2000,1,1);
//
//        int min = calendar.
//        registration=new GregorianCalendar();
//        registration= calendar.roll(calendar, 2352);
        LocalDate minDate = LocalDate.of(1970, 1, 1);
        LocalDate maxDate = LocalDate.of(2020, 1, 1);
        long a = (long) (Math.random() * (maxDate.toEpochDay() - minDate.toEpochDay()));

        return maxDate.minusDays(a);
    }

    public int getAge() {
        return (int) (Math.random() * 16 + 1);
    }


}
