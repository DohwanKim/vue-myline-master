package ivis.mobile.linedb.domain.repository;

import ivis.mobile.linedb.domain.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ChatRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Chat getChatInfo(String rId){
        String query = "SELECT * FROM chat WHERE rId = ?";
        Map<String, Object> res = jdbcTemplate.queryForMap(query, new Object[]{rId});

        return mappingChat(res);
    }

    public List<Map<String, Object>> getAllInfo(){
        String query = "SELECT * FROM chat";
        List<Map<String, Object>> res = jdbcTemplate.queryForList(query);

        return mappingAll(res);
    }


    public List mappingAll(List<Map<String, Object>> dataAll) {
        List chatAll = new ArrayList<Chat>();
        for(Map<String, Object> data : dataAll){
            chatAll.add(mappingChat(data));
        }

        return chatAll;
    }
    public Chat mappingChat(Map<String, Object> data) {
        Chat chat = new Chat();
        chat.setRid((String) data.get("rid"));
        chat.setUid((String) data.get("uid"));
        chat.setChat((String) data.get("chat"));
        chat.setImageUrl((String) data.get("imageUrl"));
        chat.setTimestamp((Timestamp) data.get("timestamp"));
        return chat;
    }
}
