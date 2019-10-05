<template>
  <div id="register">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-10 input-height">
          <input class="inputsize border" >
        </div>
      </div>
      <div class="row justify-content-center">
        <div class="col-10 input-height">
          <input class="inputsize border"> 
        </div>
      </div>
      <div class="row justify-content-center">
        <div class="col-10 input-height">
          <input class="inputsize border"> 
        </div>
      </div>
      <div class="row justify-content-center">
        <div class="col-10 input-height">
          <div v-on:click="move">회원가입</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    methods: {
      move() {
        this.$router.push('/login');
      }
    },
  }
</script>

<style scoped>
.input-height{
  height: 6vh;
  margin: 0 0 0 0;
}
.inputsize{
  height: 100%;
  width: 100%;
}
</style>