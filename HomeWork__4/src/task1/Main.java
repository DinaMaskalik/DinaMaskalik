package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int PERSONSIZE = 100000;
        final int ANIMALSIZE = 100000;

        RandomData randomData = new RandomData();
        DataContainer<Person> personDataContainer = new DataContainer<>(new Person[PERSONSIZE]);
        DataContainer<Animal> animalDataContainer = new DataContainer<>(new Animal[ANIMALSIZE]);
        for (int i = 0; i < PERSONSIZE; i++) {
            personDataContainer.add(new Person(randomData.getNick(), randomData.getPersonPassword(), randomData.getPersonRegistration()));
        }

        for (int i = 0; i < ANIMALSIZE; i++) {
            animalDataContainer.add(new Animal(randomData.getAge(), randomData.getNick()));
        }

        System.out.println(Arrays.toString(personDataContainer.getData()));
        System.out.println();
        System.out.println(Arrays.toString(animalDataContainer.getData()));
        System.out.println();

        personDataContainer.sort(personDataContainer, new PersonRegistrationComparator());
        System.out.println(Arrays.toString(personDataContainer.getData()));
        System.out.println();

        animalDataContainer.sort(animalDataContainer, new AnimalAgeComparator());
        System.out.println(Arrays.toString(animalDataContainer.getData()));
        System.out.println();

        personDataContainer.delete(5);
        System.out.println(Arrays.toString(personDataContainer.getData()));
        System.out.println();

        animalDataContainer.delete(animalDataContainer.getData()[2]);
        System.out.println(Arrays.toString(animalDataContainer.getData()));
        System.out.println();

    }
}
