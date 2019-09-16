<template>
  <div class="home">
    <LoginView v-bind="selectTab" v-if="visibleList.TabView" @change="changeTab"></LoginView>
    <button @click="test1">+</button>
    <button @click="test2">-</button>
  </div>
</template>

<script>
// @ is an alias to /src
import LoginView from '@/components/LoginView.vue';

export default {
  name: 'home',
  data(){
    return {
      selectTab: 0,
    }
  },
  components: {
    LoginView,
  },
  methods: {
    test1() {
      this.$store.state.selectTab++;
    },
    test2(){
      this.$store.state.selectTab--;
    },
  },
};
</script>
