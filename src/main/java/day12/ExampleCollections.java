package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExampleCollections {

    public static void main(String[] args) {

        Collection collection_1 = createFirstCollection();
        Collection collection_2 = createSecondCollection();

        // Демонстрация прохода по коллекции
        System.out.println("------------------------------------------");
        for(Object obj: collection_1) {
            System.out.println("Item: " + obj);
        }

        System.out.println();

        // Демонстрация прохода по коллекции через итератор
        System.out.println("------------------------------------------");
        for(Iterator it = collection_1.iterator(); it.hasNext(); ) {
            String s = (String)it.next();
            System.out.println("Item: " + s);
        }

        System.out.println();

        // Демонстрации групповых операций
        System.out.println("------------------------------------------");
        // Можно проверить сожержаться ли ВСЕ элементы collection_2 в collection_1
        if(collection_1.containsAll(collection_2)) {
            System.out.println("Коллекция collection_1 содержит все от collection_2");
        } else {
            System.out.println("Коллекция collection_1 не содержит элементы collection_2");
        }

        // Добавление всех элементов collection_2 в collection_1
        System.out.println("------------------------------------------");

        collection_1.addAll(collection_2);
        for (Object obj: collection_1) {
            System.out.println("Item " + obj);
        }

        // Удаление всех элементов collection_2 в collection_1
        System.out.println("------------------------------------------");
        collection_1.removeAll(collection_2);
        for (Object obj: collection_1) {
            System.out.println("Item " + obj);
        }

        // Пересоздаем коллекции для дпальнейшей демонстрации
        System.out.println("------------------------------------------");
        collection_1 = createFirstCollection();
        collection_2 = createSecondCollection();

        collection_1.retainAll(collection_2);
        for(Object o : collection_1) {
            System.out.println("Item:" + o);
        }
        System.out.println("============= Очистка коллекции - не будет элементов");
        collection_1.clear();
        for(Object o : collection_1) {
            System.out.println("Item:" + o);
        }
        System.out.println();

        // Удаление элемента коллекции
        // Снова создаем коллекцию для демонстрации
        collection_1 = createFirstCollection();
        // Удаляем один элемент
        collection_1.remove("1");
        System.out.println("============= Удаляем элемент '1' - его не будет в списке");
        for(Object o : collection_1) {
            System.out.println("Item:" + o);
        }

        // Удаление коллекции через итератор
        // Снова создаем коллекцию для демонстрации
        collection_1 = createFirstCollection();
        System.out.println("============= Удаление через итератор");
        while(!collection_1.isEmpty()) {
            Iterator it = collection_1.iterator();
            Object o = it.next();
            System.out.println("Удаляем:" + o);
            // Удаляем элемент
            it.remove();
        }
    }

    private static Collection createFirstCollection() {

        // Создание коллекции на основе класса ArrayList
        Collection collection = new ArrayList();

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");
        collection.add("7");

        return collection;
    }

    private static Collection createSecondCollection() {

        Collection collection = new ArrayList();

        collection.add("8");
        collection.add("9");
        collection.add("10");

        return collection;
    }
}
