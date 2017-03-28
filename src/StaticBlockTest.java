class StaticSingleton
{
	private static StaticSingleton singleton;
	static
	{
		 try
		 {
			 singleton=new StaticSingleton();
		 }
		 catch (Exception e) {
			throw new RuntimeException("Exception occured in singleton instance");
		}
	}
	public static StaticSingleton getInstance()
	{
		return singleton;
	}
}

public class StaticBlockTest {
	public static void main(String[] args) {
		StaticSingleton s1=StaticSingleton.getInstance();
		StaticSingleton s2=StaticSingleton.getInstance();
		StaticSingleton s3=StaticSingleton.getInstance();
		StaticSingleton s4=StaticSingleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}
	

}
