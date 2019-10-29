import React from 'react';
import '../App.css';
import logo from "../logo2.jpg";
class SongCard extends React.Component{

    render() {

        return (
            <div className="card">
                <img src={logo} alt="logo" className="atist-logo"/>
                <p>Title:{this.props.data.titleSong}</p>
                <p>Release Date:{this.props.data.releaseDate}</p>
            </div>
        );
    }


}

export default SongCard;
