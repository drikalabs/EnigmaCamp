import React from 'react';
import {connect} from "react-redux";
import '../App.css';

class CounterContainer extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
        const increment={type:'INCREMENT'};
        const dicrement={type:'DECREMENT'};
        return (
            <div className="card">

                <h1>{this.props.number}</h1>
                <button onClick={()=>{this.props.dispatch(dicrement)}}>-</button>
                <button onClick={()=>{this.props.dispatch(increment)}}>+</button>
            </div>

        );
    }
}
const mapStateToProps=(state)=>{
    return{number:state.number}
}
const mapDispatcToProps=(dispatch) =>{
    return{

    }
}
export default connect(mapStateToProps) (CounterContainer);