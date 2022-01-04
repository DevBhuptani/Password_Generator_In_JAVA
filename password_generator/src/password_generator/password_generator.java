package password_generator;

public class password_generator {

	public static void main(String[] args) {
		String result = makePassword(8);
		System.out.println("Your New Password Is: "+result);		
	}

	public static String makePassword(int length) 
	{	
		String password = "";
		
		for(int i = 0;i < length - 2; i++) 
		{
			password = password + randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}
		
		String randomCapital = randomCharacter("abcdefghijklmnopqrstuvwxyz");
		password = insertRandom(password,randomCapital);
		
		String randomDigit = randomCharacter("0123456789");
		password = insertRandom(password,randomDigit);
		
		String randomSymbol = randomCharacter("+-/*_!@#$%^&*()");
		password = insertRandom(password,randomSymbol);
		
		return password;
	}
	
	public static String randomCharacter(String characters) 
	{
		int n = characters.length();
		int r = (int) (n*Math.random());
		return characters.substring(r, r+1);
	}

	public static String insertRandom(String str, String toInsert) 
	{
		int n = str.length();
		int r = (int) ((n+1)*Math.random());
		return str.substring(0,r) + toInsert + str.substring(r);
	}
}