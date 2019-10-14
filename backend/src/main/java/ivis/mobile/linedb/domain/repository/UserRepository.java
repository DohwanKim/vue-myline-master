package ivis.mobile.linedb.domain.repository;

import ivis.mobile.linedb.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Map;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public User getUserInfo(String userId){
        String query = "SELECT * FROM user WHERE user_id = ?";
        Map<String, Object> res = jdbcTemplate.queryForMap(query, new Object[]{userId});

        return mappingUser(res);
    }
    public User mappingUser(Map<String, Object> data) {
        User user = new User();
        user.setDate((Timestamp) data.get("date"));
        user.setIntro((String) data.get("intro"));
        user.setNick_name((String) data.get("nick_Name"));
        user.setProfile_img((String) data.get("profile_img"));
        user.setProfile_bg_img((String) data.get("profile_bg_img"));
        user.setUser_id((String) data.get("user_id"));
        return user;
    }
}
