import React from 'react';
import '../App.css';
import {Submitdata, submitWithImage} from "./ArtistService";

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
                    <form onSubmit={this.submitData}>
                        <input type="text" name="artistName" placeholder="Artist Name"/>

                        <input type="text"  name="bornPlace" placeholder="Born Place"/>

                        <select name="gender" id="" onChange={this.inputgender}>
                            <option value="">Select Gender</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select><br/>
                        <input type="file" name="file"/><br/>

                        <input type="text" name="date" placeholder="yyyy-MM-dd"/><br/>
                        <button type="submit" className="btn">Submit</button>
                    </form>
                </section>
                <hr/>
            </div>
        );
    }
    submitData=(event)=>{
        let data =this.state.artistForm
        let file= event.target.file.files[0]
        data.artistName= event.target.artistName.value
        data.bornPlace= event.target.bornPlace.value
        data.gender= event.target.gender.value
        data.debuteDate= event.target.date.value
        this.setState({artistForm:data})
        console.log(this.state.artistForm)
        submitWithImage(JSON.stringify(this.state.artistForm),file)
    }

    // inputName=(event)=>{
    //     let artistform ={...this.state.artistForm}
    //     artistform.artistName=event.target.value
    //     this.setState({artistForm:{...artistform}})
    // }
    // inputbornplace=(event)=>{
    //     let artistform ={...this.state.artistForm}
    //     artistform.bornPlace=event.target.value
    //     this.setState({artistForm:{...artistform}})
    // }
    // inputgender=(event)=>{
    //     let artistform ={...this.state.artistForm}
    //     artistform.gender=event.target.value
    //     this.setState({artistForm:{...artistform}})
    // }
    // inputdate=(event)=>{
    //     let artistform ={...this.state.artistForm}
    //     artistform.debuteDate=event.target.value
    //     this.setState({artistForm:{...artistform}})
    // }
    // handleButton=(event)=>{
    //     event.preventDefault()
    //     Submitdata(this.state.artistForm)
    // }
}

export default ArtistForm;
