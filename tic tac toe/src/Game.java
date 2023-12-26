import java.util.Scanner;

public class Game {
    Borad b = new Borad();
    Players p = Players.inputPlayers();
    private int x_row, x_columm;

    public void innerLoop() {
        Scanner s = new Scanner(System.in);
        while (b.getWin() == false || !b.drawCheck()) {
            System.out.println(p.player_1+"'s turn:");
            x_row = s.nextInt() - 1;
            while (x_row < 0 || x_row > 3) {
                System.out.println("the number cant be below 0 or above 3");
                x_row = s.nextInt() - 1;
            }
            x_columm = s.nextInt() - 1;
            while (x_columm < 0 || x_columm > 3) {
                System.out.println("the number cant be below 0 or above 3");
                x_columm = s.nextInt() - 1;
            }
            while (b.borad[x_row][x_columm] == 'x' || b.borad[x_row][x_columm] == 'o') {
                System.out.println("the cube is taken,make sure that the cube you are choosing isnt taken. ");
                x_row = s.nextInt() - 1;
                x_columm = s.nextInt() - 1;
            }
            b.borad[x_row][x_columm] = 'x';
            b.printBorad();
            b.endgame();
            if (b.getWin() == true) {
                break;
            }
            if (b.drawCheck()) {
                break;
            }
            System.out.println(p.player_2+"'s turn:");
            x_row = s.nextInt() - 1;
            while (x_row < 0 || x_row > 3) {
                System.out.println("the number cant be below 0 or above 3");
                x_row = s.nextInt() - 1;
            }
            x_columm = s.nextInt() - 1;
            while (x_row < 0 || x_row > 3) {
                System.out.println("the number cant be below 0 or above 3");
                x_row = s.nextInt()-1;
            }
            while (b.borad[x_row][x_columm] == 'x' || b.borad[x_row][x_columm] == 'o') {
                System.out.println("the cube is taken,make sure that the cube you are choosing isnt taken. ");
                x_row = s.nextInt() - 1;
                x_columm = s.nextInt() - 1;
            }
            b.borad[x_row][x_columm] = 'o';
            b.printBorad();
            b.endgame();
            if (b.getWin() == true) {
                break;
            }
            if (b.drawCheck()) {
                break;
            }
        }
    }

    public void printWinner() {
        if (b.drawCheck()) {
            System.out.println("its a draw!");
        } else if (b.borad[x_row][x_columm] == 'x') {
            System.out.println(p.player_1 + " has won!");
        } else if (b.borad[x_row][x_columm] == 'o') {
            System.out.println(p.player_2 + " has won!");
        }
    }
}