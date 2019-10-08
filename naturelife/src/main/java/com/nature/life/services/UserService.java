package com.nature.life.services;

import com.google.common.hash.Hashing;
import com.nature.life.entity.UserEntity;
import com.nature.life.repository.UsersRepository;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<UserEntity> getUserByIds(BigInteger ... ids){
        return this.usersRepository.findAllById(Arrays.asList(ids));
    }

    public void createNewUser(UserEntity userEntity){
        String hash = Hashing.sha256()
                             .hashString(userEntity.getPassword().trim(), StandardCharsets.UTF_8)
                             .toString();
        userEntity.setPassword(hash);
        this.usersRepository.save(userEntity);
    }

    public void deleteUser(BigInteger id){
        this.usersRepository.deleteById(id);
    }
}
