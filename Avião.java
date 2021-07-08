package familia28;

public class Avião {
	
	private String numpoltrona;
	private String faixaetaria;
	private String classe;
	private String posição;
	
	public Avião (String numpoltrona, String faixaetaria, String classe, String posição)
	{
		this.numpoltrona = numpoltrona;
		this.faixaetaria = faixaetaria;
		this.classe = classe;
		this.posição = posição;
		
 
	}
	public void ImprimirInfo()
	{
		System.out.println("No Avião da Guiariline na " +  numpoltrona + " tem uma pessoa " +
	faixaetaria + " localizada na classe " + classe + " posicionada perto do(a) " + posição);
	}
	public String getPoltrona() {
		return numpoltrona;
	}
	public void setPoltrona(String poltrona) {
		this.numpoltrona = poltrona;
	}
	public String getFaixaetaria() {
		return faixaetaria;
	}
	public void setFaixaetaria(String faixaetaria) {
		this.faixaetaria = faixaetaria;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getPosição() {
		return posição;
	}
	public void setPosição(String posição) {
		this.posição = posição;
	}

}