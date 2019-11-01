import React from 'react';
import {connect} from "react-redux";
import {artist, song} from "./ConstAction";

class ContentCardForm extends React.Component {
    render() {
        console.log(this.props)
        return (
            <div className="">
                <form action="">
                    <label >Artist</label>
                    <input type="text" onChange={(event)=>
                    {this.props.dispatch({...artist,index:this.props.index,artistName:event.target.value})}}/>
                    <br/>
                    <label>Songs</label>
                    <input type="text" onChange={(event)=>
                    {this.props.dispatch({...song,index:this.props.index,titleSong:event.target.value})}}/>
                </form>
            </div>
        );
    }
}

export default connect()(ContentCardForm);
