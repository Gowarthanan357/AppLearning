package com.example.AppLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AppLearning.entity.*;

public interface RepoClass extends JpaRepository<UserEntity,Integer>{

}
