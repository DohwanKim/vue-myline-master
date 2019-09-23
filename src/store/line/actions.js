export default {
  changeTab({commit}, data){ //context = {dispatch, state, commit}
    commit('updateSelectTab', data);
  },
  changeSideTab({commit}, data){
    commit('updateSideTab', data);
  },
  changeDropDown({commit}, data){
    commit('updateDropDown', data)
  }
}