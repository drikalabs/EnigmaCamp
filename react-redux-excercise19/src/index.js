import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import CounterContainer from "./counter/CounterContainer";
import * as serviceWorker from './serviceWorker';
import {Provider} from "react-redux";
import {createStore} from "redux";
import counter from "./counter/reducer/CounterReducer";

ReactDOM.render(
    <Provider store={createStore(counter)}>
    <CounterContainer />
    </Provider>,document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
