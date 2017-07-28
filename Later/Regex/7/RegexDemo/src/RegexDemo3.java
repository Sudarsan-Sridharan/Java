import java.util.regex.Pattern;

public class RegexDemo3
{
	public static void main(String[] args)
	{
		System.out.println("* quantifier = occurs zero or more times");  
		
		System.out.println(Pattern.matches("[ab]*", ""));//true (a or b may come zero or more times)  
		System.out.println(Pattern.matches("[ab]*", "a"));//true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaa"));//true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaabbb"));//true (a or b may come zero or more times)
		System.out.println(Pattern.matches("[ab]*", "aaabbbx"));//true (x is not matching pattern) 
	}

}