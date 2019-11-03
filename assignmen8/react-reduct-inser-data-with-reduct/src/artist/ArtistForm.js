import React from "react";
import {connect} from "react-redux";
import SongsForm from "./SongsForm";
import {add_form} from "./ConstAction";

class ArtistForm extends React.Component {
    render() {
        console.log(this.props, "ini prosp form")
        return (
            <div className="App">
                <form className="form-style-9">
                    <ul>
                        <li>
                            <input type="text" name="field1" className="field-style field-split align-left"
                                   placeholder="Name" onChange={this.props.nameHandle}/>
                            <input type="text" name="field2" className="field-style field-split align-right"
                                   placeholder="Born Place" onChange={this.props.bornPlace}/>

                        </li>
                        <li>
                            <input type="text" name="field3" className="field-style field-split align-left"
                                   placeholder="Debute Date" onChange={this.props.debuteDate}/>
                            <select name="field4" className="field-style field-split align-right"
                                    onChange={this.props.gender}>
                                <option value="null">Select Your Gender</option>
                                <option value="MALE">Male</option>
                                <option value="FEMALE">Female</option>
                            </select>
                        </li>
                        <li>
                            <input type="file" name="field5" className="field-style" placeholder="Chose file" disabled/><br/>
                            <button className="btn" onClick={this.props.handleAddSong}>Add songs</button>
                        </li>
                        <li>
                            {this.props.dataArtist.songList.map((element, index) => {
                                return <SongsForm element={element} index={index}/>
                            })}
                        </li>
                        <li>
                            <button type="submit" className="btn" onClick={this.props.handlebutton}>Submit</button>
                        </li>
                    </ul>
                </form>


            </div>
        );
    }
}

const toMapSongform = (state) => {
    return {...state}
}
export default connect(toMapSongform)(ArtistForm);