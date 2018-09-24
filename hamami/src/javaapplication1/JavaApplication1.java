/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hamami
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  String nama = "hamami";
        // char gender = 'L';
        // int umur= 20;

        //System.out.println("hi namaku="+nama+"\numur="+umur+"\ngender="+gender);
//    int n=5;
//    for(int i=0; i<n;i++){
//        int a=i+1;
//        for(int x=0;x<a;x++){
//            System.out.print("*");
//        }
//        System.out.println("");
        Scanner keyboard = new Scanner(System.in);
        int umur;
        System.out.print("umurmu= ");
        umur = keyboard.nextInt();

        boolean cantik = true;
         if(umur>23 && cantik==true){
           System.out.println("Sangat mau");
       }
         else if(umur>23 ){
           System.out.println("Saya pikir dulu");
       }
       else {
           System.out.println("maaf saya tidak mau");
       }
    }

}
