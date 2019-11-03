import React from 'react'
import {connect} from "react-redux";
class ArtistContainer extends React.Component{
    render() {
        console.log(this.props)
        return (
            <div>
                <h1>this is artist container</h1>
            </div>
        );
    }

}
export default connect() (ArtistContainer);