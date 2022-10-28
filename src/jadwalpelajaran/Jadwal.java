/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadwalpelajaran;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Jadwal {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        String [] senin ={"BAHASA INDONESIA", "KIMIA", "FISIKA","TAHFIDZ","BAHASA INGGRIS"};
        String ulang;
        String pilih = null;
        
        
        do{
            System.out.println("");
            System.out.println("PILIH HARI:");
            pilih = masukan.next();
            if (pilih.equals("senin")){
                System.out.println("jadwal hari senin:");
                System.out.println(senin[0]);
                System.out.println(senin[1]);
                System.out.println(senin[2]);
                System.out.println(senin[3]);
                System.out.println(senin[4]);
            }
            System.out.println("");
            System.out.println("apakah anda ingin mengulang jadwal pelajaran lagi?");
            ulang = masukan.next();
            
            
        }while(ulang.equals("ya"));
        System.out.println("terimakasi");
        
    }
    }
    }
    

