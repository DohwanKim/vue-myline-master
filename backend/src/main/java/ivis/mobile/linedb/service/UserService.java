package ivis.mobile.linedb.service;

import ivis.mobile.linedb.domain.entity.User;
import ivis.mobile.linedb.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User getUserinfo(String userId){
        return userRepository.getUserInfo(userId);
    }

}
