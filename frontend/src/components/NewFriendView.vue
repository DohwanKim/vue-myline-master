<template>
  <div id="AddFriends">
    <div class="row topColors noMargin topSpace border-bottom"></div>
    <div class="row topColors noMargin addSpace border-bottom">
      <div class="col">
        이미지, 친구 찾기
      </div>
    </div>
    <div class="row topColors noMargin addSpace">
      <div class="col">
        이미지, 그룹 만들기
      </div>
    </div>
    <div class="row findSpace noMargin">
      <div class="col-10">
        추천 공식 계정
      </div>
      <div class="col-2">
        △
      </div>
    </div>
    <div class="row noMargin">
      <div class="col">
        <div class="row border friendList" v-for="(item, index) in user" v-bind:key="index" v-bind:data-index="index" @click="listClicked" @dblclick="listClicked">
          <div class="col friend" v-bind:data-index="index">
            <img v-bind:src="item.userImage" class="profileImage rounded-circle" v-on:click.stop="moveProfile(index)"></img>
            {{ item.userName }}
          </div>
        </div>
      </div>
    </div>
    <div class="row findSpace noMargin">
      <div class="col-10">
        친구 추천
      </div>
      <div class="col-2">
        △
      </div>
    </div>
    <div class="row noMargin">
      <div class="col">
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
        user: [
          {
            userName: '김동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
          {
            userName: '박동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
          },
        ],
      }
    },
  }
</script>

<style scoped>
#AddFriends {
   
}
.topColors {
  color : rgb(75, 79, 86);
  background-color: rgb(239, 242, 245);
}
.noPadding {
  padding: 0 0 0 0;
}
.noMargin {
  margin: 0 0 0 0;
}
.topSpace {
  height: 25px;
}
.addSpace {
  height: 45px;
}
.findSpace {
  color: rgb(150, 155, 164);
  background-color: rgb(251, 251, 253);
}
.profileImage {
  background-size: 150px;
  width: 70px;
  height: 70px;
}
</style>