import java.io.*;
public class que1
{
	public static void main(String[] rgs)
	{
		File f1 = new File("C:/Users/hp/Desktop/assignment10/abc.txt");
		File f2 = new File("C:/Users/hp/Desktop/assignment10/xyz.txt");
		
		int i;
		try{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			i = fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i = fin.read();
				
			}
				fin.close();
				fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}