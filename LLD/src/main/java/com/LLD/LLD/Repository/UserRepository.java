package com.LLD.LLD.Repository;

import com.LLD.LLD.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
