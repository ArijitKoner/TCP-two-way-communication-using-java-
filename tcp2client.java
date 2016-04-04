import java.io.*;
import java.net.*;
import java.lang.*;
class tcp2client
{ public static void main(String args[])throws IOException
 {
Socket s=new Socket("LocalHost",8000);
DataInputStream in=new DataInputStream(s.getInputStream());
DataInputStream inn=new DataInputStream(System.in);
PrintStream dos=new PrintStream(s.getOutputStream());
while(true)
{String str=in.readLine();
System.out.println("Msg to be received:"+str);
if(str.equals("end"))
{s.close();
break;
}
System.out.println("Enter The msg to send:");
String str1=inn.readLine();
dos.println(str1);
if(str1.equals("end"))
{s.close();
break;
}
}
}
}