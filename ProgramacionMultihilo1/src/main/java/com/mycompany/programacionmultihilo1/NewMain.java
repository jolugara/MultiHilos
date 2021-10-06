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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Iniciando hilo principal;");

         Hilo mh=new Hilo("");

         mh.start();

         for (int i=0;i<50;i++){
             System.out.print("");
         try {
             Thread.sleep((long)(Math.random() * 5000));
         }catch (InterruptedException exc) {
             System.out.println("Hilo principal interrumpido");
         }
         }
         System.out.println("Hilo principal finalizado");
    }

    public static class Hilo extends Thread {
    Hilo(String nombre){
        super(nombre);
    }

    public void run(){
    try {
        for (int cont=1;cont<11;cont++){
            Thread.sleep((long)(Math.random() * 5000));
            System.out.println("Hilo" +cont);
        }
    }catch (InterruptedException exc){
        System.out.println("interrumpido.");
    }
        System.out.println("finalizando.");
    }
  }
    
}
