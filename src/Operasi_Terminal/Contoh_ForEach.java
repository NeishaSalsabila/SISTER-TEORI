/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operasi_Terminal;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author hp
 */
public class Contoh_ForEach {
     public static void main(String[] args) {
        List<String> nama = Arrays.asList("Neisha", "Ney", "Ca");

        // Menggunakan forEach() untuk mencetak setiap elemen dalam stream
        nama.stream()
                .forEach(System.out::println);
    }
}
