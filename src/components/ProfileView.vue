<template>
  <div id="profile">
    <div class="container border">
      <div class="row border top">
        <div class="container">
          <div class="row justify-content-end">
            <div class="col-4 border">
              공유 내역 공간
            </div>
          </div>
        </div>
      </div>
      <div class="row middle">
        <div class="col">
          <div class="container">
            <div class="row">
              <div class="col align-self-end">
                
              </div>
              <div class="col align-self-center profileGrid">
                <div class="container">
                  <img v-bind:src="user.userImage" class="profileImage rounded-circle"></img>
                </div>
              </div>
              <div class="col align-self-end">
                <div class="col-5"> </div>
                <div class="col">hi</div>
              </div>
            </div>
          </div>
          <div class="row"></div>
          <div class="row"></div>
          <div class="row"></div>
          <div class="row"></div>
        </div>
      </div>
      <div class="row bottom border">
        hi
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        user: {
            userName: '김동륜',
            userImage: 'https://yt3.ggpht.com/a-/AN66SAxYHLLDKseP_C5JO3EEACtMBANis6rqfSauzw=s900-mo-c-c0xffffffff-rj-k-no',
        },
      }
    }
  }
</script>

<style scoped>
#profile{
  min-width: 430px;

}
.top{
  height: 200px;
}
.middle{
  height: 200px;
}
.bottom{
  height: 70px;
}
.profileGrid{
  position: absolute;
  width: 50px;
  left: 140px;
  top: -41px;
}
.profileImage {
  background-size: 150px;
  width: 80px;
  height: 80px;
}
</style>