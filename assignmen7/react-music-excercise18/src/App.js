import React from 'react';
import './App.css';
import ArtistContainer from "./artist/ArtistContainer";
import Header from "./header/Header";
import Navigation from "./header/Navigation";
import {BrowserRouter as Router, Switch, Route} from "react-router-dom";
import SongContainer from "./song/SongContainer";

class App extends React.Component{

  render() {

    return (
        <Router>
            <div className="App">
                <Header/>
                <Navigation/>
                <Switch>
                    <Route path="/artist-container"><ArtistContainer/></Route>
                    <Route path="/song-container"><SongContainer/></Route>
                </Switch>
            </div>
        </Router>
    );
  }
}

export default App;
