CREATE TABLE user (
  user_id VARCHAR(20) NOT NULL,
  nick_name VARCHAR(20),
  profile_img VARCHAR(250),
  profile_bg_img VARCHAR(250),
  intro VARCHAR(250),
  date TIMESTAMP NOT NULL,
  PRIMARY KEY (user_id)
)