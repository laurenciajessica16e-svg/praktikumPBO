<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {

        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("12301001", "Adi");
        mahasiswaMap.put("12301002", "Bambang");
        mahasiswaMap.put("12301003", "Cici");
        mahasiswaMap.put("12301004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {

        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("12301001", "Adi");
        mahasiswaMap.put("12301002", "Bambang");
        mahasiswaMap.put("12301003", "Cici");
        mahasiswaMap.put("12301004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
>>>>>>> Praktikum13
