package semana09.senac.produto;

import semana09.senac.model.Fabricante;

public record DadosCadastroProduto(String nome, String descricao, Double preco, Fabricante fabricante) {

}
