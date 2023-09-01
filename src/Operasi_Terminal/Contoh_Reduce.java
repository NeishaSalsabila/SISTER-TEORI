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
public class Contoh_Reduce {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Menggunakan reduce() untuk menjumlahkan elemen-elemen dalam stream
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        // Mencetak hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + sum);
    }
    
}
