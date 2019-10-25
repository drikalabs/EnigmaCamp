import React from 'react';
import '../App.css';

class ArtistCard extends React.Component{
    constructor(props) {
        super(props);
        this.state ={
            data:[]
        }
    }

    render() {

        return (
            <div className="App">
                <h1>{this.state.data.artistName}</h1>
            </div>
        );
    }
    componentDidMount() {
        if (!(this.props.satuan === undefined)){
            this.setState({data:this.props.satuan})
        }
    }

}

export default ArtistCard;
