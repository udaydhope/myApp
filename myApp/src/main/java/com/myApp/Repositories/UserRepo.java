package com.myApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.Model.Userdetails;

public interface UserRepo extends JpaRepository<Userdetails, String> {

}
