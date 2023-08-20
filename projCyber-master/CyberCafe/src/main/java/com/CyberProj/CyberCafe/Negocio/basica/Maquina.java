/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CyberProj.CyberCafe.Negocio;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public abstract class Maquina {
        private int ID;
        private int tempo;
        private boolean desligar;
        
    public void manuntencao(){
        //chamar o tecnico;
        this.setDesligar(true);
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public boolean isDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
    }
   
    public void desligar(){
        
    }
    
    public void adicionarTempo(int tempo){
        this.setTempo(this.getTempo() + tempo);
    }


    public String indicarProblemas() {
        //envia o relatorio para o bd
    	Scanner poo = new Scanner(System.in);
    	
    	try {
    	
        System.out.println("indique qual o problema");
        String problema = poo.nextLine();
        System.out.println(" " + poo);
        return problema;}
        	finally{
        
        poo.close();
      }
        
    }

   
    public void encerrarSessao() {
        this.setDesligar(true);
    }
}
