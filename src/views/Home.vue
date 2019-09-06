<template>
  <div class="home">
    <LoginView :selectTab="selectTab" v-if="visibleList.TabView" @change="changeTab"></LoginView>
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
};
</script>
