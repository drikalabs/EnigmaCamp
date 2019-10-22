import React from 'react';
import '../App.css';

class FormTambahUser extends React.Component{

    render() {
        return (

            <div className="App-card">
                <form onSubmit={this.props.fungsi}>
                    <label>Name</label>
                    <input type="text" name="name" /><br/>
                    <label>Age</label>
                    <input type="text" name="age" /><br/>
                    <button type="submit"> tambah</button>
                </form>
            </div>


        );
    }
}

export default FormTambahUser;
