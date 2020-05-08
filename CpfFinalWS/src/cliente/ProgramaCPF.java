package cliente;


public class ProgramaCPF {

	public static void main(String[] args) {
		EchoCPF echo = new EchoCPFService().getEchoCPFPort();

		echo.cpf();

	}

}
