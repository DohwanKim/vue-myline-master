<template>
  <div id="dropdownView">
    <div class="dropdown">
      <div class="item" v-for="(item, idx) in list" :key="idx" @click="logout">
        {{item}}
      </div>
    </div>
  </div>
</template>

<script>
import FirebaseService from '../api/firebaseService';
import { mapState, mapActions } from 'vuex'

export default {
  data() {
    return {
      list: [
        'logout',
        'logout',
        'logout',
        'logout',
      ]
    }
  },
  methods: {
    async logout() {
      await FirebaseService.logout();
      this.changeDropDown(0);
    },
    ...mapActions([
      'changeDropDown',
    ]),
  },
}
</script>

<style scoped>
@keyframes myAni {
  from { background-color: black;}
  to { background-color: gray; }
}
#dropdownView{
  position: fixed;
  bottom: 100px;
  left: 55px;
  z-index: 1;
}
.dropdown{
  width: 100px;
  background-color: gray;
  border: 1px solid black;
  animation-name: myAni;
  animation-duration: 1s;
}

</style>