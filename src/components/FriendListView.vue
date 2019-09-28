<template>
  <div>
    <div class="col border friendListTop">
      <div class="row height1 border-bottom topTabColor">
        <div class="col">잉여공간</div>
      </div>
      <div class="row height2 border-bottom">
        <div class="col">이름으로 검색 및 펼치기 기능</div>
      </div>
      <div class="row height1 border-bottom middleTabColor">
        <div class="col">텍스트: 프로필, 열고 닫기 기능^</div>
      </div>
      <div class="row height3 border-bottom">
        <div class="col">자신 프로필</div>
      </div>
      <div class="row height1 border-bottom middleTabColor">
        <div class="col">텍스트: 친구(??), 열고 닫기 기능 ^</div>
      </div>
      <div class="row friendHeight">
        <div class="col">
          <div class="row border friendList" v-for="(item, index) in user" v-bind:key="item.key" @click="clicked(index)" @dblclick="clicked(index)">
            <div class="col friend" v-bind="">
              <img v-bind:src="item.userImage" class="profileImage rounded-circle" v-on:click.stop="moveProfile"></img>
              {{ item.userName }}
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { mapState, mapActions } from 'vuex'

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
        click: undefined,
        clickType: 'Click or Doubleclick ME',
      }
    },
    methods: {
      moveProfile() {
        this.$router.push('/main/profile');
      },
      moveChat() {
        this.$router.push('/main/chat');
      },
      clicked(index) {
        return new Promise ((resolve, reject) => {
          if (this.click) {
            clearTimeout(this.click)
            resolve('Detected DoubleClick')
            
          }
          this.click = setTimeout(() => {
          this.click = undefined
          resolve('Detected SingleClick')
          }, 200)
        })
      },
    },
    ...mapActions([
      'changeDropDown',
    ]),
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
  background-color: rgb(239, 242, 245);
}
.middleTabColor{
  background-color: rgb(252, 251, 253);
}
.friendListTop{
  height: 100vh;
  z-index: 1;
}
.friendHeight {
  max-height: 70vh;
  overflow: scroll;
}
.friend {
  height: 200px;
  z-index: 2;
}
.active {
  background-color: rgb(237, 234, 238);
}
.profileImage {
  background-size: 150px;
  width: 70px;
  height: 70px;
}

</style>