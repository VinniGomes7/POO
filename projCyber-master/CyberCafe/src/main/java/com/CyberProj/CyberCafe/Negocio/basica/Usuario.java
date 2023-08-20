/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CyberProj.CyberCafe.Negocio;

    /**
 *
 * @author Usuário
 */
public class Usuario implements UsuarioInterface {
    private String nome;
    private int ID;
    private float debito;
    private String maquina;
    
    public void efetuarCadastro(String nome){
        this.nome = nome;
        this.ID = this.getID();
        this.debito = this.getDebito();
        this.maquina = this.getMaquina();
    }
    
    public void escolherMaquina(String maquina, int tempo){
        
    }
    
    public void avaliacaoMaquina(){
        
    }
    
    public void avaliacaoLanche(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    @Override
    public void adicionarTempo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pedirLanche() {
        //lanche tera que ser uma lista
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultar() {
         System.out.println(this.getID() + this.getNome() + this.getDebito() +  this.getMaquina());
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void trocarMaquina() {
        //envia uma requesicao a recepcionista
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encerrarSessao(MaquinaJogos tal) {
        tal.setDesligar(true);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


