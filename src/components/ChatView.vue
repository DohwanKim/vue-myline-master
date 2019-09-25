<template>
  <div id="chatview" class="border">
    <div class="row topMenu">
      <div class="col-3 border profileImage">
        <div class="">
          <img :src="user.userImage" class="imageSize rounded-circle border">
        </div>
      </div>
      <div class="col">
        <div class="row">
          <div class="col ">
            이름
          </div>
        </div>
        <div class="row">
          <div class="col ">
            메뉴창들
          </div>
        </div>
      </div>
    </div>
    <div class="row chatSpace border">
      <div class="col">
        채팅창
      </div>
    </div>
    <div class="row chatMenu border">
      <div class="col">
        채팅 메뉴바
      </div>
    </div>
    <div class="row chatMsg">
      <div class="col">
        채팅창 메시지창
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      user: {
          userName: '김동륜',
          userImage: require('@/assets/user02.jpg'),
          userBI: require('@/assets/profile_background.png')
      },
    }
  },
}
</script>

<style scoped>
#chatview {
  min-height: 650px;
  min-width: 300px;
}
.noPadding {
  padding: 0 0 0 0;
}
.noMargin {
  margin: 0 0 0 0;
}
.topMenu {
  height: 70px;
  width: 100%;
  background-color: rgb(45, 54, 73);
}
.profileImage {
  text-align: center
}
.imageSize {
  height: 70px;
}
.chatSpace {
  min-height: 200px;
}
.chatMenu {
  min-height: 40px;
}
.chatMsg {
  min-height: 100px; 
}
</style>