package com.basic.crudproject.repository;

import com.basic.crudproject.model.TutorialModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<TutorialModel,Long> {

    //returns all Tutorials with published having value as input published
    List<TutorialModel> findByPublished(boolean published);

    //returns all Tutorials which title contains input title
    List<TutorialModel> findByTitleContaining(String title);
}
