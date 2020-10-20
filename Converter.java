import java.util.Scanner;
public class Converter{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Input:");
		String input=s.nextLine();
		String[] inputSplit=input.split(" ");
		String[] newStrings=new String[inputSplit.length];
		for(int i=0; i<inputSplit.length; i++){
			newStrings[i]="";
			for(int j=0; j<inputSplit[i].length(); j++){
				newStrings[i]+=":regional_indicator_"+inputSplit[i].toLowerCase().charAt(j)+": ";
			}
		}
		System.out.println(String.join("   ", newStrings));
	}
}
