package com.CyberProj.CyberCafe.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CyberProj.CyberCafe.Negocio.basica.Maquina;

@Repository
public interface InterfaceColecaoMaquina extends JpaRepository<Maquina, Long> {

}
