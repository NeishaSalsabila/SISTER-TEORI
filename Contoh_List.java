/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author hp
 */
public class Contoh_List {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Java", "PHP", "C++", "Python", "JavaScript");

        // Membuat Stream dari List
        Stream<String> streamFromList = myList.stream();

        // Mencetak elemen-elemen dari Stream
        streamFromList.forEach(element -> System.out.println(element));
    }
}





