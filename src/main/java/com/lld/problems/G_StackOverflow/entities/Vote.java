package com.lld.problems.G_StackOverflow.entities;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public record Vote (
     Long id,
     User voter,
     boolean isUpvote,
     Question question,
     Answer answer,
     LocalDateTime localDateTime){
    public Vote(Long id, User user, Question question, Answer answer , boolean isUpvote) {
        this(id,user,isUpvote,question,answer,LocalDateTime.ofEpochSecond(System.currentTimeMillis(),0, ZoneOffset.UTC));
    }
}
