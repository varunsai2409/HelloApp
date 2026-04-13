/**
 * UC2: Display "Hello" with Command-Line Argument
 *  @author Varun sai
 * @version 2
 */
public class HelloApp
{
    
    public static void main(String[] args)
    {
        String name = "world";
		if (args.length > 0) {
			name = args[0];
		}
         System.out.println("Hello, " + name + "!");
        
    }
}	