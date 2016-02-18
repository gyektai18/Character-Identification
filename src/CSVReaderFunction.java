import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* This reads the file.
 * Each time enter is pressed 
 * it prints another line of the array.
 * This code is primarily taken from the Internet at
 * http://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 * I don't understand some of it because
 * it didn't come commented so I don't know what
 * some things do like BufferedReade, so I don't 
 * get the lines with br. But it works.
 * And this was honest.
 */

public class CSVReaderFunction {
	public String[] run(String hexFormat) {
		//Make the csvFile a string
		//and get the file's location.
		String csvFile = "/Users/gyektai18/Downloads/entityfacts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String[] entity = {"no","no","no","no","no"};
		//Create a scanner to see when enter is pressed
		Scanner scan = new Scanner(System.in);
		System.out.println("Hit enter for next line");
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				//String test = scan.nextLine();
				// use comma as separator
				entity = line.split(cvsSplitBy);
				for (int j = 0; j < entity.length; j++) {
					entity[j] = entity[j].trim();


				}
				if (entity.length > 2){
					if (entity[1].equals(hexFormat)){
						return entity;
						
						}

					}
				}


			
			//If these errors occur, output that. 
		} catch (IOException e) {}
		String[] otherStuffHappens = {"no","no","no","no","no"};
		return otherStuffHappens;

	}

}
