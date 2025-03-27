import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Пример массива строк
        String[] strings = {"Dog", "Cat", "Dog", "Borsh", "Cat", "Moon", "Borsh"};

        // Вызов метода для удаления дубликатов и объединения строк
        String result = removeDuplicatesAndConcatenate(strings);

        System.out.println(result);
        // Вывод: "DogCatBorshMoon"
    }

    public static String removeDuplicatesAndConcatenate(String[] strings) {
        // Используем LinkedHashSet для хранения уникальных строк и сохранения порядка
        Set<String> uniqueStrings = new LinkedHashSet<>();

        // Добавляем строки в LinkedHashSet
        for (String string : strings) {
            uniqueStrings.add(string);
        }

        // Объединяем оставшиеся строки в одну
        StringBuilder result = new StringBuilder();
        for (String string : uniqueStrings) {
            result.append(string);
        }

        return result.toString();
    }
}