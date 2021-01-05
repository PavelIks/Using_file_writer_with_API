package com.company;
import java.io.*;
import java.util.stream.IntStream;

/*Применение Stream API в файлах...*/

/*public class Main
{
    public static void main(String[] args) throws IOException
    {
        int[] numbers = {1, 2, 3, 4, 5};
        FileWriter fileWriter = new FileWriter("file.txt");
        Integer a = IntStream.of(numbers).sum();
        String s = String.valueOf(a);
        System.out.println(s);
        fileWriter.write(s);
        fileWriter.close();
    }
}*/
/*ответ: 15*/

/*public class Main
{
    public static void main(String[] args)
    {
        try
        {
            int[] numbers = {1, 2, 3, 4, 5};
            File file1 = new File("file1.txt");
            FileWriter fileWriter = new FileWriter(file1, false);
            Integer a = IntStream.of(numbers).sum();
            char[] s = a.toString().toCharArray();
            System.out.println(s);
            fileWriter.write(s);
            fileWriter.close();
        }
        catch (IOException exception)
        {
            System.out.print(exception.getMessage());
        }
    }
}*/
/*ответ: 15*/