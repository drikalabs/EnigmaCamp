import React from 'react';
import '../App.css';
import SongForm from "./SongForm";
import {getSongsData} from "./SongsService";
import {fetchService} from "../artist/ArtistService";
import SongCard from "./SongCard";

class SongContainer extends React.Component{


    constructor(props) {
        super(props);
        this.state={
            songData:[]
        }
    }

    render() {

        return (
            <div className="content">
               <SongForm/>
                {this.state.songData.map(isi=>{
                    return(<SongCard data={isi}/>)
                })}
            </div>
        );
    }
componentDidMount() {
        this.fetchSongs()
}

    fetchSongs=async ()=>{
        const data =await getSongsData();
        console.log(data)
     if (!(data === undefined)) {
         this.setState({songData: data})
     }
 }
}

export default SongContainer;
