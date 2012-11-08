package model.factories;

import model.entity.Produto;
import view.vo.ProdutoVO;

public class ProdutoFactory {

	public static Produto getProdutoByVO(ProdutoVO vo) {
		Produto p = new Produto();
		p.setDescricao(vo.getDescricao());
		p.setQuantidade(vo.getQuantidade());
		p.setValor(vo.getValor());
		return p;
	}

}
