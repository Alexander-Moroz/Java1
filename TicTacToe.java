/**
 * Homework to a lesson 6*
 *
 * @author Alexander Moroz
 * @since 2017-03-04
 * @version 3.0
 *
 * Uses extends, abstract, @Override for sub-classes Player: Human, Cpu
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        new Field().play();
    }
}

class Field {
    static final int SIZE = 3;
    Cell arr[][] = new Cell[SIZE][SIZE];

    void play() {
        System.out.println("WELCOME XOXO GAME!");
        newMap();
        printMap();

        Player player = new Human();
        Player cpu = new Cpu();

        while (true) {
            Cell p = player.turn();
            while (!isCellValid(p)) {
                p = player.turn();
            }

            if (isCellValid(p)) {
                arr[p.getX()][p.getY()] = p;
                printMap();
                if (checkWin(p.getLitera()) == true) {
                    System.out.println("Player WIN");
                    return;
                }
            }

            if (isFieldFill()) {
                System.out.println("END GAME. NOBODY'S WIN");
                return;
            }

            System.out.println("CPU turn...");
            Cell c = cpu.turn();
            while (!isCellValid(c)) {
                c = cpu.turn();
            }

            if (isCellValid(c)) {
                arr[c.getX()][c.getY()] = c;
                printMap();
                if (checkWin(c.getLitera()) == true) {
                    System.out.println("CPU WIN");
                    return;
                }
            }

            if (isFieldFill()) {
                System.out.println("END GAME. NOBODY'S WIN");
                return;
            }
        }

    }

    void newMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = new Cell(i, j, '•');
            }
        }
    }

    void printMap() {
        //System.out.println("0 1 2 3");
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i][j].getLitera() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isCellValid(Cell c) {
        int x = c.getX(), y = c.getY();
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (arr[x][y].getLitera() == '•') return true;
        return false;
    }

    boolean checkWin(char c) {
        int sumH, sumV, sumDA = 0, sumDB = 0;
        for (int i = 0; i < SIZE; i++) {
            sumH = 0;
            sumV = 0;
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].getLitera() == c) sumV += 1;
                if (arr[j][i].getLitera() == c) sumH += 1;
                if ((sumH == SIZE) || (sumV == SIZE)) return true;
            }
            if (arr[i][i].getLitera() == c) sumDA += 1;
            if (arr[i][SIZE - i - 1].getLitera() == c) sumDB += 1;
            if ((sumDA == SIZE) || (sumDB == SIZE)) return true;
        }
        return false;
    }

    boolean isFieldFill() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j].getLitera() == '•') return false;
            }
        }
        return true;
    }
}

abstract class Player {
    final char LITERA = '•';

    abstract Cell turn();
}

class Human extends Player {
    final char LITERA = 'X';
    Scanner sc = new Scanner(System.in);

    @Override
    Cell turn() {
        int x, y;
        System.out.println("YOUR TURN. ENTER X -> Y (1..3)");
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        return new Cell(x, y, LITERA);
    }
}

class Cpu extends Player {
    final char LITERA = 'O';
    Random r = new Random();

    @Override
    Cell turn() {
        int x, y;
        x = r.nextInt(Field.SIZE);
        y = r.nextInt(Field.SIZE);
        return new Cell(x, y, LITERA);
    }
}

class Cell {
    char litera;
    int x, y;
    Cell() {}
    Cell(int x, int y, char litera) {
        this.x = x;
        this.y = y;
        this.litera = litera;
    }

    char getLitera() {
        return litera;
    }

    void setLitera(int x, int y, char litera) {
        this.litera = litera;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}