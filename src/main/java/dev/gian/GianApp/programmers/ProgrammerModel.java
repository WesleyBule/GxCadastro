package dev.gian.GianApp.programmers;


import dev.gian.GianApp.tasks.TaskModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_register")
public class ProgrammerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private  Long id;
    private String name;
    private String email;
    private int age;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private TaskModel task;


    public ProgrammerModel(){

    }

    public ProgrammerModel(String name, String email , int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
