package com.mycuteblog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.mycuteblog.model.Parents;
 
public interface ParentRepository extends JpaRepository<Parents, Long> {
 
   Parents findOne(Long id);
   
   Parents save (Parents parents);

}