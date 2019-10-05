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
      <div class="col border shareTab">
        <div class="row inSpace">
          <div class="col-2 noPadding inImg">
            <img :src="user.userImage" class="profileImage rounded-circle border">
          </div>
          <div class="col">
            <div class="row">
              <div class="col">
                
                {{user.userName}}
              </div>
            </div>
            <div class="row">
              <div class="col">
                날짜, 시간, 공유범위 아이콘
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col inMiddle">
            게시글 내용시작 호로로로로롤
            호로로로로롤 호로로로로롤
            호호롤
            게시글 내용 끝
          </div>
        </div>
        <div class="row inBottom border-bottom">
          <div class="col-auto mr-auto">
            좋아요 댓글쓰기
          </div>
          <div class="col-auto offset-md-3">
            아이콘
          </div>
        </div>
        <div class="row inBottom">
          <div class="col">
            <div class="row border-bottom">
              <div class="col">
                사진
              </div>
            </div>
            <div class="row comment">
              <div class="col-10 noPadding">
                img*2
                <input type="text" class="" placeholder="댓글을 입력해 주세요.">
              </div>
              <div class="col-2 noPadding submit">
                등록
              </div>
            </div>
          </div>
        </div>
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
            userImage: require('@/assets/user02.jpg'),
            userBI: require('@/assets/profile_background.png')
        },
      }
    },
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
.inImg {
  margin: 10px 0 0 10px;
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
.inMiddle {
  margin: 10px 5px 10px 5px
}
.inBottom {
  background-color: rgb(246, 247, 249);
}
.profileImage {
  width: 50px;
}
.comment {
  margin: 5px 5px 5px 5px;
}
.submit {
  text-align: center;
  background-color: rgb(103, 148, 239);
  color: white;
}
</style>