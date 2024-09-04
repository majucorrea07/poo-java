package poo;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		//OBJETO 1
		cliente1.setNome("Thomas");
		cliente1.setIdade(32);
		cliente1.setEndereco("São Paulo");
        cliente1.setCpf(44486803271l);
        cliente1.setTrabalha("Sim");
        cliente1.setAnda("Sim");
        cliente1.setFala("Sim");
        cliente1.setDirige("Sim");
        
      //OBJETO 2
        cliente2.setNome("Julia");
        cliente2.setIdade(26);
        cliente2.setEndereco("Rio de Janeiro");
        cliente2.setCpf(48583873296l);
        cliente2.setTrabalha("Sim");
        cliente2.setAnda("Sim");
        cliente2.setFala("Sim");
        cliente2.setDirige("Não");
	
     // Chamando o método get() para apresentar os objetos 
		System.out.println("-----OBJETO 1-----");
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getIdade());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getTrabalha());
        System.out.println(cliente1.getAnda());
        System.out.println(cliente1.getFala());
        System.out.println(cliente1.getDirige());
        
        System.out.println("-----OBJETO 2-----");
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getIdade());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getTrabalha());
        System.out.println(cliente2.getAnda());
        System.out.println(cliente2.getFala());
        System.out.println(cliente2.getDirige());
	
	}

}
