package Model;

public class Imovel {

	private int codigo;
	private double area;
	private int garagem;
	private String tipoImovel;
	private int numeroQuartos;
	private double precoImovel;
	private String bairro;
	private int numeroBanheiros;	
	
	public Imovel() {
		
	}
	
	
	public Imovel(int codigo, double area, int garagem, String tipoImovel, int numeroQuartos, double precoImovel,
			String bairro, int numeroBanheiros) {
		super();
		this.codigo = codigo;
		this.area = area;
		this.garagem = garagem;
		this.tipoImovel = tipoImovel;
		this.numeroQuartos = numeroQuartos;
		this.precoImovel = precoImovel;
		this.bairro = bairro;
		this.numeroBanheiros = numeroBanheiros;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getGaragem() {
		return garagem;
	}
	public void setGaragem(int garagem) {
		this.garagem = garagem;
	}
	public String getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	public double getPrecoImovel() {
		return precoImovel;
	}
	public void setPrecoImovel(double precoImovel) {
		this.precoImovel = precoImovel;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	public void setNumeroBanheiros(int numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}


	@Override
	public String toString() {
		return "Imovel [codigo=" + codigo + ", area=" + area + ", garagem=" + garagem + ", tipoImovel=" + tipoImovel
				+ ", numeroQuartos=" + numeroQuartos + ", precoImovel=" + precoImovel + ", bairro=" + bairro
				+ ", numeroBanheiros=" + numeroBanheiros + "]";
	}
	

}
