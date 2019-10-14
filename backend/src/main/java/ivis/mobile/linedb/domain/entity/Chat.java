package ivis.mobile.linedb.domain.entity;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class Chat {
    private String rid;
    private String uid;
    private String chat;
    private Timestamp timestamp;
    private String imageUrl;
}
