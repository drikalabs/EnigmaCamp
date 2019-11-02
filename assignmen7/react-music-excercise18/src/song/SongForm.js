import React from 'react';
import '../App.css';
import {fetchService, fetchtPagination, Submitdata} from "../artist/ArtistService";
import {SubmitSong} from "./SongsService";

class SongForm extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            artistList: [],
            songData: {}
        }
    }

    render() {

        return (
            <div>
                <h1>Ini Form</h1>
                <section className="form">
                    <form>
                        <input type="text" name="title" placeholder="Title Song" onChange={this.inputTitle}/>
                        <select name="Artist" id="" onChange={this.inputArtist}>
                            <option value="">Select Artist</option>
                            {this.state.artistList.map(isi=>{
                                return<option value={isi.idArtist}>{isi.artistName}</option>
                            })}
                        </select>
                        <input type="text" name="date" placeholder="yyyy-MM-dd" onChange={this.inputdate}/><br/>

                        <button type="submit" className="btn" onClick={this.handleButton}>Submit</button>
                    </form>
                </section>
                <hr/>
            </div>
        );
    }
    componentDidMount() {
        this.fetchArtist()
    }

    fetchArtist = async () => {
        const data = await fetchService();
        console.log(data)
        if (!(data === undefined)) {
            this.setState({artistList: data})
        }
    }
    inputTitle=(event)=>{
        let songform ={...this.state.songData}
        songform.titleSong=event.target.value
        this.setState({songData:{...songform}})
    }
    inputArtist=(event)=>{
        let songform ={...this.state.songData}
        songform.idArtistContainer=event.target.value
        this.setState({songData:{...songform}})
    }
    inputdate=(event)=>{
        let songform ={...this.state.songData}
        songform.releaseDate=event.target.value
        this.setState({songData:{...songform}})
    }
    handleButton=(event)=>{
        SubmitSong(this.state.songData)
    }

}

export default SongForm;
