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
          <router-link to="/login" exact>회원가입</router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    
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