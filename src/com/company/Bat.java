package com.company;

public class Bat {
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public static boolean negPos(int num1, int num2, boolean negative) {
        if (negative == false) {
            int x = num1 * num2;
            return (x<0);
            }
        else {
            return (num1 < 0 && num2 <0 );
        }
    }

    public static boolean pickUpPhone(boolean isMorining, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return (false);
        }
        else if (isMom == true) {
            return (true);
        }
        else if (isMorining == true) {
            return (false);
        }
        else {
            return (true);
        }
    }
    public static String setAlarm(int day, boolean vacay){
        if(vacay == false){
            if (day>0 && day<6)
                return ("7:00");
            else return ("10:00");
        }
        else {
            if (day>0 && day<6)
                return ("10:00");
            else return ("Off");
        }

    }
    public static boolean onesDigitSame(int a,int b,int c) {
        int amod = a % 10;
        int bmod = b % 10;
        int cmod = c % 10;
        if (amod == bmod || amod == cmod || bmod == cmod) {
            return (true);
        }
        else {
            return (false);
        }
    }
    public static int blackjack(int hand1, int hand2){
        int total = hand1 + hand2;
        if (total > 42){
            return 0;
        }
        else if (hand1 < 22){
            if (hand1 > hand2) {
                return (hand1);
            }
        }
    }


    public static void main(String[] args) {
        //Monkeys
        System.out.println("MONKEYS:");
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));

        System.out.println(" ");

        //negPos
        System.out.println("NEGPOS:");
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos (-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos (-1, -1, false));
        System.out.println(negPos (-4, -5, true));
        System.out.println(negPos (-4, 5, true));
        System.out.println(negPos (4, 5, true));
        System.out.println(negPos (4, -5, true));

        System.out.println(" ");

        //Phone
        System.out.println("PHONE:");
        System.out.println(pickUpPhone (false, false, true));
        System.out.println( pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println( pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));

        System.out.println(" ");

        //Alarm
        System.out.println("ALARM:");
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));

        System.out.println(" ");

        //onesDigitSame
        System.out.println("ONES_DIGIT_SAME");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame (23, 19, 12));
        System.out.println(onesDigitSame (23, 19, 3));
        System.out.println(onesDigitSame (423, 13, 3));
        System.out.println(onesDigitSame (23, 29, 25));

        //blackjack
        System.out.println("BLACKJACK");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }


}