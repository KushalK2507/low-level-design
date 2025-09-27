package com.lld.problems.A_SnakeAndLadder.services;

import com.lld.problems.A_SnakeAndLadder.entities.Board;
import com.lld.problems.A_SnakeAndLadder.entities.Ladder;
import com.lld.problems.A_SnakeAndLadder.entities.Player;
import com.lld.problems.A_SnakeAndLadder.entities.Snake;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakeAndLadderService {

  private static final int DEFAULTBOARDSIZE = 100;
  private final Board SnakeAndLadderBoard;
  private final Queue<Player> players;
  private int noOfPlayers;
  private final int size;

  SnakeAndLadderService(int size) {
    this.SnakeAndLadderBoard = new Board(size);
    this.players = new LinkedList<>();
    this.size = size;
  }

  public SnakeAndLadderService() {
    this(DEFAULTBOARDSIZE);
  }

  public void setPlayers(List<Player> players) {
    this.noOfPlayers = players.size();
    HashMap<String, Integer> playerPieces = new HashMap<>();
    for (Player p : players) {
      this.players.offer(p);
      playerPieces.put(p.playerName(), 0);
    }
    this.SnakeAndLadderBoard.setPlayerpieces(playerPieces);
  }

  public void setSnakes(List<Snake> snakes) {
    this.SnakeAndLadderBoard.setSnakes(snakes);
  }

  public void setLadders(List<Ladder> ladders) {
    this.SnakeAndLadderBoard.setLadders(ladders);
  }

  public void startGame() {

    while (!isGameEnded()) {
      int diceValue = getCurrentRollValue();
      Player curPlayer = this.players.poll();
      movePosition(curPlayer, diceValue);
      if (isPlayerWon(curPlayer)) {
        System.out.println("Player " + curPlayer.playerName() + " won the game!!");
        this.SnakeAndLadderBoard.getPlayerpieces().remove(curPlayer.playerName());
      } else {
        this.players.offer(curPlayer);
      }
    }
  }

  public boolean isGameEnded() {
    return this.players.size() < noOfPlayers;
  }

  public int getCurrentRollValue() {
    return DiceService.roll();
  }

  public void movePosition(Player player, int diceValue) {

    int currPosition = this.SnakeAndLadderBoard.getPlayerpieces().get(player.playerName());

    int nextPosition = currPosition + diceValue;

    if (nextPosition > this.size) {
      nextPosition = currPosition;
    } else {
      nextPosition = getNewPositionWithSnakesLadders(nextPosition);
    }

    this.SnakeAndLadderBoard.getPlayerpieces().put(player.playerName(), nextPosition);

    System.out.println(
        "Player "
            + player.playerName()
            + " moved from position "
            + currPosition
            + " to "
            + nextPosition);
  }

  public int getNewPositionWithSnakesLadders(int nextPosition) {

    int nextnewPositon;
    do {
      nextnewPositon = nextPosition;
      for (Snake nextSnake : this.SnakeAndLadderBoard.getSnakes()) {
        if (nextSnake.start() == nextPosition) nextPosition = nextSnake.end();
      }

      for (Ladder nextLadder : this.SnakeAndLadderBoard.getLadders()) {
        if (nextLadder.start() == nextPosition) nextPosition = nextLadder.end();
      }
    } while (nextnewPositon != nextPosition);
    return nextPosition;
  }

  public boolean isPlayerWon(Player player) {

    return this.SnakeAndLadderBoard.getPlayerpieces().get(player.playerName()) == size;
  }
}
