import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';
import Login from './components/LoginView.vue';
import Register from './components/RegisterView.vue';
import Main from './components/MainView.vue';
import Profile from './components/Profile.vue'

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
      path: '/login/register',
      name: 'register',
      component: Register,
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
    {
      path: '/main/profile',
      name: 'profile',
      component: Profile,
      meta: {
        auth: false,
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