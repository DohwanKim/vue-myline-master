import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';
import Login from './components/LoginView.vue';
import Signup from './views/Signup.vue';
import Main from './views/Main.vue';
import FirebaseService from './api/firebaseService'

Vue.use(Router);

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
      meta: {
        auth: false,
      },
    },
    {
      path: '/login',
      name: 'login',
      component: Login,
      meta: {
        auth: false,
      },
    },
    {
      path: '/signup',
      name: 'signup',
      component: Signup,
      meta: {
        auth: false,
      },
    },
    {
      path: '/main',
      name: 'main',
      component: Main,
      meta: {
        auth: true,
      },
    },
  ],
});

var app = FirebaseService.init();
app.auth().onAuthStateChanged((user) => {
  if(user!==null && router.currentRoute.path=='/login'){
    router.push('/main')
  }
  if(user===null && router.currentRoute.meta.auth){
    router.push('/login')
  }
})


export default router;