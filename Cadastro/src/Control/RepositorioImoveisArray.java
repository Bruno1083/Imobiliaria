
package Control;

import java.util.ArrayList;

import Model.Imovel;

public class RepositorioImoveisArray {
	ArrayList <Imovel> listaImovel;
	public RepositorioImoveisArray() {
        this.listaImovel = new ArrayList<Imovel>();
    }

	public void procurarIndice( int codigo) {
		if(listaImovel != null && !listaImovel.isEmpty())
			this.listaImovel.indexOf(listaImovel);
			  
	}

	/*public void AlterarMedico(Imovel medico) {
		for (int i = 0; i < this.listaImovel.size(); i++) {
			if (this.listaMedico.get(i).getCrm().equals(medico.getCrm())) {
				this.listaMedico.set(i, medico);
			}
		}
	}

	public void ExcluirMedico(Imovel medico) {
		for (int i = 0; i < this.listaMedico.size(); i++) {
			if (this.listaMedico.get(i).getCrm().equals(medico.getCrm())) {
				this.listaMedico.remove(i);
			}
		}
	}

	public ArrayList<Imovel> ListarMedico() {
		return listaMedico;
	}*/

}
