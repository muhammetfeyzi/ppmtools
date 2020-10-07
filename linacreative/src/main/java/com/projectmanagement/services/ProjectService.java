package com.projectmanagement.services;

import com.projectmanagement.domain.Project;
import com.projectmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        // logic

        return projectRepository.save(project);
    }
}
