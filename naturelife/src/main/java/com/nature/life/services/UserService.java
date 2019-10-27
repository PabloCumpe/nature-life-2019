package com.nature.life.services;

import com.nature.life.entity.CustomerEntity;
import com.nature.life.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final CustomerRepository usersRepository;

    public UserService(CustomerRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<CustomerEntity> getUserByIds(BigInteger ... ids){
        return this.usersRepository.findAllById(Arrays.asList(ids));
    }

  /*  public void createNewUser(CustomerEntity userEntity){
        String hash = Hashing.sha256()
                             .hashString(userEntity.getPassword().trim(), StandardCharsets.UTF_8)
                             .toString();
        userEntity.setPassword(hash);
        this.usersRepository.save(userEntity);
    }
*/
    public void deleteUser(BigInteger id){
        this.usersRepository.deleteById(id);
    }
}
