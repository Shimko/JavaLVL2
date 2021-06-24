package CollectionHomeWork;
//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи,
//        а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
//        что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.
//        Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
//        взаимодействие с пользователем через консоль и т.д).
//        Консоль использовать только для вывода результатов проверки телефонного справочника.


import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook= new PhoneBook();
        phoneBook.add("Иванов", "234523");
        phoneBook.add("Кузнецов", "234545");
        phoneBook.add("Сидоров", "89667");
        phoneBook.add("Иванов", "342353");
        phoneBook.add("Сидоров", "834523");
        phoneBook.get("Иванов");
    }
   private Map <String, HashSet<String>> phoneBook = new HashMap<>();
   public void add(String surname, String number){
       if(phoneBook.containsKey(surname)){
           phoneBook.get(surname).add(number);
       }else {
           phoneBook.put(surname,new HashSet<>(Arrays.asList(number)));
       }
   }
   public void get(String surname){
       System.out.println("Номер(а) телефона(ов) " +(surname)+" " +  (phoneBook.get(surname)));
   }

}
