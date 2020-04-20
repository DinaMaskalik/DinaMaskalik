package task1;

import java.util.HashMap;
import java.util.Map;

public class SearchWithMap implements ISearch {

    Map<String, Integer> data = new HashMap<>();

    public String getTextWithoutPunctuation(String str) {
        String[] s = new String[]{".", ",", "!", "?", "(", ")", "-", ":", ";", "\"", "\n"};

        for (int i = 0; i < s.length; i++) {
            str = str.replace(s[i], " ");
        }

        return str;
    }

    private void getMap(String str) {
        if (data.size() != 0) return;
        str = getTextWithoutPunctuation(str);
        str = str.toLowerCase();
        String[] data1 = str.split(" ");

        for (int i = 0; i < data1.length; i++) {
            if (!data1[i].equals("")) {
                if (data.containsKey(data1[i])) {
                    data.put(data1[i], data.get(data1[i]) + 1);
                } else {
                    data.put(data1[i], 1);
                }
            }
        }

    }

    @Override
    public void search(String str, String word) {
        getMap(str);
        System.out.println("Слово " + word + " в тексте встречается " + data.get(word) + " раз(а)");
    }
}
