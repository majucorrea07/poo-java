package poo;

public class ObjetoCarro {

	public static void main(String[] args) {
		// Criando objetos da classe pessoa
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();	
		
		//OBJETO 1
		carro1.setCor("Preto");
		carro1.setTipocarro("Esportivo");
		carro1.setAno("2004");
		carro1.setNumportas(4);
		carro1.setViraesquerda("sim");
		carro1.setLigafarol("sim");
		carro1.setLigaseta("sim");
		carro1.setAcionaairbag("sim");
		
		//OBJETO 2
		carro2.setCor("Vermelho");
		carro2.setTipocarro("Esportivo");
		carro2.setAno("2018");
		carro2.setNumportas(4);
		carro2.setViraesquerda("sim");
		carro2.setLigafarol("não");
		carro2.setLigaseta("sim");
		carro2.setAcionaairbag("não");
		
		//OBJETO 3
		carro3.setCor("Branca");
		carro3.setTipocarro("Picape");
		carro3.setAno("2022");
		carro3.setNumportas(4);
		carro3.setViraesquerda("sim");
		carro3.setLigafarol("sim");
		carro3.setLigaseta("sim");
		carro3.setAcionaairbag("não");
		
		//OBJETO 4
		carro4.setCor("Chumbo");
		carro4.setTipocarro("Minivan");
		carro4.setAno("2012");
		carro4.setNumportas(4);
		carro4.setViraesquerda("não");
		carro4.setLigafarol("sim");
		carro4.setLigaseta("não");
		carro4.setAcionaairbag("não");
		
		// Chamando o método get() para apresentar os objetos 
		System.out.println("-----OBJETO 1-----");
        System.out.println(carro1.getCor());
        System.out.println(carro1.getTipocarro());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getNumportas());
        System.out.println(carro1.getViraesquerda());
        System.out.println(carro1.getLigafarol());
        System.out.println(carro1.getLigaseta());
        System.out.println(carro1.getAcionaairbag());
        
        System.out.println("-----OBJETO 2-----");
        System.out.println(carro2.getCor());
        System.out.println(carro2.getTipocarro());
        System.out.println(carro2.getAno());
        System.out.println(carro2.getNumportas());
        System.out.println(carro2.getViraesquerda());
        System.out.println(carro2.getLigafarol());
        System.out.println(carro2.getLigaseta());
        System.out.println(carro2.getAcionaairbag());
        
        System.out.println("-----OBJETO 3-----");
        System.out.println(carro3.getCor());
        System.out.println(carro3.getTipocarro());
        System.out.println(carro3.getAno());
        System.out.println(carro3.getNumportas());
        System.out.println(carro3.getViraesquerda());
        System.out.println(carro3.getLigafarol());
        System.out.println(carro3.getLigaseta());
        System.out.println(carro3.getAcionaairbag());
        
        System.out.println("-----OBJETO 4-----");
        System.out.println(carro4.getCor());
        System.out.println(carro4.getTipocarro());
        System.out.println(carro4.getAno());
        System.out.println(carro4.getNumportas());
        System.out.println(carro4.getViraesquerda());
        System.out.println(carro4.getLigafarol());
        System.out.println(carro4.getLigaseta());
        System.out.println(carro4.getAcionaairbag());
		

	}

}
