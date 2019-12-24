import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
  static MyFrame myFrame;
  public static void main(String[] args) {
    init();
    while(true) {
      myFrame.setVisible(true);
    }
  }
  
  private static void init() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Type e for English listening, c for Chinese listening...");
    String language = scnr.nextLine();
    if(language.charAt(0) == 'e' || language.charAt(0) == 'E' ) {
      MyFrame.setLanguage("en_us");
      System.out.print("System start as English listening...");
    }else {
      System.out.print("System start as Chinese listening...");
    }
    
    try {
      read(new Scanner(new File("configuration.txt")));
    } catch (FileNotFoundException e1) {
      System.out.print("File does not exist. Please reenter path of directory:");
      try {
        read(new Scanner(new File(scnr.nextLine())));
      } catch (FileNotFoundException e) {
        System.out.print("Faild to read.");
        System.exit(1);
      }
    }
    myFrame = new MyFrame();
  }
  
  
  public static void read(Scanner scnr) {
    boolean spe = true;
    while (scnr.hasNextLine()) {
      String buffer = scnr.nextLine();
        if (spe) {
          if(buffer.contains("BAIDU_APP_ID")) MyFrame.BAIDU_APP_ID = buffer.split(":")[1].trim();
          if(buffer.contains("BAIDU_SECURITY_KEY")) MyFrame.BAIDU_SECURITY_KEY = buffer.split(":")[1].trim();
          if(buffer.contains("IFLY_APP_ID")) MyFrame.IFLY_APP_ID = buffer.split(":")[1].trim();
        }
      }
  }

}
