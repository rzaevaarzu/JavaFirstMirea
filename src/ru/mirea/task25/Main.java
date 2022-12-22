package ru.mirea.task25;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void writeToFile(String fileName)
    {
        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для записи в файл: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, false))
        {
            // Write input to file
            writer.write(input);
            writer.flush();
        }
        catch (IOException ex)
        {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }


    public static void printFile(String fileName)
    {
        try (FileReader reader = new FileReader(fileName))
        {
            // Read the file
            int c;
            System.out.println("Содержимое файла:");
            System.out.println("------------------------");
            while ((c = reader.read()) != -1)
            {
                System.out.print((char)c);
            }

            System.out.println("------------------------");
        }
        catch (IOException ex)
        {
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }
    }


    public static void appendToFile(String fileName)
    {
        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для добавления в файл: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true))
        {
            // Write input to file
            writer.write(input + String.format("%n"));
            writer.flush();
        }
        catch (IOException ex)
        {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for filename
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        // If not provided, use default
        if (fileName == null || fileName.isEmpty())
        {
            fileName = "PR25.txt";
        }

        // Show menu
        while (true)
        {
            System.out.println("0. Выбрать другой файл");
            System.out.println("1. Записать в файл");
            System.out.println("2. Прочитать файл");
            System.out.println("3. Добавить в файл");
            System.out.println("4. Выход");
            System.out.print("Введите номер команды: ");
            int input = scanner.nextInt();

            switch (input)
            {
                case 0:
                    System.out.print("Введите имя файла: ");
                    fileName = scanner.nextLine();
                    break;
                case 1:
                    writeToFile(fileName);
                    break;
                case 2:
                    printFile(fileName);
                    break;
                case 3:
                    appendToFile(fileName);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неверный номер команды");
                    break;
            }
        }
    }
}
