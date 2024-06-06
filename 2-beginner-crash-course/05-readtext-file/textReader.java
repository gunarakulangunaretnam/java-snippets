//This is program reads data from a text file and display them to the console.

import java.io.*; 

public class textReader{


	public static void main(String[]args){


		try{

			FileInputStream fstream = new FileInputStream("data.txt");
			DataInputStream in=new DataInputStream(fstream);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strLine;

			while((strLine=br.readLine()) !=null){

				System.out.println(strLine);
			}

			in.close();
		}catch(Exception e){

			System.err.println("ERROR: "+ e.getMessage());
		}

	}

}