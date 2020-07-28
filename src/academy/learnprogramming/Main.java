package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int minValue =10000;
        int myminIntvalue = Integer.MIN_VALUE;
        int mymaxIntvalue= Integer.MAX_VALUE;
        System.out.println("Minimum value of Integer= "+myminIntvalue);
        System.out.println("Minimum value of Integer= "+mymaxIntvalue);

        //overflow
        System.out.println("Adjusting 2 larger values into the space allocated by the computer = "+(mymaxIntvalue+1)); //gives negative value

        //underflow
        System.out.println("Busted min value turned into positive number = "+ (myminIntvalue-1));
        int myintmaxvalue= 2_147_483_647;

        byte myminBytevalue = Byte.MIN_VALUE;
        byte mymaxBytevalue = Byte.MAX_VALUE;
        System.out.println("Minimum value of Byte = "+myminBytevalue);
        System.out.println("Minimum value of Byte = "+mymaxBytevalue);

        short myminShortvalue = Short.MIN_VALUE;
        short mymaxShortvalue = Short.MAX_VALUE;
        System.out.println("Minimum value of Short = "+myminShortvalue);
        System.out.println("Minimum value of Short = "+mymaxShortvalue);

        long mylongnumber = 100L;
        long myminLongvalue = Long.MIN_VALUE;
        long mymaxLongvalue = Long.MAX_VALUE;
        System.out.println("Minimum value of Long = "+myminLongvalue);
        System.out.println("Minimum value of Long = "+mymaxLongvalue);
        System.out.println(mylongnumber);

        long bigLongliteralvalue = 2_147_483_647_243L; //gives an error without L as the value is > than Max value of Int

    }
}
