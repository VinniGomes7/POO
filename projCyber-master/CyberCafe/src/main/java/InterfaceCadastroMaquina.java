package main.java.com.CyberProj.CyberCafe.negocio.cadastro;

import java.util.List;

import main.java.com.CyberProj.CyberCafe.negocio.basica.Maquina;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.MaquinaNaoEncontradaException;

public interface InterfaceCadastroMaquina {

    Maquina procurarMaquinaPorId(Long id) throws MaquinaNaoEncontradaException;

    Maquina cadastrarMaquina(Maquina maquina);

    List<Maquina> listarMaquinas();

    boolean verificarExistenciaMaquinaId(Long id);

    void removerMaquina(Long id) throws MaquinaNaoEncontradaException;
}
