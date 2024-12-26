package NTC;

import javax.print.StreamPrintService;
import java.sql.SQLOutput;

public class CaesherCipher {
    public static void main(String[] args) {
        char ch ='z';

       // System.out.println(-3%25);
        encryption("hello world",3);
    }
    public static void encryption(String plaintext,int key)
    { String cipherText="";
        for(char ch:plaintext.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                cipherText+=(char)(((ch-'a'+key)%26)+'a');
            }
            else {
                cipherText+=ch;
            }
        }
        System.out.println("cipherText = "+cipherText);
        decryption(cipherText,key);
    }
    public static void decryption(String c,int key)
    { String p="";
        for(char ch:c.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                int n = (ch-'a'-key) %26;

                if(n<0)
                {
                    p+= (char)(n+26+97);
                }
                else
                {
                    p+=(char)(n+97);
                }
            }
            else {
               p+=ch;
            }
        }
        System.out.println("Plain Text ="+p);
    }

}
