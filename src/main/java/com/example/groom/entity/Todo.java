package com.example.groom.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo extends CoopEntity {

    @Column
    private String title;

    @Column
    private String content;

    @JoinColumn(name = "todoBox_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TodoBox todoBox;

    @JoinColumn(name = "userInfo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserInfo userInfo;

    @JoinColumn(name = "roomSlot_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoomSlot roomSlot;

//    @JoinColumn
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Long room_id;

    public void updateTodo(Todo todo) {
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.todoBox = todo.getTodoBox();
        this.userInfo = todo.getUserInfo();
        this.roomSlot = todo.getRoomSlot();
    }
}
