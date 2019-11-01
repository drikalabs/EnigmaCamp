import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {Provider} from "react-redux";
import ContentContainer from "./component/ContentContainer";
import {createStore} from "redux";
import content_changer from "./component/reducer/ContentReducer";

ReactDOM.render(
    <Provider store={createStore(content_changer)}>
        <ContentContainer/>
    </Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
