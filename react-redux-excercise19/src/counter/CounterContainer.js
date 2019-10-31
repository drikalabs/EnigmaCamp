import React from 'react';
import { connect } from 'react-redux';
import Counter from './Counter';
import '../App.css';
import {decrement, increment} from "./Const_Action";

const CounterContainer = ({
                              counters,
                              onIncrement,
                              onDecrement
                          }) => (
    <ul>
        {counters.map(counter =>
            <Counter key={counter.id}
                     value={counter.count}
                     onIncrement={() => onIncrement(counter.id)}
                     onDecrement={() => onDecrement(counter.id)}
            />
        )}
    </ul>
);
const mapStateToProps = (state) => {
    console.log(state)
    return {counters: state}
};
const mapDispatchToProps = (dispatch) => {
    return {
        onIncrement: (id) => dispatch(increment(id)),
        onDecrement: (id) => dispatch(decrement(id))
    };
};
export default connect(
    mapStateToProps,
    mapDispatchToProps
)(CounterContainer);
// const mapDispatcToProps=(dispatch) =>{
//     return{
//     }
//}
//export default connect(mapStateToProps)(CounterContainer);