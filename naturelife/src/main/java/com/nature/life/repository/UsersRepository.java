package com.nature.life.repository;

import com.nature.life.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UsersRepository extends JpaRepository<UserEntity, BigInteger> {
}
