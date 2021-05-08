import java.rmi.Naming;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Calculator c = (Calculator) Naming.lookup("//127.0.0.1:12345/CalculatorService");
			System.out.println("Adicao: " + c.add(11, 17));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
