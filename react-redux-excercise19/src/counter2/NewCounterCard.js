import React from 'react';
import {connect} from "react-redux";
import {decr, incr} from "./ConstAction";

class NewCounterCard extends React.Component {
    render() {
        return (
            <div>
                <h1>{this.props.element}</h1>
                <button onClick={()=>{this.props.dispatch({...incr,index:this.props.index})}}>plus</button>
                <button onClick={()=>{this.props.dispatch({...decr,index:this.props.index})}}>minus</button>
            </div>
        );
    }
}

export default connect() (NewCounterCard);
