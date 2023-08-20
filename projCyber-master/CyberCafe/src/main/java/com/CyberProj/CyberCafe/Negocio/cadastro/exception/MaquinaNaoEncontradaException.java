package main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception;

public class MaquinaNaoEncontradaException extends Exception {

    public MaquinaNaoEncontradaException() {
        super("Máquina não encontrada.");
    }

    public MaquinaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}