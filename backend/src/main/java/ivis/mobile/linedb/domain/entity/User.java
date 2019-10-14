package ivis.mobile.linedb.domain.entity;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class User {
    private String user_id;
    private String nick_name;
    private String profile_img;
    private String profile_bg_img;
    private String intro;
    private Timestamp date;
}
