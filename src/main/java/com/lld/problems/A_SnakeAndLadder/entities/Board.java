package com.lld.problems.A_SnakeAndLadder.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private List<Player> players;
    private HashMap<String, Integer> playerpieces;


    public Board(int size) {
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.players = new ArrayList<>();
        this.playerpieces = new HashMap<>();
        this.size = size;
    }

}
