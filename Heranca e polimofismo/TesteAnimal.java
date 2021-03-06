package heranca;

public class TesteAnimal {
    
    public static void main(String[] args) {
        
    	Cachorro cachorro1 = new Cachorro("Spyke", 2, "Pastor Alemão", "Preto");
    	Cachorro cachorro2 = new Cachorro("Maylon", 5, "Vira-lata", "Malhado");
    	Cavalo cavalo1 = new Cavalo("Agalopes", 6, "Grande", "Corrida de saltos");
    	Preguica preguica1 = new Preguica("Elzepio", 14, "Fruta");
        
        cachorro1.imprimirInfo();
        cachorro1.converterIdade();
        cachorro1.emitirSom();
        cachorro1.capacidade();

        cachorro2.imprimirInfo();
        cachorro2.converterIdade();
        cachorro2.emitirSom();
        cachorro2.capacidade();
        
        cavalo1.imprimirInfo();
        cavalo1.converterIdade();
        cavalo1.emitirSom();
        cavalo1.capacidade();
        
        preguica1.imprimirInfo();
        preguica1.calcularHorasDormdias();
        preguica1.emitirSom();  
        preguica1.capacidade();      
    }
}
