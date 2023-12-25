import java.util.Scanner;
        public  class Players {
        public String player_1;
        public String player_2;
        public Players(String player_1,String player_2){
            this.player_1=player_1;
            this.player_2=player_2; 
        }
        public String getPlayer_1(){
            return player_1;
        }
        public String getPlayer_2(){
            return player_2;
        }
        public void setPlayer_1(String player_1){
            this.player_1=player_1;
        }
        public void setPlayer_2(String player_2){
            this.player_2=player_2;
        }
        public static Players inputPlayers(){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the name of player 1:");
            String player1=s.nextLine();
            System.out.println("Enter the name of player 2:");
            String player2=s.nextLine();
            return new Players(player1, player2);   
        }
    }