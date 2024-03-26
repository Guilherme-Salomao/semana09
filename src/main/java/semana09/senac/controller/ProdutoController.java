package semana09.senac.controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import semana09.senac.model.Produto;
import semana09.senac.produto.DadosCadastroProduto;
import semana09.senac.repository.FabricanteRepository;
import semana09.senac.repository.ProdutoRepository;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FabricanteRepository fabricanteRepository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        produtoRepository.save(dados.produto());

        //fabricanteRepository.save(dados.fabricante());
    }
}
