class Funcionario {
	private String nome;
	protected double salario;
	// 1 = funcionario, 2 = gerente, 3 = ...
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}


	public double getBonus() {
		return this.salario * 0.2;
	}

}

class Gerente extends Funcionario {
	
	public double getBonus() {
		return this.salario * 0.3;
	}

	public void cobraEntrega() {
		System.out.println("Est� pronto?");
	}
		
}

class Desenvolvedor extends Funcionario {
	
	public double getBonus() {
		return this.salario * 0.25;
	}
		
}

class TotalizadorDeBonus {
	
	private double total = 0;
	
	public void adiciona(Funcionario f) {
		total += f.getBonus();
	}
			
	public double getTotal() {
		return this.total;
	}
	
}

public class Heran�aReescritaEPolimorfismo {
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setSalario(1000);

		System.out.println(joao.getBonus());

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000);
		joaquim.cobraEntrega();

		System.out.println(joaquim.getBonus());

		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
				
	}
}

// ABSTRACT CLASS
// Para classes abstratas as heran�as tem que abstratir os metodos como por exemplo a classe Funcionario ser�: public abstract class getBonus();
// A chamada de Funcionario joao = new Funcionario(); na main n�o vai mais existir

