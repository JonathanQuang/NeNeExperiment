import java.io.*;
import java.util.ArrayList;

public class Driver{

		ArrayList<Integer> input1 = new ArrayList<Integer>();
		ArrayList<Integer> input2 = new ArrayList<Integer>();
		ArrayList<Integer> outputs = new ArrayList<Integer>();
	
	public Driver(){
		ArrayList<Integer> input1 = new ArrayList<Integer>();
		ArrayList<Integer> input2 = new ArrayList<Integer>();
		ArrayList<Integer> outputs = new ArrayList<Integer>();
	}

	
	public void readData(String fileName){
		String line = null;
			try {
            // FileReader reads text files in the default encoding.
				FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
					String[] values = line.split(",");
					int in1 = Integer.parseInt(values[0]);
					int in2 = Integer.parseInt(values[1]);
					int out = Integer.parseInt(values[2]);
					input1.add(in1);
					input2.add(in2);
					outputs.add(out);
				}   

				// Always close files.
				bufferedReader.close();         
			}
			catch(FileNotFoundException ex) {           
			}
			catch(IOException ex) {
			}
			
			
			
			
		}

	public static void main (String[] args){
		Driver bob = new Driver();
		bob.readData("data.txt");
	}


}