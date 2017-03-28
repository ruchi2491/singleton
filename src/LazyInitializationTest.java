class LazyInitialization
{
	public static LazyInitialization instance;
	private LazyInitialization()
	{
		System.out.println("object initialized");
	}
	public static LazyInitialization getInstance()
	{
		if(instance == null)
		     instance= new LazyInitialization();
		return instance;
		}	
	}
public class LazyInitializationTest {
	public static void main(String[] args) {
	LazyInitialization lazy1=	LazyInitialization.getInstance();
	LazyInitialization lazy2=	LazyInitialization.getInstance();
	System.out.println(lazy1==lazy2);
	
	}

}
