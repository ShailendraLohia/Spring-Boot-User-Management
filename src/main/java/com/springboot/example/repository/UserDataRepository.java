package com.springboot.example.repository;

import com.springboot.example.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserInfo,String> {
}
