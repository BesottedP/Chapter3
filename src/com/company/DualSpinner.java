package com.company;

public class DualSpinner {

    public int spin(int min, int max)
    {
        int result = (int)(Math.random() * (max - min + 1) + min);
        return result;
    }

    public void playRound()
    {
        int player = spin(1,10);
        int computer = spin(2,8);
        int playerT = spin(1,10);
        int computerT = spin(2,8);

        System.out.println(player);
        System.out.println(computer);
        if(player > computer){
            System.out.println("You win " + (player - computer) + " point(s)!");
        }
        else if(player < computer){
            System.out.println("You lose " + ((player - computer) * -1) + " point(s)!");
        }
        else {
            int playerReroll = (player + playerT);
            int computerReroll = (computer + computerT);

            if (playerReroll > computerReroll) {
                System.out.println(playerReroll + " (+" + playerT + ")");
                System.out.println(computerReroll + " (+" + computerT + ")");
                System.out.println("You win 1 point!");
            }
            else if (playerReroll < computerReroll) {
                System.out.println(playerReroll + " (+" + playerT + ")");
                System.out.println(computerReroll + " (+" + computerT + ")");
                System.out.println("You lost 1 point!");
            }
            else {
                System.out.println(playerReroll + " (+" + playerT + ")");
                System.out.println(computerReroll + " (+" + computerT + ")");
                System.out.println("You tied! No points earned!");
            }
        }
    }
    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 1000; i++){
            ds.playRound();
            System.out.println(" ");
        }
    }
}
