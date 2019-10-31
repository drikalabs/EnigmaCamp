import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import CounterContainer from "./counter/CounterContainer";
import * as serviceWorker from './serviceWorker';
import {Provider} from "react-redux";
import {createStore} from "redux";
import counters from "./counter/reducer/CounterReducer";
import AddButton from "./counter/AddButton";
import NewCounterContainer from "./counter2/NewCounterContainer";
import counter from "./counter2/newReducer/NewCounterReducer";
const App= ()=>(
    <div>
        <CounterContainer/>
        <AddButton/>
    </div>
);
const App2=()=>(
    <NewCounterContainer/>
)
ReactDOM.render(
    <Provider store={createStore(counter)}>
       {/*<App/>*/}
        <App2/>
    </Provider>,document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
