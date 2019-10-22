import React from 'react';
import '../App.css';

class StudentForm extends React.Component{
    constructor(props) {
        super(props);
        this.state={
            tulisan:""
        }
    }
    render() {
        return (

            <div className="App-card">
                <form action="">
                    <label htmlFor="">Name</label>
                    <input type="text"  onChange={this.props.children}/>
                </form>
                <h1>{this.state.tulisan}</h1>
            </div>


        );
    }
    inputHandler=(even)=>{
        this.setState({tulisan: even.target.value})
    }
}

export default StudentForm;
