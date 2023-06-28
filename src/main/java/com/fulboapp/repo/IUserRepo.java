package com.fulboapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fulboapp.model.User;


public interface IUserRepo extends JpaRepository<User, Integer> {

  User findByCi(Long userCi);


}
