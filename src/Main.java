import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        start();
        }
    public static void start()throws IOException {
        System.out.println("Лабораторная работа №5");
        System.out.println("ПЭ-171 Поцуков Максим Николаевич");
        System.out.println("Условие:Спроектировать архитектуру ПО  для создания текстовых файлов \r\n" +
                "с возможностью замены сиволов и фраз в файле");
        System.out.println("=======================================================================================");
        System.out.println("Hello dude!What can I help you?\r\n1-Create new file\r\n2-Edit exist file");
        Scanner scanCh=new Scanner(System.in);
        String chooseOne=scanCh.next();
        String text="";
        genTxt generator=new genTxt();
        editFile ef=new editFile();
        if(chooseOne.equals("1")) {
            System.out.println("Write ur text(Enter |pointOfEnd| when you want to finish): ");
            while(!text.contains("pointOfEnd")){
            Scanner scanT = new Scanner(System.in);
            text+= scanT.next()+"\r\n";
            }
            text=text.replace("pointOfEnd","");
            System.out.println("Write file's path : ");
            Scanner scanW = new Scanner(System.in);
            String path = scanW.nextLine();
            generator.gener(path,text);
            System.out.println("Do you want to restart the program?\r\n1-Yeah Man!\r\n2-Nope Duuuuude...");
            Scanner scanEnd = new Scanner(System.in);
            String choose = scanEnd.nextLine();
            if(choose.equals("1")) {
                start();
            }
            if(choose.equals("2")) {
                System.out.println("Goodbye my friend!!!");
            }
            else
                System.out.println("GG |System ERROR|");
        }
        if(chooseOne.equals("2")) {
            System.out.println("Write file's path : ");
            Scanner scanW = new Scanner(System.in);
            String path = scanW.nextLine();
            ef.read(path);
            ef.edit(path);
            System.out.println("Do you want to restart the program?\r\n1-Yeah Man!\r\n2-Nope Duuuuude...");
            Scanner scanEnd = new Scanner(System.in);
            String choose = scanEnd.nextLine();
            if(choose.equals("1")) {
                start();
            }
            if(choose.equals("2")) {
                System.out.println("Goodbye my friend!!!");
            }
            else
                System.out.println("GG |System ERROR|");
        }
        else
            System.out.println("Wrong choose, my friend!");
    }
        }
//pointOfEnd
//D:/ebuchiytxt.txt