import Cipher.*;
import java.util.Scanner;

public class lab_1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        ColumnMethodCipher ColumnMethod = new ColumnMethodCipher();
        ColumnMethod.setCipherText(in.nextLine());
       // ColumnMethod.setOriginalText(in.nextLine());
        ColumnMethod.setKey(in.nextLine());
      //  ColumnMethod.coding();
        ColumnMethod.uncoding();
        ColumnMethod.show();

//        RailFenceCipher RailFence = new RailFenceCipher();
//        System.out.print("Введите Исходный текст: ");
//        RailFence.setOriginalText(in.nextLine());
//        RailFence.setCipherText(in.nextLine());
//        System.out.print("Введите ключ: ");
//        RailFence.setKey(in.nextInt());
//        RailFence.coding();
//        RailFence.uncoding();
//        RailFence.show();

    }
}
