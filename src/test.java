import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input;
		try {
			input = new Scanner(new File("src\\NerdData.txt"));
			int maxIndx = -1;
			String text[] = new String[1000];

			while (input.hasNext()) {
				maxIndx++;
				text[maxIndx] = input.nextLine();
			}
			
			input.close();
			for (int i = 0; i <= maxIndx; i++) 
			{
				Scanner input2 = new Scanner(text[i]);
				if (input2.next().equals("The")) {
					System.out.println(text[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
