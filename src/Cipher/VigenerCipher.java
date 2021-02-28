package Cipher;

import java.util.Locale;

public class VigenerCipher {
    private String OriginalText;
    private String CipherText;
    private String Key;
    private String StraightKey;
    static private char [][] TableEn;
    static private char [][] TableRu;
    static final private char [] AlphabetEn = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static final private char [] AlphabetRu = {'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};

    private void MakeTableEn () {
        TableEn = new char [26][26];
        int key = 0;
        for (int i = 0; i < 26; i++){
            for (int j = 0; j < 26; j++){
                TableEn[i][j] = AlphabetEn[(j+key)%26];
            }
            key++;
        }
    }

    private void MakeTableRu () {
        TableRu = new char [32][32];
        int key = 0;
        for (int i = 0; i < 32; i++){
            for (int j = 0; j < 32; j++){
                TableRu[i][j] = AlphabetRu[(j+key)%32];
            }
            key++;
        }
    }

    public void showTableEn () {
        MakeTableEn();
        for (int i = 0; i < 26; i++){
            for (int j = 0; j < 26; j++){
                System.out.print(TableEn[i][j]+", ");
            }
            System.out.println();
        }
    }

    public void showTableRu () {
        MakeTableRu();
        for (int i = 0; i < 32; i++){
            for (int j = 0; j < 32; j++){
                System.out.print(TableRu[i][j]+", ");
            }
            System.out.println();
        }
    }

    public void setOriginalText (String sOriginalText){
        OriginalText = sOriginalText;
    }

    public void setCipherText (String sCipherText){
        CipherText = sCipherText;
    }

    public String getOriginalText (){
        return OriginalText;
    }

    public String getCipherText (){
        return CipherText;
    }

    public String getStraightKey () {
        return StraightKey;
    }

    public void show (){
        System.out.println("Исходный текст: " + OriginalText + "; Шифротекст: " + CipherText + "; Ключ: " + Key );
    }

    public void setKey(String k){
        StringBuilder s = new StringBuilder();
        String Text;
        if (OriginalText != null) {
            Text = OriginalText;
        }
        else {
            Text = CipherText;
        }
        Key = k.toUpperCase(Locale.ROOT);
        s.append(Key);
        for (int i = 0; s.length() < Text.length(); i++){
            s.append(Key.charAt(i % (Key.length())) );
        }
        StraightKey = s.toString();
    }

    public String getKey (){
        return Key;
    }

    private void MakeChipherText() {
        StringBuilder s = new StringBuilder();
        MakeTableEn();
        int index = 0;
        int i = 0;
        int j = 0;
        while (index < OriginalText.length()){
            if ( (OriginalText.charAt(index) >= 65) && (OriginalText.charAt(index) <= 90) ){
                j = OriginalText.charAt(index) - 65;
            }
            i = StraightKey.charAt(index) - 65;
            s.append(TableEn[i][j]);
            index++;
        }
        CipherText = s.toString();
    }

    private void MakeOriginalText() {
        StringBuilder s = new StringBuilder();
        MakeTableEn();
        int index = 0;
        int i = 0;
        int j = 0;
        while (index < CipherText.length()){
            if ( ( CipherText.charAt(index) >= 65) && (CipherText.charAt(index) <= 90) ){
                j = (CipherText.charAt(index) - 65) - (StraightKey.charAt(index) - 65) ;
            }
            if (j < 0){
                j = 26 + j;
            }
            s.append(AlphabetEn[j]);
            index++ ;
        }
        OriginalText = s.toString();
    }

    public void coding (){
        MakeChipherText();
    }

    public void uncoding () { MakeOriginalText();}
}
