public class Main{
    public static void main(String[] args) {
        Borad obj = new Borad();
        Game mainGame=new Game();
            System.out.println("a little bit rules:1");
            System.out.println("1.player 1 will be the x and player 2 will be the o.");
            System.out.println("2.when you want to choose the squere, write the line first and the the columm. for exemple:");
            System.out.println("to choose the top left corner write 1 and then another time 1.");
            System.out.println("have fun!");
            Players print=Players.inputPlayers();
             obj.definition();
            mainGame.innerLoop();
            mainGame.printWinner();
        }
}   
