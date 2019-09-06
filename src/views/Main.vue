<template>
  <div>
    <button @click="logout">logout</button>
  </div>
</template>

<script>
  import FirebaseService from '../api/firebaseService';

  export default {
    methods: {
      async logout() {
        await FirebaseService.logout();
      }
    },
  }
</script>

<style lang="scss" scoped>

</style>