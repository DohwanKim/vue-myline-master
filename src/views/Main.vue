<template>
  <div id="mainView">
    <div class="container-fluid topNoRP">
      <div class="row">
        <div class="col-2 border sidebar">
          <div class="row noMargin">
            <div class="col">
              <div class="row">
                <div class="sideFont topMenuHeight" v-for="(item, index) in sideItems_top" v-bind:key="item.key" v-on:click="changeSideTab(index)">
                  <div v-bind:class="{active: sideTab===index}">{{ item.sideItem }}</div>
                </div>
              </div>
            </div>
          </div>

          <div class="row sideBottom noMargin">
            <div class="col">
              <div class="row sortSet">
                <div class="sideBottom">
                  <div class="sideFont" v-for="(item, index) in sideItems_bottom" v-bind:key="item.key">
                    {{ item.sideItem }}
                  </div>
                  <div class="sideFont" v-on:click="dropdown_toggle()">메뉴</div>
                  <DropdownView v-show="dropDown === 1"/>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col border component">
          <FriendListView v-show="sideTab === 0"/>
          <ChatHistoryView v-show="sideTab === 1"/>
          <TimeLineView v-show="sideTab === 2"/>
          <NewFriendView v-show="sideTab === 3"/>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { mapState, mapActions } from 'vuex'

  import FriendListView from '@/components/FriendListView.vue';
  import ChatHistoryView from '@/components/ChatHistoryView.vue';
  import TimeLineView from '@/components/TimeLineView.vue';
  import NewFriendView from '@/components/NewFriendView.vue';
  import DropdownView from '@/components/DropdownView.vue'

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
          {},
          {},
        ],
      }
    },
    methods: {
      ...mapActions([
        'changeSideTab',
        'changeDropDown'
      ]),
      dropdown_toggle(){
        if(this.dropDown === 0){ this.changeDropDown(1) }
        else { this.changeDropDown(0) }
      },
    },
    components: {
      FriendListView,
      ChatHistoryView,
      TimeLineView,
      NewFriendView,
      DropdownView
    },
    computed: {
      ...mapState([
        'sideTab',
        'dropDown',
      ])
    },
    // watch: {
    //   sideTab(nVal) {
    //     console.log(nVal);
    //   },
    //   dropDown(nVal) {
    //     console.log(nVal);
    //   }
    // },
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
  bottom:25px;
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
.sideFont{
  color: rgb(125, 141, 176);
  cursor: pointer;
}
.active{
  color: rgb(255, 255, 255)
}
.component {
  padding: 0 0 0 0;
}
.topNoRP {
  padding-right: 0;
}
</style>