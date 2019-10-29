import React from 'react';
import '../App.css';
import SongForm from "./SongForm";

class SongContainer extends React.Component{

    render() {

        return (
            <div className="content">
               <SongForm/>
            </div>
        );
    }
}

export default SongContainer;
