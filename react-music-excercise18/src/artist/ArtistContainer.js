import React from 'react';
import '../App.css';
import ArtistCard from "./ArtistCard";
import {fetchService} from "./ArtistService";

class ArtistContainer extends React.Component{

    constructor(props) {
        super(props);
        this.state ={
            artist:[]
        }
    }
    render() {

        return (
            <div className="App">
                {this.state.artist.map( artist =>{
                    return<h1>{artist.artistName}</h1>
                })}
            </div>
        );
    }
    componentDidMount() {
        this.fetcingartist()
    }
    fetcingartist= async ()=>{
        const data = await fetchService();
        console.log(data)
        if (!(data === undefined)){
            this.setState({artist:data})
        }
    }
}

export default ArtistContainer;
