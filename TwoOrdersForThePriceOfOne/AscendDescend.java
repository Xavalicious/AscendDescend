import java.util.Arrays;


public class AscendDescend {

	public static void main(String[] args) {
		
		String ss[]={"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		
		System.out.println("Ascend:");
		for(int n=0;n<ss.length;n++)
		{
		System.out.println(ss[n]);
		}	

		System.out.println("\nDescend:");
		for(int m=ss.length-1;m>-1;m--)
		{
		System.out.println(ss[m]);	
		}

	}

}
