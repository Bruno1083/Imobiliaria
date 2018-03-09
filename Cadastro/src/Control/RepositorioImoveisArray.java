package Control;

import java.util.ArrayList;

import Model.Imovel;

public class RepositorioImoveisArray {
	ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();

	public RepositorioImoveisArray() {
		this.listaImovel = new ArrayList<Imovel>();
	}

	public void procurarIndice(int codigo) {
		if (listaImovel != null && !listaImovel.isEmpty())
			this.listaImovel.indexOf(listaImovel);
	}

	public void procurarImovel(int codigo) {
		if (listaImovel != null) {
			this.listaImovel.get(codigo);
		} else {
			this.listaImovel = null;
		}
	}

	public void inserir(Imovel imovel) {
		if (!listaImovel.isEmpty()) {
			listaImovel.add(imovel);
		}
	}

	/*
	 
	 * public boolean atualizar(Imovel i) → Atualiza o imóvel passado como
	 * parâmetro, retornando falso se não encontrar o imóvel.
	 * 
	 * 
	 * public boolean remover(String numero) → Remove o imóvel identificado pelo
	 * número passado como parâmetro, retornando falso se não encontrar o
	 * imóvel.
	 * 
	 * 
	 * public boolean existe(String numero) → Retorna verdadeiro se localizou no
	 * repositório o imóvel identificado pelo número passado como parâmetro ou
	 * falso se não encontrar o imóvel.
	 */

}
