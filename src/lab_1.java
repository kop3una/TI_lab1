import Cipher.*;
import java.util.Scanner;

public class lab_1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        VigenerCipher Vigner = new VigenerCipher();
       // Vigner.setOriginalText(in.nextLine());
        Vigner.setCipherText(in.nextLine());
        Vigner.setKey(in.nextLine());
     //   Vigner.coding();
        Vigner.uncoding();
        Vigner.show();
   //     Vigner.showTableEn();
   //     Vigner.showTableRu();

//        ColumnMethodCipher ColumnMethod = new ColumnMethodCipher();
//        ColumnMethod.setCipherText(in.nextLine());
//       // ColumnMethod.setOriginalText(in.nextLine());
//        ColumnMethod.setKey(in.nextLine());
//      //  ColumnMethod.coding();
//        ColumnMethod.uncoding();
//        ColumnMethod.show();

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
