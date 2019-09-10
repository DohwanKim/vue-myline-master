<template>
  <div id="login">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md">
          <div class="logotext">LINE</div>
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-10 inputarea border">
          <div class="row-md">
            <div class="col">
              <div class="row">
                <div class="col border-bottom input-height tab-active tab-text">
                  이메일 로그인
                </div>
                <div class="col border-left border-bottom input-height tab-text">
                  QR코드 로그인
                </div>
              </div>
              <div class="row border-bottom input-height">
                <input class="inputsize" v-model="auth.idText">
              </div>
              <div class="row input-height">
                <input class="inputsize" v-model="auth.pwText" type="password">
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-10">
          <div class="row">
            <div class="col loginBtn border" @click="firebaseLogin">
              로그인
            </div>
          </div>
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

      <div class="row justify-content-center">
        <div class="col-10">
          <div class="row">
            <div class="col accout border">
               <router-link to="/login/register" exact>신규 가입</router-link>
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
      }
    },
    created () {
      
    },
    methods: {
      firebaseLogin() {
        FirebaseService.login(this.auth.id, this.auth.pw);
      },
      
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
.tab-active{
  background-color: white;
}
.tab-text{
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
  padding-top: 1vh;
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
  padding-top: 1vh;
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

</style>