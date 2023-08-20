import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.CyberProj.CyberCafe.dados.InterfaceColecaoUsuario;
import main.java.com.CyberProj.CyberCafe.negocio.basica.Usuario;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioDuplicadoException;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioNaoExisteException;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario {
	@Autowired
	private InterfaceColecaoUsuario colecaoUsuario;

	
	public Usuario procurarUsuarioEmail(String email) 
			throws UsuarioNaoExisteException {
		Usuario u = colecaoUsuario.findByEmail(email); 
		if(u == null) {
			throw new UsuarioNaoExisteException(email);
		}
		return u;
	}
	
	public Usuario salvarUsuario(Usuario entity)
				throws UsuarioDuplicadoException {
		try {
			procurarUsuarioEmail(entity.getEmail());
			throw new UsuarioDuplicadoException(entity.getEmail());
		} catch(UsuarioNaoExisteException err) {
			return colecaoUsuario.save(entity);
		}
	}

	public List<Usuario> listarUsuarios() {
		return colecaoUsuario.findAll();
	}

	public boolean verificarExistenciaUsuarioId(Long id) {
		return colecaoUsuario.existsById(id);
	}

	public Usuario localizarUsuarioId(Long id) {
		return colecaoUsuario.findById(id).orElse(null);
	}
	
	public void removerUsuarioPorNome(String nome) throws UsuarioNaoExisteException {
	    Usuario usuario = procurarUsuarioPorNome(nome);
	    colecaoUsuario.delete(usuario);
	}

	private Usuario procurarUsuarioPorNome(String nome) throws UsuarioNaoExisteException {
	    Optional<Usuario> usuarioOptional = colecaoUsuario.findByNome(nome);

	    if (usuarioOptional.isPresent()) {
	        return usuarioOptional.get();
	    } else {
	        throw new UsuarioNaoExisteException("Usuário com o nome '" + nome + "' não encontrado");
	    }
	}

	
	
}