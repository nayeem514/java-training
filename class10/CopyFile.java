import java.io.*;
class CopyFile{
public static void main(String args[]) 
{
File file=new File("C:\\Users\\student\\Desktop\\training\\claas9\\aaa.txt");
if(File.CreateNewFile()){
System.out.println("success");
}
else 
System.out.println("Error file already exist");
}
}

