<template>
  <div id="login">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md">
          <div class="logotext">LINE</div>
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-10 inputarea">
          <div class="row-md">
            <div class="col">
              <div class="row noPadding">
                <div class="col border input-height tab-text noPadding" @click="loginTab(0)">
                  <div class="inputsize" v-bind:class="{ active: this.$store.state.selectTab === 0}">
                    <span class="helper"></span>
                    이메일 로그인
                  </div>
                </div>
                <div class="col border-right border-bottom border-top input-height tab-text noPadding" @click="loginTab(1)">
                  <div class="inputsize" v-bind:class="{ active: this.$store.state.selectTab === 1 }">
                    <span class="helper"></span>
                    QR코드 로그인
                  </div>
                </div>
              </div>
              <!-- 탭값에 따라 변경되는 부분 -->
              <div class="tab-content">
                <div v-show="this.$store.state.selectTab === 0">
                  <div class="row border-bottom border-left border-right input-height">
                    <input class="inputsize" v-model="auth.idText" placeholder="이메일">
                  </div>
                  <div class="row border-bottom border-left border-right input-height">
                    <input class="inputsize" v-model="auth.pwText" type="password" placeholder="비밀번호">
                  </div>
                  <div class="row">
                    <div class="col loginBtn border" @click="firebaseLogin">
                      <span class="helper"></span>
                      로그인
                    </div>
                  </div>
                  <div class="row phonelogin justify-content-center">
                    <div class="col-10">
                      전화번호 로그인 >
                    </div>
                  </div>
                  <div class="row justify-content-center">
                    <div class="col-10 autologin">
                      <b-form-checkbox>자동 로그인</b-form-checkbox>
                    </div>
                  </div>
                </div>
                <div v-show="this.$store.state.selectTab === 1" class="tab-text">
                  <img v-bind:src="qrCode" class="rounded qrImage"></img>
                  <div class="row phonelogin">
                    <div class="col-7">
                      QR코드 로그인 안내 >
                    </div>
                  </div>
                </div>
              </div>
              <!-- 탭값에 따라 변경되는 부분 끝 -->
            </div>
          </div>
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-10">
          <div class="row">
            <div class="col accout border">
              <span class="helper"></span>
              <router-link to="/login/register" exact class="blackfont">신규 가입</router-link>
            </div>
          </div>
        </div>
      </div>

      <div class="row fpassword border-top justify-content-center">
        <div class="col-md-auto">
          <img src="../assets/lock.png">
          비밀번호 찾기
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import FirebaseService from '../api/firebaseService';

  export default {
    data() {
      return {
        firebaseService: FirebaseService,
        auth: {
          idText : '',
          pwText : '',
        },
        qrCode: 'https://qrcode.tec-it.com/API/QRCode?data=MECARD%3AN%3AJohn+Doe%3BTEL%3A555-555-5555%3BEMAIL%3Aemail%40example.com%3BNOTE%3AContoso%3BURL%3Ahttp%3A%2F%2Fwww.example.com%3B',
      }
    },
    created () {
      
    },
    methods: {
      firebaseLogin() {
        FirebaseService.login(this.auth.id, this.auth.pw);
      },
      loginTab(tabNum){
        this.$store.state.selectTab = tabNum;
        console.log(this.$store.state.selectTab);
      },
      selectTabClass(){
        
      }
    },
  }
</script>

<style scoped>
#login{
  position: relative;
  background-color: rgb(244, 245, 246);
}
.testbc1{
  background-color: burlywood;
}
.testbc2{
  background-color: cyan;
}
.testbc3{
  background-color: darkslateblue;
}
.logotext {
  margin-top: 10vh;
  margin-bottom: 0%;
  height: 15vh;
  font-size: 40pt;
  font-weight: 800;
  color : rgb(85, 186, 54);
  text-align: center;
  width: 100%;
}
.active{
  color:black;
  background-color: white;
}
.tab-text{
  color:rgb(144, 144, 145);
  font-weight: 600;
  text-align: center;
  padding: 1vh;
  margin: 0 0 0 0;
}
.input-height{
  height: 6vh;
}
.inputarea{
  padding: 0%;
  border: soild;
  border-color: rgb(211, 214, 219);
}
.inputsize{
  padding: 6px;
  height: 100%;
  width: 100%;
}
.loginBtn{
  background-color: white;
  height: 7vh;
  margin-top: 1vh;
  text-align: center;
  font-size: 15pt;
  font-weight: 900;
  color: rgb(89, 92, 99);
  vertical-align: middle;
}
.phonelogin{
  color: rgb(89, 92, 99);
  font-weight: 800;
  vertical-align: middle;
  text-align: center;
  margin-top: 2vh;
}
.autologin{
  color: rgb(89, 92, 99);
  font-weight: 600;
  margin-top: 6vh;
  padding: 0 0 0 0;
  height: 10vh;
}
.accout{
  background-color: white;
  height: 6vh;
  margin-top: 1vh;
  text-align: center;
  font-size: 13pt;
  font-weight: 800;
  color: rgb(89, 92, 99);
  vertical-align: middle;
}
.fpassword {
  background-color: rgb(244, 245, 246);
  height: 6vh;
  margin-top: 3vh;
  text-align: center;
  font-size: 13pt;
  font-weight: 800;
  color: rgb(89, 92, 99);
  vertical-align: middle;
  padding-top: 1vh;
}
.qrback{
  background-color: white;
}
.qrImage{
  padding: 0 0 0 0;
  background-size: 150px;
  width: 200px;
  height: 200px;
}
.noMargin{
  margin: 0 0 0 0;
}
.noPadding{
  padding: 0 0 0 0;
}
.helper {
  display: inline-block;
  height: 100%;
  vertical-align: middle;
}
.blackfont{
  color: rgb(89, 92, 99);
}
</style>