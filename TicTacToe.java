package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Random random;
    Scanner scanner;
    char[][] table;

    TicTacToe(){
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    public static void main(String[] args){
        new TicTacToe().game();
    }

    void game() {
        initTable();
        printTable();
        while(true){
            turnHuman();
            if(checkWin('x')){
                System.out.println("You WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    private void initTable() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                table[i][j] = '_';
            }
        }
    }

    private void printTable() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y, in [1 .. 3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if(!isCellValid(x, y)){
                System.out.println("Your input is not valid, try again");
            }
        }
        while(!isCellValid(x, y));
        table[x][y] = 'x';
    }

    private void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while(!isCellValid(x, y));
        table[x][y] = 'o';
    }

    private boolean isTableFull() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                if(table[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == symbol && table[i][1] == symbol && table[i][2] == symbol) ||
                    (table[0][i] == symbol && table[1][i] == symbol && table[2][i] == symbol))
                return true;
            if ((table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) ||
                    (table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol))
                return true;
        return false;
    }
    private boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '_';
    }
}

