package com.CyberProj.CyberCafe.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.CyberProj.CyberCafe.Negocio.basica.Usuario;

@Repository
public interface InterfaceColecaoUsuario 
	extends JpaRepository<Usuario, Long>{
	
	
	public Usuario findByEmail(String email);

}