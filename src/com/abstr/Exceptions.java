package com.abstr;

public class Exceptions {
    public static void main(String[] args) {


        try {
            int x=10,y=0,z;
            z=x/y;
            System.out.println(z);
        }
        catch(ArithmeticException p)
        {
            System.out.println("Not possible");
        }
        catch(NullPointerException c){
            System.out.println("not accepted");
        }
        catch(Exception b){
            System.out.println(b);
        }
        finally {
            System.out.println("Finally is used bcoz if there is exception the code breaks so to print anything after the code it is used");
        }

    }
}
