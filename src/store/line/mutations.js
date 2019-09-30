export default {
  updateSelectTab(state, data){
    state.selectTab = data;
  },
  updateSideTab(state, data){
    state.sideTab = data;
  },
  updateDropDown(state, data){ //0: off, 1: on
    state.dropDown = data;
  },
  updateFriendList(state, data){ //0: off, 1: on
    state.friendList = data;
  }
}