package poo;

public class ObjetoAviao {

	public static void main(String[] args) {
		// Criando objetos da classe pessoa
				Aviao aviao1 = new Aviao();
				Aviao aviao2 = new Aviao();
				Aviao aviao3 = new Aviao();
				Aviao aviao4 = new Aviao();	

				//OBJETO 1
				aviao1.setCor("Branco");
				aviao1.setTipoaviao("Executivo");
				aviao1.setCompaerea("Latam");
				aviao1.setNumturbinas(4);
				aviao1.setAbreporta("sim");
				aviao1.setMoveasa("sim");
				aviao1.setSobe("sim");
				aviao1.setGiraturbina("sim");
				
				//OBJETO 2
				aviao2.setCor("Vermelho");
				aviao2.setTipoaviao("Executivo");
				aviao2.setCompaerea("American Airlines");
				aviao2.setNumturbinas(9);
				aviao2.setAbreporta("não");
				aviao2.setMoveasa("não");
				aviao2.setSobe("sim");
				aviao2.setGiraturbina("sim");
				
				//OBJETO 3
				aviao3.setCor("Branco");
				aviao3.setTipoaviao("Comercial");
				aviao3.setCompaerea("123 Milhas");
				aviao3.setNumturbinas(4);
				aviao3.setAbreporta("sim");
				aviao3.setMoveasa("sim");
				aviao3.setSobe("sim");
				aviao3.setGiraturbina("não");
				
				//OBJETO 4
				aviao4.setCor("Azul");
				aviao4.setTipoaviao("De carga");
				aviao4.setCompaerea("Voe Azul");
				aviao4.setNumturbinas(2);
				aviao4.setAbreporta("sim");
				aviao4.setMoveasa("sim");
				aviao4.setSobe("sim");
				aviao4.setGiraturbina("sim");
				
				// Chamando o método get() para apresentar os objetos 
				System.out.println("-----OBJETO 1-----");
		        System.out.println(aviao1.getCor());
		        System.out.println(aviao1.getTipoaviao());
		        System.out.println(aviao1.getCompaerea());
		        System.out.println(aviao1.getNumturbinas());
		        System.out.println(aviao1.getAbreporta());
		        System.out.println(aviao1.getMoveasa());
		        System.out.println(aviao1.getSobe());
		        System.out.println(aviao1.getGiraturbina());
		        
				System.out.println("-----OBJETO 2-----");
		        System.out.println(aviao2.getCor());
		        System.out.println(aviao2.getTipoaviao());
		        System.out.println(aviao2.getCompaerea());
		        System.out.println(aviao2.getNumturbinas());
		        System.out.println(aviao2.getAbreporta());
		        System.out.println(aviao2.getMoveasa());
		        System.out.println(aviao2.getSobe());
		        System.out.println(aviao2.getGiraturbina());
				
				System.out.println("-----OBJETO 3-----");
		        System.out.println(aviao3.getCor());
		        System.out.println(aviao3.getTipoaviao());
		        System.out.println(aviao3.getCompaerea());
		        System.out.println(aviao3.getNumturbinas());
		        System.out.println(aviao3.getAbreporta());
		        System.out.println(aviao3.getMoveasa());
		        System.out.println(aviao3.getSobe());
		        System.out.println(aviao3.getGiraturbina());
	
				System.out.println("-----OBJETO 4-----");
		        System.out.println(aviao4.getCor());
		        System.out.println(aviao4.getTipoaviao());
		        System.out.println(aviao4.getCompaerea());
		        System.out.println(aviao4.getNumturbinas());
		        System.out.println(aviao4.getAbreporta());
		        System.out.println(aviao4.getMoveasa());
		        System.out.println(aviao4.getSobe());
		        System.out.println(aviao4.getGiraturbina());
	
	}

}
