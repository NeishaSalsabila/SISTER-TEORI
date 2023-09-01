/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.stream.Stream;

/**
 *
 * @author hp
 */
public class Contoh_StreamOf {
    public static void main(String[] args) {
        // Membuat Stream dari sejumlah data
        Stream<Integer> streamFromData = Stream.of(1, 2, 3, 4, 5);

        // Mencetak elemen-elemen dari Stream
        streamFromData.forEach(number -> System.out.println(number));
    }
}
