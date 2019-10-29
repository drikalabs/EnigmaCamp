import React from 'react';
import '../App.css';
import {Link} from "react-router-dom";
class Navigation extends React.Component{

    render() {

        return (
            <nav className="header">
                    <ul>
                        <h1>Aplication Management</h1>
                        <li><Link to="/artist-container">Artist</Link></li>
                        <li><Link to="/song-container">Songs</Link></li>
                    </ul>
            </nav>
        );
    }
}

export default Navigation;
