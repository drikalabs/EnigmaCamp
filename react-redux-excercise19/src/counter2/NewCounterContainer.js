import React from 'react';
import NewCounterCard from "./NewCounterCard";
import {connect} from "react-redux";
import {new_element} from "./ConstAction";


class NewCounterContainer extends React.Component {
    render() {
        console.log(this.props)
        return (
            <div>
                <button onClick={()=>{this.props.dispatch(new_element)}}>Add New Element</button>
                {this.props.number.map((element,index)=>{
                    return <NewCounterCard element={element} index={index} key={index}/>
                    console.log(element,index)
                })}
            </div>
        );
    }
}
const mapStateToProps=(state)=>{
    return{number:state.number}
}
export default connect(mapStateToProps) (NewCounterContainer);
