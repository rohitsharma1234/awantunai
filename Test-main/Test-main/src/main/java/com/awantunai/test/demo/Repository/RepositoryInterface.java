package com.awantunai.test.demo.Repository;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awantunai.test.demo.Entity.User;

//package com.awantunai.test.demo.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositoryInterface extends JpaRepository<User,Integer> {

}
