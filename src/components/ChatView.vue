<template>
  <div id="chatview" class="border">
    <div class="row topMenu">
      <div class="col-3">
        <div class="profileImage">
          <img :src="user.userImage" class="imageSize rounded-circle border">
        </div>
      </div>
      <div class="col">
        <div class="row topMenuIn">
          <div class="col whiteText">
            이름
          </div>
        </div>
        <div class="row topMenuIn">
          <div class="col whiteText">
            메뉴창들
            <div class="exit whiteText" v-on:click="goMenu">나가기</div>
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
        <textarea class="textArea border"></textarea>
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
  methods: {
    goMenu() {
      this.$router.push('/main');
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
  margin: 0 0 0 0;
  height: 70px;
  width: 100%;
  background-color: rgb(45, 54, 73);
}
.topMenuIn{
  height: 50%;
}
.profileImage {
  text-align: center
}
.imageSize {
  height: 70px;
}
.chatSpace {
  margin: 0 0 0 0;
  min-height: 200px;
}
.chatMenu {
  margin: 0 0 0 0;
  min-height: 40px;
}
.chatMsg {
  min-height: 100px; 
}
.textArea {
  height: 100%;
  width: 100%;
}
.exit {
  float: right;
}
.whiteText {
  color: white;
}
</style>