package secondpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class datas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datapath="C:\\OUTPUT\\datarough.csv";
		BufferedReader br=null;
		String line="";
		String cv=",";
		br=new BufferedReader(new FileReader(datapath));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(cv);
			System.out.println(data[0]+" "+data[1]);
			
		}
		

	}

}
