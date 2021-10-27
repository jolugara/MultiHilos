/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacionmultihilo1;

/**
 *
 * @author alumno
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Iniciando hilo principal;");

         Hilo mh=new Hilo("");
         Hilo2 mh2=new Hilo2("");

         mh.start();
         mh2.start();  
    }

    public static class Hilo extends Thread {
    Hilo(String nombre){
        super(nombre);
    }

    public void run(){
    try {
        for (int cont=1;cont<11;cont++){
            Thread.sleep((long)(Math.random() * 5000));
            System.out.println("+Hilo" +cont);
        }
    }catch (InterruptedException exc){
        System.out.println("Hilo1 interrumpido.");
    }
        System.out.println("Hilo1 finalizando.");
    }
  }
    
     public static class Hilo2 extends Thread {
    Hilo2(String nombre){
        super(nombre);
    }

    public void run(){
    try {
        for (int cont=1;cont<11;cont++){
            Thread.sleep((long)(Math.random() * 5000));
            System.out.println("-Hilo" +cont);
        }
    }catch (InterruptedException exc){
        System.out.println("Hilo2 interrumpido.");
    }
        System.out.println("Hilo2 finalizando.");
    }
    
  }   
}
