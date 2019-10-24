import React from 'react';
import '../App.css';

class Navigation extends React.Component{
    render() {
        return (
            <div className="header">
                <nav>
                    <ul>
                        <li>Home</li>
                        <li>option 1</li>
                        <li>option 2</li>
                        <li>option 3</li>
                    </ul>
                </nav>
            </div>
        );
    }
}

export default Navigation;
