import java.lang.StringBuilder;
import java.util.Scanner;
public class Converter{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Input: ");
		String input=s.nextLine();
		StringBuilder newString=new StringBuilder();
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)!=' '){
				newString.append(":regional_indicator_"+input.charAt(i)+": ");
			}else{
				newString.append("  ");
			}
		}
		System.out.println(newString);
	}
}
