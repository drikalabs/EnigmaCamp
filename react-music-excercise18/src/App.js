import React from 'react';
import logo from './logo.svg';
import './App.css';
import ArtistContainer from "./artist/ArtistContainer";

class App extends React.Component{

  constructor(props) {
    super(props);
    this.state ={
      tulisan:"",
        out:"",
        artist:[]
    }
  }

  render() {

    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo"/>
            <p>
              Edit <code>src/App.js</code> and save to reload.
            </p>
            <a
                className="App-link"
                href="https://reactjs.org"
                target="_blank"
                rel="noopener noreferrer"
            >
              Learn React
            </a>
          </header>
          <input type="text" value={this.state.tulisan} onChange={this.handler}/>
          <button onClick={this.setter}>click</button>
            <label >{this.state.out}</label>
            <ArtistContainer/>
        </div>
    );
  }
  handler=(event)=>{
      this.setState({tulisan : event.target.value})
  }
  setter=()=>{
      this.setState({out:this.state.tulisan})
  }
}

export default App;
