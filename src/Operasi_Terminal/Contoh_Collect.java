/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operasi_Terminal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class Contoh_Collect {
     public static void main(String[] args) {
        List<String> words = Arrays.asList("Neisha", "Alfi", "Arshifa", "Jessica", "Libryan", "Messy");

        // Mengumpulkan kata-kata yang diawali huruf 'a' ke dalam List baru
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

        // Mencetak kata-kata yang diawali huruf 'a'
        System.out.println("Kata-kata yang diawali 'A': " + filteredWords);
    }
}
