<template>
  <div id="profile">
    <div class="container border">
      <div class="row border top">
        <div class="container">
          <div class="row justify-content-between">
            <div class="col-3" v-on:click="move">
              나가기
            </div>
            <div class="col-4 border">
              공유 내역 공간
            </div>
          </div>
        </div>
      </div>
      <div class="row middle">
        <div class="col">
          <div class="container">
            <div class="row justify-content-end">
              <div class="col-2 picture-con">
                <img v-bind:src="user.userImage" class="profileImage rounded-circle border"></img>
              </div>
              <div class="col-5 align-self-end star">
                즐겨찾기
              </div>
            </div>
          </div>
          <div class="row bottom align-items-end">
            <div class="col nickname">
              {{ user.userName }} +수정아이콘
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
    data() {
      return {
        user: {
            userName: '김동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
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
  }
</script>

<style scoped>
#profile{
  min-width: 230px;

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
</style>