package CollectionHomeWork;
//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
//        из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

import java.util.*;

public class WordCheck {
    public static void main(String[] args) {
        String[] list = new String[] {"Стул","Стул", "Стол", "Стул","Шкаф", "холодильник"};
        Map<String,Integer> uniqueWords = new HashMap<>();


        for (String word: list) {
            if(uniqueWords.containsKey(word)){
                uniqueWords.put(word,  uniqueWords.get(word) + 1);
            }else {
                uniqueWords.put(word, 1);
            }
        }
        for (Map.Entry entry: uniqueWords.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
