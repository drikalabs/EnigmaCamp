import React from 'react'
import {connect} from "react-redux";
import fetchingDatas, {submitData} from "./ArtistService";
import {
    add_form,
    artistName_handler,
    bornPlace_handler,
    debuteDate_handler,
    fetching_success,
    gender_handler
} from "./ConstAction";
import NavBar from "./NavBar";
import ArtistForm from "./ArtistForm";
class ArtistContainer extends React.Component{
    render() {
        console.log(this.props.dataArtist)
        return (
                <div>
                    <NavBar/>
                    <ArtistForm
                        nameHandle={this.handleInputName}
                        bornPlace={this.handleInputbornPlace}
                        debuteDate={this.handleInputDebuteDate}
                        gender={this.handleInputgender}
                        handlebutton={this.handleButton}
                        handleAddSong={this.handdleaddSongs}
                    />
                    {this.props.fetchResult.map((element,index)=>{
                        return <p>{element.artistName}</p>
                    })}
                </div>
        );
    }
    componentDidMount() {
        this.fetchResult()
    }
    fetchResult = async ()=>{
        const result =await fetchingDatas();
        console.log(result);
        this.props.dispatch({...fetching_success,payload:result})
    }
    handleInputName=(event)=>{
        this.props.dispatch({...artistName_handler,payload: event.target.value})
    }
    handleInputbornPlace=(event)=>{
        this.props.dispatch({...bornPlace_handler,payload: event.target.value})
    }
    handleInputDebuteDate=(event)=>{
        this.props.dispatch({...debuteDate_handler,payload: event.target.value})
    }
    handleInputgender=(event)=>{
        this.props.dispatch({...gender_handler,payload: event.target.value})
    }
    handleButton=(event)=>{
        event.preventDefault()
        let data ={...this.props.dataArtist};
        submitData(data)
    }
    handdleaddSongs=(event)=>{
        event.preventDefault()
        this.props.dispatch({...add_form})
    }

}

const toMapstate=(state)=>{
    return{...state}
}
export default connect(toMapstate) (ArtistContainer);