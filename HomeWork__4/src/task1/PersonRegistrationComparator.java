package task1;

import java.util.Comparator;

public class PersonRegistrationComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        long a = o1.getRegistration().toEpochDay() - o2.getRegistration().toEpochDay();
        int result = a > 0 ? -1 : 0;
        return result;
    }
}
