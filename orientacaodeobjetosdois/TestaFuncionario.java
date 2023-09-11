package orientacaodeobjetosdois;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", 30, 3000.0, "Analista", "TI");
        Funcionario funcionario2 = new Funcionario("Maria", 25, 2500.0, "Programador(a)", "Desenvolvimento");

        funcionario1.visualizar();
        System.out.println();
        funcionario2.visualizar();
	}

}
