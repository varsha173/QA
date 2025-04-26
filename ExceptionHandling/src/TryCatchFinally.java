/** scenerio : tryin to automate web app and try to read some data from particular file at particular location. but not available in that location so we get an exception handling.
 * scenerio 2: try to find some web element in the wed page but not able to find 
 */
// division by zero which is not valid in java in that case its a exception handling


public class TryCatchFinally {

	//there was an exception but still want ur script to execute further steps even though there was some test case which failed due to exception
	
	public static void main(String[] args) {
		try
		{
			int i=10;
			System.out.println("before division");
			System.out.println(i/0);
		}
		catch(Throwable t) // throwable is a parent class which catches the exception. it has subclasses error and exception
		{
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		
	
		System.out.println("after division");

	}

}
