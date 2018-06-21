import java.io.*;
class File2 {
public static void main(String[] args) {      
      File f = null;
      boolean bool = false;
      try {
               f = new File("test.txt");
         bool = f.createNewFile();
         System.out.println("File created: "+bool);
         f.delete();
         System.out.println("delete() method is invoked");
         bool = f.createNewFile();
System.out.println("File created: "+bool);
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}