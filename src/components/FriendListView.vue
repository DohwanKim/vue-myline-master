<template>
  <div>
    <div class="col border friendListTop">
      <div class="row height1 border-bottom topTabColor">잉여공간</div>
      <div class="row height2 border-bottom">이름으로 검색 및 펼치기 기능</div>
      <div class="row height1 border-bottom middleTabColor">텍스트: 프로필, 열고 닫기 기능^</div>
      <div class="row height3 border-bottom">자신 프로필</div>
      <div class="row height1 border-bottom middleTabColor">텍스트: 친구(??), 열고 닫기 기능 ^</div>
      <div class="row friendList">
        <div class="col">
          <div class="friendHeight row border" v-for="(item, index) in user" v-bind:key="item.key" v-on:click="move">
            <img v-bind:src="item.userImage" class="profileImage rounded-circle"></img>
            {{ item.userName }}
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
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
      move() {
        this.$router.push('/main/profile');
      }
    },
  }
</script>

<style scoped>
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
.friendListTop{
  height: 100vh;
  overflow: hidden;
}
.friendList{
  overflow: scroll;
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