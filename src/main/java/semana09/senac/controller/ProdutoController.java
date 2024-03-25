package semana09.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        System.out.println(dados);
    }
}
