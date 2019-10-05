<template>
  <div id="profile">
    <div class="container border">
      <div class="row border top">
        <div class="col topSpace">
          <img :src="user.userBI" class="backgroundImage">
          <div class="text-left" v-on:click="move">나가기</div>
          <div class="text-right">공유 내역 공간</div>
        </div>
      </div>
      <div class="row middle">
        <div class="col">
          <div class="container">
            <div class="row justify-content-end">
              <div class="col-2 picture-con">
                <img :src="user.userImage" class="profileImage rounded-circle border">
              </div>
              <div class="col-5 align-self-end star">
                즐겨찾기
              </div>
            </div>
          </div>
          <div class="row bottom align-items-end">
            <div class="col nickname">
              {{userName}}
            </div>
          </div>
          <div class="row justify-content-center">
            <div class="col-3 border homeBtn">
              home
            </div>
          </div>
          <div class="row"></div>
          <div class="row"></div>
        </div>
      </div>
      <div class="row bottom border-top">
        <div class="col-4 picture-con">
          <span class="helper"></span>
          <img v-bind:src="user.userImage" class="menuImage"></img>
        </div>
        <div class="col-4 picture-con">
          <span class="helper"></span>
          <img v-bind:src="user.userImage" class="menuImage"></img>
        </div>
        <div class="col-4 picture-con">
          <span class="helper"></span>
          <img v-bind:src="user.userImage" class="menuImage"></img>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    components: {
    },
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
      async exit() {
        await FirebaseService.logout();
      },
      move() {
        this.$router.push('/main');
      }
    },
    computed: {
      userName() {
        var res = this.user.userName + " +수정아이콘";
        return res;
      }
    },
  }
</script>

<style scoped>
#profile{
  min-width: 230px;
  min-height: 100vh;
  background-color: rgb(244, 245, 246);
}
.top{
  height: 200px;
}
.middle{
  height: 200px;
}
.bottom{
  height: 70px;
}
.middleSpace{
  height: 50px;
}
.profileGrid{
  position: absolute;
  margin: 0 auto;
  top: -41px;
}
.picture-con{
  position: relative;
}
.profileImage {
  position: absolute;
  width: 100px;
  bottom: -100px;
  top: 0%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
}
.helper {
  display: inline-block;
  height: 100%;
  vertical-align: middle;
}
.menuImage {
  position: absolute;
  width: 50px;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.star {
  text-align: right;
}
.nickname {
  text-align: center;
}
.homeBtn {
  margin-top: 3%;
}
.topSpace {
  position: relative;
  text-align: center;
  padding: 0 0 0 0;
  height: 200px;
}
.backgroundImage {
  background-size: cover;
  width: 100%;
  height: 100%;
  overflow: hidden;
}
.text-left {
  position: absolute;
  top: 8px;
  left: 16px;
}
.text-right {
  position: absolute;
  top: 8px;
  right: 16px;
}
</style>