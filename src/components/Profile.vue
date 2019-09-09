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
                  <b-img v-bind="mainProps" rounded="circle" alt="User image" src="../assets/user01.jpeg"></b-img>
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
        mainProps: { blank: true, blankColor: '#777', width: 75, height: 75, class: 'm1' }
      }
    },
  }
</script>

<style scoped>
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
  left: 140px;
  top: -40px;
}

</style>