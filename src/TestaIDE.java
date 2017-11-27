public class TestaIDE {

	public static void main(String[] args) {
		IDE ide = new IDE("Gabriel", 123, 450);
		ide.setNome("Gabriel");
		ide.imprime();

		System.out.println(ide.getNome());
	}

}
