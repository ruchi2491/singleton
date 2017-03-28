class EagerInitialization
{
	private static EagerInitialization singleton = new EagerInitialization();
	private EagerInitialization()
	{
		
	}
	public static EagerInitialization getInstance()
	{
		return singleton;
	}
}

public class EagerTest {
	public static void main(String[] args) {
		EagerInitialization referenceOne=EagerInitialization.getInstance();
		EagerInitialization referenceTwo=EagerInitialization.getInstance();
		EagerInitialization referenceThree=EagerInitialization.getInstance();
		System.out.println(referenceOne==referenceTwo);
		System.out.println(referenceThree==referenceTwo);
		
	}

}
