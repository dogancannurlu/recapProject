package com.etiya.recapProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.recapProject.entities.concretes.ApplicationUser;

public interface UserDao extends JpaRepository<ApplicationUser, Integer> {

}