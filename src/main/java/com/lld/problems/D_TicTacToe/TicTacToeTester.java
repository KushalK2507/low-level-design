package com.lld.problems.D_TicTacToe;

import java.util.Scanner;

public class TicTacToeTester {
  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    Scanner scanner = new Scanner(System.in);
    int row, column;

    while (!game.isBoardFull() && !game.checkWinner()) {
      game.printBoard();

      System.out.print(
          "Player " + game.getCurrentPlayer() + ", enter your move (row and column): ");
      row = scanner.nextInt();
      column = scanner.nextInt();

      if (game.makeMove(row, column)) {
        System.out.println("Move successful!");
      } else {
        System.out.println("Invalid move. Try again.");
      }
    }

    game.printBoard();

    if (game.checkWinner()) {
      System.out.println("Player " + (3 - game.getCurrentPlayer()) + " wins!");
    } else {
      System.out.println("It's a draw!");
    }

    scanner.close();
  }
}
