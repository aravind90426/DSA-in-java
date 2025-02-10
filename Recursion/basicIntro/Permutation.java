package Recursion.basicIntro;

public class Permutation {
    public static void main(String[] args) {

        System.out.println(permutation("","abc"));
    }
    public static int permutation(String p, String up)
    {
    if(up.isEmpty())
    {
        System.out.println(p);
        return 1;
    }

    char ch = up.charAt(0);
        //ystem.out.println(ch);
    int c=0;
    for(int i=0;i<=p.length();i++)
    {
       c+= permutation(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1));
    }
    return c;

    }
}
