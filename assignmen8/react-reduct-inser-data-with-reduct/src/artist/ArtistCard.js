import React from 'react';

class ArtistCard extends React.Component {
    render() {
        return (
            <div className="form-style-9">
                <b>Artist Name:{this.props.element.artistName}</b><br/>
                <b>Born Place :{this.props.element.bornPlace}</b><br/>
                <b>Debute Date:{this.props.element.debuteDate}</b><br/>
                <b>Gender:{this.props.element.gender}</b><br/>
                <p>Songs :{this.props.element.songList.map((element,index)=>{
                    return <div>
                        <ul>
                            <li>
                                <b>Title Song:{element.titleSong}</b><br/>
                                <b>Release Date:{element.releaseDate}</b>
                            </li>
                        </ul>

                    </div>
                })}</p>
            </div>
        );
    }
}

export default ArtistCard;
