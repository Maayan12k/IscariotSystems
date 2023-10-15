package com.isacariotsystems.MemberSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isacariotsystems.MemberSystem.entity.Rank;

@Repository
public interface RankRepository extends JpaRepository<Rank,Integer>{
    
}
