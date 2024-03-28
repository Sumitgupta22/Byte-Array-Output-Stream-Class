// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
class f_System{
  void Prossce(String fname,String fname1,String text) throws IOException{
    FileOutputStream f1 = new FileOutputStream(fname);
    FileOutputStream f2 = new FileOutputStream(fname1);
    ByteArrayOutputStream b1 = new ByteArrayOutputStream();
    b1.write(text.getBytes());
    b1.writeTo(f1);
    b1.writeTo(f2);
    //b1.flash();
  }
}  
public class Main {
  public static void main(String[] args) {
    try{
      f_System f = new f_System();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Text");
      String text = sc.nextLine();
      f.Prossce("file.txt","second.txt",text);
    }
    catch(IOException e){
      System.out.println("Exception");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}