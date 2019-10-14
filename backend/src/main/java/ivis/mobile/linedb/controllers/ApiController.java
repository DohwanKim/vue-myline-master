package ivis.mobile.linedb.controllers;

import ivis.mobile.linedb.domain.entity.Chat;
import ivis.mobile.linedb.domain.entity.User;
import ivis.mobile.linedb.service.ChatService;
import ivis.mobile.linedb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    UserService userService;
    @Autowired
    ChatService chatService;
    //USER API
    @GetMapping("/user/info/{id}")
    public User getUserInfo(@PathVariable String id){
        return userService.getUserinfo(id);
    }
    @GetMapping("/chat/info/{data}")
    public Chat getChatInfo(@PathVariable String data){
        return chatService.getChatinfo(data);
    }
    @GetMapping("/chat/allinfo/{check}")
    public List getChatAllInfo(@PathVariable String check) {return chatService.getAllChatInfo();}
}
