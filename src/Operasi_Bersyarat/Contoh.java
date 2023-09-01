/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operasi_Bersyarat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author hp
 */
public class Contoh {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Menggunakan findFirst() untuk menemukan elemen pertama yang genap
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        // Mencetak hasil pencarian
        if (firstEven.isPresent()) {
            System.out.println("Elemen pertama yang genap: " + firstEven.get());
        } else {
            System.out.println("Tidak ada elemen genap yang ditemukan.");
        }
    }
}
