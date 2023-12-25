public class Borad {
    public boolean win = false;
    public char[][] borad;

    public Borad() {
        borad = new char[3][3];
    }

    public void printBorad() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (borad[i][j] == 0) {
                    System.out.print('-');
                } else {
                    System.out.print(borad[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void endgame() {
        if (borad[0][0] == borad[0][1] && borad[0][1] == borad[0][2]) {
            win = true;
        } else if (borad[1][0] == borad[1][1] && borad[1][1] == borad[1][2]) {
            win = true;
        } else if (borad[2][0] == borad[2][1] && borad[2][1] == borad[2][2]) {
            win = true;
        }

        else if (borad[0][0] == borad[1][0] && borad[1][0] == borad[2][0]) {
            win = true;
        } else if (borad[0][1] == borad[1][1] && borad[1][1] == borad[2][1]) {
            win = true;
        } else if (borad[0][2] == borad[1][2] && borad[1][2] == borad[2][2]) {
            win = true;
        }

        else if (borad[0][0] == borad[1][1] && borad[1][1] == borad[2][2]) {
            win = true;
        } else if (borad[0][2] == borad[1][1] && borad[1][1] == borad[2][0]) {
            win = true;
        }
    }
    public boolean drawCheck(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (borad[i][j]==0) {
                    return false;
                }
            }
        }
        return !win;
    }

    public char[][] getBorad() {
        return borad;
    }

    public void setBorad(char[][] borad) {
        this.borad = borad;
    }

    public boolean getWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
