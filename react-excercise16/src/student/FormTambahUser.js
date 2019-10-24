import React from 'react';
import '../App.css';
import Button from '@material-ui/core/Button';
class FormTambahUser extends React.Component{

    render() {
        return (

            <div className="App-card">
                <form onSubmit={this.props.fungsi}>
                    <label>Name</label>
                    <input type="text" name="name" /><br/>
                    <label>Age</label>
                    <input type="text" name="age" /><br/>
                    <Button variant="contained" color="primary" type="submit">Tambah</Button>
                </form>
            </div>


        );
    }
}

export default FormTambahUser;
