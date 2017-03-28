class ThreadSafeDoubleCheck
{
	private static ThreadSafeDoubleCheck instance;
	private ThreadSafeDoubleCheck()
	{
		
	}
	public static ThreadSafeDoubleCheck getInstance()
	{
		if(instance == null)
		{
			 synchronized (ThreadSafeDoubleCheck.class) {
				instance = new ThreadSafeDoubleCheck();
			}
		}
		return instance;
	}
}

public class ThreadSafeDoubleCheckTest {
	public static void main(String[] args) {
		ThreadSafeDoubleCheck td1=ThreadSafeDoubleCheck.getInstance();
		ThreadSafeDoubleCheck td2=ThreadSafeDoubleCheck.getInstance();
		ThreadSafeDoubleCheck td3=ThreadSafeDoubleCheck.getInstance();
		ThreadSafeDoubleCheck td4=ThreadSafeDoubleCheck.getInstance();
		System.out.println(td1==td2);
		System.out.println(td3==td2);
		System.out.println(td3==td4);
	}

}
