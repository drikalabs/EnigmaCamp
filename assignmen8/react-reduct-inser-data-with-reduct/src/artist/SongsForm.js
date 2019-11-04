import React from "react";
import {connect} from "react-redux";
import {song_releaseDate_handler, song_title_handler} from "./ConstAction";
class SongsForm extends React.Component{
    render() {
        return (
            <div className="App">
                <form className="form-style-9">
                    <ul>
                        <li>
                            <input type="text" name="field1" className="field-style field-split align-left"
                                   placeholder="Title" onChange={(event)=>{this.props.dispatch({...song_title_handler,index:this.props.index,payload:event.target.value})}}/>
                            <input type="date" name="field2" className="field-style field-split align-right"
                                   placeholder="release date" onChange={(event)=>{this.props.dispatch({...song_releaseDate_handler,index:this.props.index,payload:event.target.value})}} />

                        </li>
                    </ul>
                </form>
            </div>
        );
    }
}
export default connect() (SongsForm);