package ivis.mobile.linedb.service;

import ivis.mobile.linedb.domain.entity.Chat;
import ivis.mobile.linedb.domain.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChatService {
    @Autowired
    ChatRepository chatRepository;
    public Chat getChatinfo(String rId){
        return chatRepository.getChatInfo(rId);
    }
    public List getAllChatInfo(){
        return chatRepository.getAllInfo();
    }

}
