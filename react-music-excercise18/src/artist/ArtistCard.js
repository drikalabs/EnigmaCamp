import React from 'react';
import '../App.css';
import logo from "../logo2.jpg";
import {Link} from "react-router-dom";

class ArtistCard extends React.Component{

    render() {

        return (
            <div className="card">
                <img src={`http://localhost/img/${this.props.data.idArtist}.jpg`} alt="logo" className="atist-logo"/>
                <p>{this.props.data.artistName}</p>
                <p>{this.props.data.bornPlace}</p>
                <p>{this.props.data.gender}</p>
                <Link className="btn-detail">Detail</Link>
            </div>
        );
    }


}

export default ArtistCard;
