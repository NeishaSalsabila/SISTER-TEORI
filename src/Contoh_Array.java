/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author hp
 */
public class Contoh_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Membuat IntStream dari array int
        IntStream streamFromArray = Arrays.stream(numbers);

        // Mencetak elemen-elemen dari IntStream
        streamFromArray.forEach(number -> System.out.println(number));
    }
}
