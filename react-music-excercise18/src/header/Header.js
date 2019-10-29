import React from 'react';
import '../App.css';
import logo from "../logo3.png";

class Header extends React.Component{

    render() {

        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                </header>
            </div>
        );
    }
}

export default Header;
