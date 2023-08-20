package main.java.com.CyberProj.CyberCafe.negocio.cadastro;

import java.util.List;

import main.java.com.CyberProj.CyberCafe.negocio.basica.Usuario;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioDuplicadoException;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioNaoExisteException;

public interface InterfaceCadastroUsuario {

	Usuario procurarUsuarioEmail(String email) throws UsuarioNaoExisteException;

	Usuario salvarUsuario(Usuario entity) throws UsuarioDuplicadoException;

	List<Usuario> listarUsuarios();

	boolean verificarExistenciaUsuarioId(Long id);

	Usuario localizarUsuarioId(Long id);

}