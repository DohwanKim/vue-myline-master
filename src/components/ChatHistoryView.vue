<template>
  <div id="chatHistory">
    <div class="row noMargin">
      <div class="col top border-bottom">
      </div>
    </div>
    <div class="row noMargin middle">
      <div class="col noPadding">
        아이콘
        <input type="text" class="search" placeholder="대화방, 메시지 검색">
        아이콘
        아이콘
      </div>
    </div>
    <div class="row noMargin friendHeight">
      <div class="col border" ref="profileList">
        <div class="row border friendList" v-for="(item, index) in user" v-bind:key="index" v-bind:data-index="index" @click="listClicked" @dblclick="listClicked">
            <div class="col friend" v-bind:data-index="index">
              <img v-bind:src="item.userImage" class="profileImage rounded-circle" v-on:click.stop="moveProfile(index)"></img>
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
      moveProfile(index) {
        this.$router.push('/main/profile');
      },
      moveChat() {
        this.$router.push('/main/chat');
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
  }
</script>

<style scoped>
#chatHistory {
}
.noPadding {
  padding: 0 0 0 0;
}
.noMargin {
  margin: 0 0 0 0;
}
.top {
  background-color: rgb(238, 242, 245);
  height: 22px;
}
.middle {
  height: 35px;
  text-align: center;
}
.helper {
  display: inline-block;
  height: 100%;
  vertical-align: middle;
}
.search {
  width: 50%;
  height: 20px;
  border: 0px solid;
}
.friendHeight {
  max-height: 70vh;
  overflow: scroll;
}
.friendList {
  height: 75px;
}
.profileImage {
  background-size: 150px;
  width: 60px;
  height: 60px;
}
.active {
  background-color: rgb(237, 234, 238);
}
</style>