/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan21programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 21
 */
public class PBOULG10115557Latihan21ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rata, jumlah = 0;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        nilai = new int[n];
        
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa Ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
        
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
        
        rata = jumlah/n;   
             System.out.println("Maka, Rata-rata Nilainya adalah : " + rata);
    }
}
    