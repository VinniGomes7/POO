import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.CyberProj.CyberCafe.dados.InterfaceColecaoMaquina;
import main.java.com.CyberProj.CyberCafe.negocio.basica.Maquina;
import main.java.com.CyberProj.CyberCafe.negocio.cadastro.exception.MaquinaNaoEncontradaException;

@Service
public class CadastroMaquina implements InterfaceCadastroMaquina {
    @Autowired
    private InterfaceColecaoMaquina colecaoMaquina;

    public Maquina procurarMaquinaPorId(Long id) throws MaquinaNaoEncontradaException {
        return colecaoMaquina.findById(id)
            .orElseThrow(() -> new MaquinaNaoEncontradaException("Máquina com ID " + id + " não encontrada"));
    }

    public Maquina cadastrarMaquina(Maquina maquina) {
        return colecaoMaquina.save(maquina);
    }

    public List<Maquina> listarMaquinas() {
        return colecaoMaquina.findAll();
    }

    public boolean verificarExistenciaMaquinaId(Long id) {
        return colecaoMaquina.existsById(id);
    }

    public void removerMaquina(Long id) throws MaquinaNaoEncontradaException {
        if (!verificarExistenciaMaquinaId(id)) {
            throw new MaquinaNaoEncontradaException("Máquina com ID " + id + " não encontrada");
        }
        colecaoMaquina.deleteById(id);
    }
}