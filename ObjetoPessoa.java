package poo;

public class ObjetoPessoa {

	public static void main(String[] args) {
		// Criando objetos da classe pessoa
				Pessoa pessoa1 = new Pessoa();
				Pessoa pessoa2 = new Pessoa();
				
				//OBJETO 1
				pessoa1.setNome("Tom Cruise");
				pessoa1.setIdade(60);
				pessoa1.setEndereco("California, USA");
				pessoa1.setProfissao("Jogador de Futebol");
				pessoa1.setCpf(47807377859l);
				pessoa1.setRg(580018167);
				
				//OBJETO 2
				pessoa2.setNome("Messi");
				pessoa2.setIdade(35);
				pessoa2.setEndereco("Miami, USA");
				pessoa2.setProfissao("Jogador de Futebol");
				pessoa2.setCpf(47807377859l);
				pessoa2.setRg(580018167);
				
				// Chamando o método get() para apresentar os objetos 
				System.out.println("-----OBJETO 1-----");
		        System.out.println(pessoa1.getNome());
		        System.out.println(pessoa1.getIdade());
		        System.out.println(pessoa1.getEndereco());
		        System.out.println(pessoa1.getProfissao());
		        System.out.println(pessoa1.getCpf());
		        System.out.println(pessoa1.getRg());
		        
		        System.out.println("-----OBJETO 2-----");
		        System.out.println(pessoa2.getNome());
		        System.out.println(pessoa2.getIdade());
		        System.out.println(pessoa2.getEndereco());
		        System.out.println(pessoa2.getProfissao());
		        System.out.println(pessoa2.getCpf());
		        System.out.println(pessoa2.getRg());
	}

	}


