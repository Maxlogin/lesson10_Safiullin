package zad3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Practicum {
    private static ContactBook<Phone> friendsContactBook = new ContactBook<>();
    private static ContactBook<Email> colleaguesContactBook = new ContactBook<>();
    private static ContactBook<SocialNetworkContact> classmatesContactBook = new ContactBook<>();
    private static ContactBook<Address> relativesContactBook = new ContactBook<>();

    public static void main(String[] args) {
        fillBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Сегодня Новый Год! 1 - Отправить оскорбление, 0 - Послать позднее");
            int mainCommand = scanner.nextInt();
            if (mainCommand == 1) {
                System.out.println("Какую книгу контактов открыть?");
                System.out.println("1 - Твари, 2 - Мрази, 3 - Обосрышы, 4 - Умники");

                int bookIndex = scanner.nextInt();
                if (bookIndex == 1) {
                    friendsContactBook.printList();
                } else if (bookIndex == 2) {
                    colleaguesContactBook.printList();
                } else if (bookIndex == 3) {
                    classmatesContactBook.printList();
                } else if (bookIndex == 4) {
                    relativesContactBook.printList();
                }

                System.out.println("Кого вы хотите послать? Введите имя:");
                String name = scanner.next();
                if (bookIndex == 1) {
                    friendsContactBook.congratulate(name);
                } else if (bookIndex == 2) {
                    colleaguesContactBook.congratulate(name);
                } else if (bookIndex == 3) {
                    classmatesContactBook.congratulate(name);
                } else if (bookIndex == 4) {
                    relativesContactBook.congratulate(name);
                }
            } else if (mainCommand == 0) {
                break;
            }
        }
    }

    private static void fillBooks() {
        friendsContactBook.addContact(new Phone("Имиль_Саляхов", "+7-909-000-11-22"));
        friendsContactBook.addContact(new Phone("Максим_Карпов", "+7-999-555-11-22"));
        friendsContactBook.addContact(new Phone("Эмиль_Гайнуллин", "+7-979-698-00-22"));

        colleaguesContactBook.addContact(new Email("Александр_Конов", "sasha@sasha.ru"));
        colleaguesContactBook.addContact(new Email("Даниэль_Ильдарович", "pasha@pasha.ru"));
        colleaguesContactBook.addContact(new Email("Артём_Архипов", "oleg@oleg.ru"));

        classmatesContactBook.addContact(new SocialNetworkContact("Проститутка", "НаСвязи", "olya_shluh"));
        classmatesContactBook.addContact(new SocialNetworkContact("Наташа", "Горловой", "natashka"));

        relativesContactBook.addContact(new Address("Баба_Каппа", "Дупло_дуба", "Дупловская,_планета Крым"));
        relativesContactBook.addContact(new Address("Дедуля_Шершуля", "Дупло_Дуба", "Дупловская,_1планета Крым"));
    }
}
