import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImple extends UnicastRemoteObject implements Calculator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected CalculatorImple() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long add(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}

}
