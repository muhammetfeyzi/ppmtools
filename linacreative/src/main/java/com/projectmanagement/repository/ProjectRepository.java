package com.projectmanagement.repository;

import com.projectmanagement.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository <Project,Long> {
    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
