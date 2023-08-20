package main.java.com.CyberProj.CyberCafe.negocio.cadastro;

import java.util.List;

import main.java.com.CyberProj.CyberCafe.negocio.basica.Produto;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.ProdutoDuplicadoException;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.ProdutoNaoEncontradoException;

public interface InterfaceCadastroProduto {

    Produto procurarProdutoPorId(Long id) throws ProdutoNaoEncontradoException;

    Produto cadastrarProduto(Produto produto) throws ProdutoDuplicadoException;

    List<Produto> listarProdutos();

    boolean verificarExistenciaProdutoId(Long id);

    void removerProduto(Long id) throws ProdutoNaoEncontradoException;
}
