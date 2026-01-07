package dev.gian.GianApp.tasks;


import dev.gian.GianApp.programmers.ProgrammerModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String difficulty;

    @OneToMany(mappedBy = "task")
    private List<ProgrammerModel> programmers;


    public TaskModel(){

    }

    public TaskModel(String title, String difficulty){
        this.title = title;
        this.difficulty = difficulty;
    }



}
