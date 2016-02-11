import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVreader {
	public static void main(String[] args){
		CSVreader obj = new CSVreader();
		obj.run();
		
}
	public void run() {
		String csvFile = "/Users/gyektai18/Downloads/entityfacts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Scanner scan = new Scanner(System.in);
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				System.out.println("Hit enter for next line");
				String test = scan.nextLine();
			        // use comma as separator
				String[] entity = line.split(cvsSplitBy);


			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	  }

	}