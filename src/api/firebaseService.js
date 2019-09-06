import * as firebase from 'firebase';

export default{
  init(){ //초기화 될때 이 친구를 가져옴
    this.app = firebase.initializeApp({
      apiKey: "AIzaSyAk73xY6eDCQGzzVPJONwXG9tAe9MbakEk",
      authDomain: "vue-line-master.firebaseapp.com",
      databaseURL: "https://vue-line-master.firebaseio.com",
      projectId: "vue-line-master",
      storageBucket: "",
      messagingSenderId: "665981077520",
      appId: "1:665981077520:web:359ac3741e7245ef"
    })
    return this.app
  },

  login(email, password){
    this.app.auth().signInWithEmailAndPassword(email, password);
  },
  
  logout(){
    return this.app.auth().signOut();
  }
}