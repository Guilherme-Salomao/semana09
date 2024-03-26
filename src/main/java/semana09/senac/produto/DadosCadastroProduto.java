package semana09.senac.produto;

import semana09.senac.model.Fabricante;
import semana09.senac.model.Produto;

public record DadosCadastroProduto(String nome, String descricao, Double preco, Fabricante fabricante) {

    public Produto produto() {
    }
}
