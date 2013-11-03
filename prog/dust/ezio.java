import java.io.*;
class ezio
{
	public String ezin() throws IOException
	{
		BufferedReader r =new BufferedReader(new InputStreamReader(System.in),1);
		return r.readLine();
	}

	public void ezout(String out)
	{
		System.out.print(out);
		System.out.flush();
	}
	public String prompt(String pro) throws IOException
	{
		BufferedReader r =new BufferedReader(new InputStreamReader(System.in),1);
		System.out.print(pro);
		System.out.flush();
		return r.readLine();
	}
	public void copyr()
	{
		System.out.print("Maker=\"H.Kobayashi\"\nMade=2009_1_24_Sat_10_21_00\nVersion=01.02.00\nVersion=01.7f.00\n");
	}
	public byte readb() throws IOException
	{
		BufferedReader r =new BufferedReader(new InputStreamReader(System.in),1);
		return (byte)r.read();
	}
}