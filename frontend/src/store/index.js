import state from './line/state';
import mutations from './line/mutations';
import actions from './line/actions';
import Vuex from 'vuex';
import Vue from 'vue';

Vue.use(Vuex);

const store = new Vuex.Store({ state, mutations, actions });

export default store;