/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CyberProj.CyberCafe.Negocio;

/**
 *
 * @author Usuário
 */

public class Recepcionista {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void  chamarTecnico(){
        
    }
    
    public void consultar(Usuario me){
        System.out.println(me.getID() + me.getNome() + me.getDebito() +  me.getMaquina());
        
      
    }
    
    public void trocarMaquina(Usuario me){
        //vê se tem alguma maquina parecida disponivel e depopis troca;
        String nome_maquina = "digite";
        me.setMaquina(nome_maquina);
    }
    
    public void proverLanche(Usuario me){
        //essa somente atualiza o bd e seu registro de operacoes;
        
    }

    
}
