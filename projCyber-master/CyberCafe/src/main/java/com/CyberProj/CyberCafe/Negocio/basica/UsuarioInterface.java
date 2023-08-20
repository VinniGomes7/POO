/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CyberProj.CyberCafe.Negocio;

/**
 *
 * @author Usuário
 */
public interface UsuarioInterface {
    public abstract void adicionarTempo();
    public abstract void pedirLanche();
    public abstract void consultar();
    public abstract void trocarMaquina();
    public abstract void encerrarSessao(MaquinaJogos tal);
    //a interface será override em Usuario;
    //adicionarTempo também terá override em Maquina;
}
