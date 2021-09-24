import java.util.Scanner;

public class TicTacToe {
    static Scanner scn=new Scanner(System.in);
 public static void main(String[] args){
     char[] [] gameBoard={{' ', '|' ,' ','|', ' '},
     {'-', '+' ,'-','+', '-' },
     {' ', '|' ,' ','|', ' ' },
     {'-', '+' ,'-','+', '-' },
     {' ', '|' ,' ','|', ' ' }};
     playerMove(gameBoard);
 }
 public static void playerMove(char[][] gameBoard){

    System.out.println("Please make a move. (1-9)");
    int move = scn.nextInt();
    updateBoard(move,1,gameBoard);
   }
 public static void printBoard(char [][] gameBoard){

for (int row = 0; row < gameBoard.length; row++) {
  for (int c = 0; c < gameBoard[0].length; c++) {
    System.out.print(gameBoard[row][c]);
  }
  System.out.println();
}
 }
 public static void updateBoard(int position, int player, char[][] gameBoard) {

    char character;

    if (player == 1) {
      character = 'X';
    } else {
      character = 'O';
    }

    switch (position) {

    case 1:
      gameBoard[0][0] = character;
      printBoard(gameBoard);
      break;
    case 2:
      gameBoard[0][2] = character;
      printBoard(gameBoard);
      break;
    case 3:
      gameBoard[0][4] = character;
      printBoard(gameBoard);
      break;
    case 4:
      gameBoard[1][0] = character;
      printBoard(gameBoard);
      break;
    case 5:
      gameBoard[1][2] = character;
      printBoard(gameBoard);
      break;
    case 6:
      gameBoard[1][4] = character;
      printBoard(gameBoard);
      break;
    case 7:
      gameBoard[2][0] = character;
      printBoard(gameBoard);
      break;
    case 8:
      gameBoard[2][2] = character;
      printBoard(gameBoard);
      break;
    case 9:
      gameBoard[2][4] = character;
      printBoard(gameBoard);
      break;
        
    default:
      break;
    }
  }
}
