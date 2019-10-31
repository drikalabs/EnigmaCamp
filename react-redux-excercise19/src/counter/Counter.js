import React, { Component } from 'react';
class Counter extends Component {
    render() {
        return (
            <div className="card">
                <h1>{this.props.value}</h1>
                <button onClick={() => this.props.onIncrement()}>+</button>
                <button onClick={() => this.props.onDecrement()}>-</button>
            </div>
        );
    }
}
export default Counter;