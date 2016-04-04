import java.io.*;
import java.net.*;
import java.lang.*;
class tcp2server
{ public static void main(String args[])throws IOException
{ServerSocket ss=new ServerSocket(8000);
Socket s=ss.accept();
PrintStream dos=new PrintStream(s.getOutputStream());
DataInputStream in=new DataInputStream(System.in);
DataInputStream inn=new DataInputStream(s.getInputStream());
while(true)
{
System.out.println("Enter the msg to send:");
String str=in.readLine();
dos.println(str);
if(str.equals("end"))
{ss.close();
break;
}
String str1=inn.readLine();
System.out.println("Msg Received"+str1);
if(str1.equals("end"))
{ ss.close();
break;
}
}
}
}
