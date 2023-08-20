import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import main.java.com.CyberProj.CyberCafe.negocio.basica.Usuario;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.CadastroUsuario;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioDuplicadoException;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.UsuarioNaoExisteException;

@SpringBootTest
public class CadastroUsuarioTest {

    private CadastroUsuario cadastroUsuario;
    private InterfaceColecaoUsuario colecaoUsuarioMock;

    @BeforeEach
    public void setUp() {
        colecaoUsuarioMock = mock(InterfaceColecaoUsuario.class);
        cadastroUsuario = new CadastroUsuario(colecaoUsuarioMock);
    }

    @Test
    public void testSalvarUsuario() throws UsuarioDuplicadoException {
        Usuario novoUsuario = new Usuario(Teste);
        when(colecaoUsuarioMock.existsByEmail(novoUsuario.getEmail())).thenReturn(false);
        when(colecaoUsuarioMock.save(any(Usuario.class))).thenReturn(novoUsuario);

        Usuario usuarioSalvo = cadastroUsuario.salvarUsuario(novoUsuario);

        assertNotNull(usuarioSalvo);
        assertEquals(novoUsuario.getEmail(), usuarioSalvo.getEmail());
    }

    @Test
    public void testProcurarUsuarioEmail() throws UsuarioNaoExisteException {
        String email = "exemplo@email.com";
        Usuario usuario = new Usuario(Teste);
        when(colecaoUsuarioMock.findByEmail(email)).thenReturn(usuario);

        Usuario usuarioEncontrado = cadastroUsuario.procurarUsuarioEmail(email);

        assertNotNull(usuarioEncontrado);
        assertEquals(usuario.getEmail(), usuarioEncontrado.getEmail());
    }


}
