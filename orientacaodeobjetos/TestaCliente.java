package orientacaodeobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Lucas Velho", "Rua 1 - Alvorada - RS", "lucasold@email.com", "123456789", "111.222.333-44");
        Cliente cliente2 = new Cliente("Uriel Zolpidem de Clonazepam", "Rua 2 - Camboriu - SC", "urielzolpidem@email.com", "987654321", "999.888.777-66");

        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();

	}

}
