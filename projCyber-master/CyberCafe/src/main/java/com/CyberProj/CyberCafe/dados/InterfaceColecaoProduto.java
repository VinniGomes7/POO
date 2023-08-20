package com.CyberProj.CyberCafe.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CyberProj.CyberCafe.Negocio.basica.Produto;

@Repository
public interface InterfaceColecaoProduto extends JpaRepository<Produto, Long> {

    boolean existsByNome(String nome);
}
