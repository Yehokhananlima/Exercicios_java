package familia28;

public class testeAvi�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avi�o novo = new Avi�o (" poltrona G7","adolescente","executiva","janela" );
		
		novo.ImprimirInfo();
		novo.setClasse("economica");
		novo.setPosi��o("corredor");
		
		System.out.println("\n***REALOCA��O***");
		novo.ImprimirInfo();

	}

}