package task1;

public class SearchWithArray implements ISearch {

    public String getTextWithoutPunctuation(String str) {
        String[] s = new String[]{".", ",", "!", "?", "(", ")", "-", ":", "\"", ";", "\n"};
        str = str.toLowerCase();

        for (int i = 0; i < s.length; i++) {
            str = str.replace(s[i], " ");
        }
        return str;
    }

    @Override
    public void search(String str, String word) {
        int amount = 0;

        str=getTextWithoutPunctuation(str);
        String[] data=str.split(" ");
        for (String datum : data) {
            if (datum.equals(word)) {
                amount++;
            }
        }

        if (amount == 0) {
            System.out.println("Такого слова в этом тексте нет!");
            return;
        }
        System.out.println("Слово " + word + " в тексте встречается " + amount + " раз(а)");
    }
}
