package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива short " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива String " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива float " + prices.length);
        String[] names = new String[4];
        names[0] = "Петр";
        System.out.println(names[0]);
        names[1] = "Иван";
        System.out.println(names[1]);
        names[2] = "Роман";
        System.out.println(names[2]);
        names[3] = "Юрий";
        System.out.println(names[3]);
    }
}
