import React from 'react';
import '../App.css';
import {Submitdata} from "./ArtistService";

class ArtistForm extends React.Component {

    constructor(props) {
        super(props);
        this.state ={
            artistForm:{}
        }
    }

    render() {
        return (
            <div className="">
                <h1>Ini Form</h1>
                <section className="form">
                    <form>
                        <input type="text" name="artistName" placeholder="Artist Name" onChange={this.inputName}/>

                        <input type="text"  name="bornPlace" placeholder="Born Place" onChange={this.inputbornplace}/>

                        <select name="gender" id="" onChange={this.inputgender}>
                            <option value="">Select Gender</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select><br/>
                        <input type="file" disabled/><br/>

                        <input type="text" name="date" placeholder="yyyy-MM-dd" onChange={this.inputdate}/><br/>
                        <button type="submit" className="btn" onClick={this.handleButton}>Submit</button>
                    </form>
                </section>
                <hr/>
            </div>
        );
    }
    inputName=(event)=>{
        let artistform ={...this.state.artistForm}
        artistform.artistName=event.target.value
        this.setState({artistForm:{...artistform}})
    }
    inputbornplace=(event)=>{
        let artistform ={...this.state.artistForm}
        artistform.bornPlace=event.target.value
        this.setState({artistForm:{...artistform}})
    }
    inputgender=(event)=>{
        let artistform ={...this.state.artistForm}
        artistform.gender=event.target.value
        this.setState({artistForm:{...artistform}})
    }
    inputdate=(event)=>{
        let artistform ={...this.state.artistForm}
        artistform.debuteDate=event.target.value
        this.setState({artistForm:{...artistform}})
    }
    handleButton=(event)=>{
        event.preventDefault()
        Submitdata(this.state.artistForm)
    }
}

export default ArtistForm;
