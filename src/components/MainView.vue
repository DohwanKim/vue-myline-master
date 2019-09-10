<template>
  <div id="mainView">
    <div class="container-fluid">
      <div class="row">
        <div class="col border sidebar">
          <div class="row noMargin">
            <div class="col">
              <div class="row">
                <div v-for="(item, index) in sideItems_top" v-bind:key="item.key" class="topMenuHeight">
                  {{ item.sideItem }}
                </div>
              </div>
            </div>
          </div>

          <div class="row sideBottom noMargin">
            <div class="col">
              <div class="row sortSet">
                <div class="sideBottom">
                  <div v-for="(item, index) in sideItems_bottom" v-bind:key="item.key">
                    {{ item.sideItem }}
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col border">
          <div class="row height1 border-bottom topTabColor">잉여공간</div>
          <div class="row height2 border-bottom">이름으로 검색 및 펼치기 기능</div>
          <div class="row height1 border-bottom middleTabColor">텍스트: 프로필, 열고 닫기 기능^</div>
          <div class="row height3 border-bottom">자신 프로필</div>
          <div class="row height1 border-bottom middleTabColor">텍스트: 친구(??), 열고 닫기 기능 ^</div>
          
          <div class="row friendList">
            <div class="col">
              <div class="friendHeight row border" v-for="(item, index) in user" v-bind:key="item.key">
                <img v-bind:src="item.userImage" class="profileImage rounded-circle"></img>
                {{ item.userName }}
              </div>
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
    data() {
      return {
        sideItems_top: [
          { sideItem: '친구' },
          { sideItem: '채팅' },
          { sideItem: '탐라' },
          { sideItem: '친추추가' },
          {},
          {},
        ],
        sideItems_bottom: [
          { sideItem: '스샷' },
          { sideItem: '공유' },
          { sideItem: '메뉴' },
          {},
          {},
        ],
        user: [
          {
            userName: '김동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
          {
            userName: '박동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
          {
            userName: '핵동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
          {
            userName: '정동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
        ],
      }
    },
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
.sortSet{
  position: relative;
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
  position: absolute;;
  bottom:10px;
}
.stackBottom{
  flex-direction: column;
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
  height: 200px;
}
.profileImage {
  background-size: 150px;
  width: 70px;
  height: 70px;
}
</style>