/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operasi_Intermidate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author hp
 */
public class Contoh_Map {
     public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Mengubah kata-kata menjadi panjang (jumlah karakter)
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // Mencetak panjang (jumlah karakter) dari setiap kata
        System.out.println("Panjang kata-kata: " + wordLengths);
    }
}
