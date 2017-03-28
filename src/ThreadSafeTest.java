
class ThreadSafeInitialization
{
	private static ThreadSafeInitialization instance;
	private ThreadSafeInitialization()
	{
		
	}
	public static synchronized ThreadSafeInitialization  getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafeInitialization();
		}
		return instance;
	}
}

public class ThreadSafeTest {
public static void main(String[] args) {
	ThreadSafeInitialization t1= ThreadSafeInitialization.getInstance();
	ThreadSafeInitialization t2= ThreadSafeInitialization.getInstance();
	ThreadSafeInitialization t3= ThreadSafeInitialization.getInstance();
	ThreadSafeInitialization t4= ThreadSafeInitialization.getInstance();
	System.out.println(t1==t2);
	System.out.println(t2==t3);
	System.out.println(t3==t4);
}
	
}
