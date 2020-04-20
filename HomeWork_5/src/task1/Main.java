package task1;

public class Main {

    public static void main(String[] args) throws Exception {
        ReadTextAsString file = new ReadTextAsString();
        String str = file.readFileAsString("C:\\Users\\Admin\\Desktop\\Война и мир.txt");

        SearchWithMap search = new SearchWithMap();
        search.search(str, "война");
        search.search(str, "и");
        search.search(str, "мир");

        System.out.println();

        SearchWithArray search1 = new SearchWithArray();
        search1.search(str, "война");
        search1.search(str, "и");
        search1.search(str, "мир");


    }
}
