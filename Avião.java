package familia28;

public class Avi�o {
	
	private String numpoltrona;
	private String faixaetaria;
	private String classe;
	private String posi��o;
	
	public Avi�o (String numpoltrona, String faixaetaria, String classe, String posi��o)
	{
		this.numpoltrona = numpoltrona;
		this.faixaetaria = faixaetaria;
		this.classe = classe;
		this.posi��o = posi��o;
		
 
	}
	public void ImprimirInfo()
	{
		System.out.println("No Avi�o da Guiariline na " +  numpoltrona + " tem uma pessoa " +
	faixaetaria + " localizada na classe " + classe + " posicionada perto do(a) " + posi��o);
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
	public String getPosi��o() {
		return posi��o;
	}
	public void setPosi��o(String posi��o) {
		this.posi��o = posi��o;
	}

}