import React from 'react';
import './App.css';
import Card from "./Card";
import Navigation from "./Navigation";

class App extends React.Component{
  constructor(props) {
    super(props);
    this.state={
      people:{ name:"Adrika" ,age:19}
    }
  }


  render() {
    return (
        <div className="App">
          <Navigation/>

          <Card data={this.state.people}/>
          <Card data={this.state.people}/>
          <Card data={this.state.people}/>
          <Card data={this.state.people}/>

        </div>
    );
  }
}

export default App;
