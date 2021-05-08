import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

	CalculatorServer(){
		Registry reg = null;
		
		try {
			reg = LocateRegistry.createRegistry(12345);
			Calculator c = new CalculatorImple();
			
			Naming.rebind("rmi://127.0.0.1:12345/CalculatorService", c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorServer();
	}

}
