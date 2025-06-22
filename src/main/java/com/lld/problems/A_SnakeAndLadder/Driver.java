package com.lld.problems.A_SnakeAndLadder;

import com.lld.problems.A_SnakeAndLadder.entities.Ladder;
import com.lld.problems.A_SnakeAndLadder.entities.Player;
import com.lld.problems.A_SnakeAndLadder.entities.Snake;
import com.lld.problems.A_SnakeAndLadder.services.SnakeAndLadderService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // Player
        Scanner sc = new Scanner(System.in);
        int noOfSnakes = sc.nextInt();
        List<Snake> snakes = new ArrayList<>();
        for (int i = 0; i < noOfSnakes; i++)
            snakes.add(new Snake(sc.nextInt(), sc.nextInt()));

        int noOfLadders = sc.nextInt();
        List<Ladder> ladders = new ArrayList<>();
        for (int i = 0; i < noOfLadders; i++)
            ladders.add(new Ladder(sc.nextInt(), sc.nextInt()));

        int noOfPlayers = sc.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++)
            players.add(new Player(sc.next()));

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setLadders(ladders);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.startGame();
        sc.close();

    }
}
