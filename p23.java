import java.io.*;
class p23
{
	public static void main(String[] ar)
	{
		try{
				if(ar.length!=2)
				{
					System.out.println("Invalid Arguments");
					System.out.println("usage: srcfile destfile");
				}
				else
				{
					File f1=new File(ar[0]);
					File f2=new File(ar[1]);
					if(f1.exists())
					{
						if(!f2.exists())
						{
							int size=(int)f1.length();
							FileInputStream fin=new FileInputStream(ar[0]);
							byte[] data=new byte[size];
							fin.read(data);
							fin.close();
							FileOutputStream fout=new FileOutputStream(ar[1]);
							fout.write(data);
							fout.close();
							System.out.println("1 File Copied");
						}
						else
						{
							System.out.print("Do wants to overwrite:(Y/N):");
							int a=System.in.read();
							if(a=='Y' || a=='y')
							{
								int size=(int)f1.length();
								FileInputStream fin=new FileInputStream(ar[0]);
								byte[] data=new byte[size];
								fin.read(data);
								fin.close();
								FileOutputStream fout=new FileOutputStream(ar[1]);
								fout.write(data);
								fout.close();
								System.out.println("1 File Copied");
							}
						}
					}
					else
					{
						System.out.println("Source File Not Found!!!");
					}
				}
		}catch(Exception ee){}
	}
}
