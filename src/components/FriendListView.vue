<template>
  <div id="friendList">
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
        <div class="col-10" v-on:click="hideFriend()">
          친구({{this.user.length}})
        </div>
        <div class="col-2" v-show="this.friendList === 0">△</div>
        <div class="col-2" v-show="this.friendList === 1">▽</div>
      </div>
      <div class="row friendHeight" v-show="this.friendList === 0">
        <div class="col" ref="profileList">
          <div class="row border friendList" v-for="(item, index) in user" v-bind:key="index" v-bind:data-index="index" @click="listClicked" @dblclick="listClicked">
            <div class="col friend" v-bind:data-index="index">
              <img v-bind:src="item.userImage" class="profileImage rounded-circle" v-on:click.stop="moveProfile(index)"></img>
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
        targetIndex: Number,
        click: undefined,
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
    watch: {
      targetIndex(nValue, oValue) {
        var { profileList } = this.$refs
        var targets = profileList.children
        targets[nValue].classList.toggle('active')
        targets[oValue].classList.remove('active') 
      }
    },
    methods: {
      ...mapActions([
        'changeDropDown',
        'changeFriendList',
      ]),
      moveProfile(index) {
        this.$router.push('/main/profile');
      },
      moveChat() {
        this.$router.push('/main/chat');
      },
      hideFriend() {
        if(this.friendList === 0){ this.changeFriendList(1); }
        else { this.changeFriendList(0); }
      },
      listClicked(evt) {
        var target = evt.target
        var { index } = target.dataset
        this.targetIndex = parseInt(index);
        return new Promise ((resolve, reject) => {
          if (this.click) {
            clearTimeout(this.click);
            this.moveChat();
          }
          this.click = setTimeout(() => {
            this.click = undefined;
          }, 200)
        })
      },
    },
    computed: {
      ...mapState([
        'friendList',
      ])
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
.cramp {
  text-align: end;
}

</style>