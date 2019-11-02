import React from 'react';
import {connect} from "react-redux";

import fetchingDatas from "./ArtistService";
import {fetching} from "./ArtistAction";

class ArtistContainer extends React.Component {
    render() {
        console.log(this.props.datafetching,"ini fetch")
        return (
              <div>
                  {this.props.datafetching.map((element,index)=>{
                      return <h1>{element.artistName}</h1>
                  })}
              </div>

        );
    }

    componentDidMount() {
        this.dataResult()
    }
    dataResult= async ()=>{
        const data =await fetchingDatas();
        console.log(data)
        this.props.dispatch({...fetching,payload:data})
    }

}

const mapState=(state)=>{
    return  {...state}
}
export default connect(mapState) (ArtistContainer);
