package com.projectmanagement.domain;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date start_date;
    private Date end_date;


    private Date created_at;
    private Date updated_at;

    @PrePersist
    protected  void onCreate(){
        this.created_at= new Date();
    }

    @PreUpdate
    protected  void onUpdate(){
        this.updated_at = new Date();
    }
}
