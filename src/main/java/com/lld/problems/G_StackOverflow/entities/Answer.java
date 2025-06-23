package com.lld.problems.G_StackOverflow.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Answer{
    private Long id;
    private String content;
    private User author;
    private Question associatedQuestion;
    private List<Comment> comments;
    private List<Vote> vote;
    private LocalDateTime creationDate;

    public Answer(Long id, String content, User author, Question question) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.associatedQuestion = question;
        this.creationDate = LocalDateTime.now();
        this.comments = new ArrayList<>();
        this.vote = new ArrayList<>();
    }
}
