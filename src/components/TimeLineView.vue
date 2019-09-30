<template>
  <div id="timeLine">
    <div class="row top noMargin">
      <div class="col">
      </div>
    </div>
    <div class="row middle noMargin border">
      <div class="col shareTab border">
        공유하기
      </div>
    </div>
    <div class="row noMargin bottom">
      <div class="col border shareTab test">
        <div class="row">
          상단
        </div>
        <div class="row">
          중단
        </div>
        <div class="row">
          하단
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
#timeLine {
  height: 100%;
  width: 100%;
  background-color: rgb(238, 242, 245);
  padding: 0 0 0 0;
}
.noPadding {
  padding: 0 0 0 0;
}
.noMargin {
  margin: 0 0 0 0;
}
.helper {
  display: inline-block;
  height: 100%;
  vertical-align: middle;
}
.top {
  height: 3.5vh;
}
.middle {
  height: 9.5vh;
  text-align: center;
}
.bottom {
  max-height: 87vh;
  overflow: scroll;
}
.shareTab {
  margin: 10px 10px 10px 10px;
  background-color: white;
}
.test {
  height: 300px;
}
</style>