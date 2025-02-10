package OOPS.abstraction;

public class Main {

    public static void main(String[] args) {
        //  Parent p = new Parent() ;    // error
        Son son = new Son();
        son.career();    // Iam become coder
        son.partner();   //I love div
        Daughter d = new Daughter();
        d.career();           // i become doctor
        d.partner();        //Iam love arav


        Parent.testin();   // work
       // Parent .method();// parent call panna mudiyaathu aana child inherit panni call panlam
        son.method(); // ippadi

    }


}
