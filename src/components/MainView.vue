<template>
  <div id="mainView">
    <div class="container-fluid">
      <div class="row">
        <div class="col border sidebar">
          <div class="row noMargin">
            <div class="col">
              <div class="row topMenuHeight">친구창</div>
              <div class="row topMenuHeight">채팅</div>
              <div class="row topMenuHeight">친추</div>
              <div class="row topMenuHeight">탐라</div>
            </div>
          </div>

          <div class="row sideBottom noMargin">
            <div class="col">
              <div class="row bottomMenuHeight">스샷</div>
              <div class="row bottomMenuHeight">공유</div>
              <div class="row bottomMenuHeight">메뉴</div>
            </div>
          </div>
        </div>
        <div class="col border">
          <!-- 사이즈 고정 목록 -->
          <div class="row height1 border-bottom topTabColor">잉여공간</div>
          <div class="row height2 border-bottom">이름으로 검색 및 펼치기 기능</div>
          <div class="row height1 border-bottom middleTabColor">텍스트: 프로필, 열고 닫기 기능^</div>
          <div class="row height3 border-bottom">자신 프로필</div>
          <div class="row height1 border-bottom middleTabColor">텍스트: 친구(??), 열고 닫기 기능 ^</div>
          <!-- 사이즈 고정 목록 끝 -->
          <div class="row friendList">
            <div class="col">
              <div class="friendHeight row border"></div>
              <div class="friendHeight row border"></div>
              <div class="friendHeight row border"></div>
              <div class="friendHeight row border"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <button @click="logout">logout</button>
  </div>
</template>

<script>
  import FirebaseService from '../api/firebaseService';

  export default {
    methods: {
      async logout() {
        await FirebaseService.logout();
      }
    },
  }
</script>

<style scoped>
#mainView{
  height: 100%;
}
.sidebar{
  color: aliceblue;
  padding: 0 0 0 0;
  margin: 0 0 0 0;
  height: 100vh;
  -ms-flex: 0 0 50px;
  flex: 0 0 50px;
  background-color: rgb(45, 54, 73); 
}
.topMenuHeight{
  height: 40px;
}
.bottomMenuHeight{
  height: 30px;
}
.sideBottom{
  position:absolute;
  bottom:0;
}
.noPadding{
  padding: 0 0 0 0;
}
.noMargin{
  margin: 0 0 0 0;
}
.height1{
  height: 28px;
}
.height2{
  height: 43px;
}
.height3{
  height: 70px;
}
.topTabColor{
  background-color: rgb(239, 242, 245)
}
.middleTabColor{
  background-color: rgb(252, 251, 253)
}
.friendList{
  height: 530px;
  overflow-y: scroll;
}
.friendHeight{
  height: 400px;
}
</style>