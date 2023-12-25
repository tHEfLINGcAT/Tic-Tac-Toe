import java.util.Scanner;

public class Game{
    Borad b=new Borad();
    Players p =Players.inputPlayers();
    private int x_row,x_columm;
    public void innerLoop(){
        Scanner s=new Scanner(System.in);
            while (b.getWin()==false) {
            System.out.println("player 1 turn:");
            x_row=s.nextInt()-1;
            x_columm=s.nextInt()-1;
            b.borad[x_row][x_columm]='X';
            System.out.println(b.borad);
            System.out.println("player 2 turn:"); 
            x_row=s.nextInt()-1;
            x_columm=s.nextInt()-1;
            b.borad[x_row][x_columm]='o';
            System.out.println(b.borad);
            if (b.borad[x_row][x_columm]=='x'||b.borad[x_row][x_columm]=='o') {
                System.out.println("the cube is taken,make sure that the cube you are choosing isnt taken. ");
            }
            System.out.println(b.borad);
        }
    }
    public void printWinner(){
        if (b.getWin()==true) {
            if (!(b.borad[0][0]==b.borad[0][1]&&b.borad[0][1]==b.borad[0][2])&&!(b.borad[1][0]==b.borad[1][1]&&b.borad[1][1]==b.borad[1][2])&&!(b.borad[2][0]==b.borad[2][1]&&b.borad[2][1]==b.borad[2][2])&&!(b.borad[0][0]==b.borad[1][0]&&b.borad[1][0]==b.borad[2][0])&&!(b.borad[0][1]==b.borad[1][1]&&b.borad[1][1]==b.borad[2][1])&&!(b.borad[0][2]==b.borad[1][2]&&b.borad[1][2]==b.borad[2][2])&&!(b.borad[0][0]==b.borad[1][1]&&b.borad[1][1]==b.borad[2][2])&&!(b.borad[0][2]==b.borad[1][1]&&b.borad[1][1]==b.borad[2][0])) {
                if (b.borad[x_row][x_columm]=='x') {
                    System.out.println(p.player_1+"has won!");
                }
            else if (b.borad[x_row][x_columm]=='y') {
                System.out.println(p.player_2+"has won!");
                }
            }
        }
    }
} 