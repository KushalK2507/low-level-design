package com.lld.problems.G_StackOverflow.entities;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public record Comment(
      Long id,
      User author,
     String content,
     Question question,
     Answer answer,
      LocalDateTime creationDate){

    public Comment(Long id, User user, String content,Question question,Answer answer){
        this(id,user,content,question,answer,LocalDateTime.ofEpochSecond(System.currentTimeMillis(),0, ZoneOffset.UTC));
    }
}
