package Recursion.basicIntro;

public class Strings {
    public static void main(String[] args) {
        System.out.println(removeApp("baccapplaed"));
    }
    public static  String removeA(String p, String up)
    {
        if(up.isEmpty())
            return p;
        char ch = up.charAt(0);
        if(ch=='a')
            return  removeA(p,up.substring(1));
        return removeA(p+ch,up.substring(1));


    }
    public static  String removeA(String p)
    {
        if(p.isEmpty())
            return "";
        char ch = p.charAt(0);
        if(ch=='a')
        {
            return  removeA(p.substring(1));
        }
        return ch+removeA(p.substring(1));


    }
    public static String removeApple(String p)
    {
        if(p.isEmpty())
            return "";

        if(p.startsWith("apple"))
        {
            return  removeApple(p.substring(5));
        }

        return p.charAt(0)+removeApple(p.substring(1));
    }
    public static String removeApp(String p)
    {
        if(p.isEmpty())
            return "";

        if(p.startsWith("app")&&!p.startsWith("apple"))
        {
            return  removeApp(p.substring(5));
        }

        return p.charAt(0)+removeApp(p.substring(1));
    }

}
