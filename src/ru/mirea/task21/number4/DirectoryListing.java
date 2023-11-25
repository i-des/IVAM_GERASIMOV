package ru.mirea.task21.number4;

import java.io.File;
import java.io.IOException;

public class DirectoryListing {

    public static void main(String[] args) {
        // Создаем каталог
        String directoryPath = "example_directory";
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean success = directory.mkdir();
            if (!success) {
                System.out.println("Не удалось создать каталог.");
                return;
            }
        }

        // Создаем несколько файлов в каталоге
        try {
            for (int i = 1; i <= 10; i++) {
                File file = new File(directory, "file" + i + ".txt");
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Получаем список файлов/каталогов
        File[] filesArray = directory.listFiles();

        if (filesArray != null) {
            // Выводим первые 5 элементов
            System.out.println("Первые 5 элементов в каталоге " + directoryPath + ":");
            int limit = Math.min(filesArray.length, 5);
            for (int i = 0; i < limit; i++) {
                System.out.println(filesArray[i].getName());
            }
        } else {
            System.out.println("Не удалось получить содержимое каталога.");
        }
    }
}

