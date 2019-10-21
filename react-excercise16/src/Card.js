import React from 'react';
import './App.css';

class Card extends React.Component{
    render() {
        return (

                <div className="App-card">
                    <h4>{this.props.data.name}</h4>
                    <p>{this.props.data.age}</p>
                </div>


        );
    }
}

export default Card;
