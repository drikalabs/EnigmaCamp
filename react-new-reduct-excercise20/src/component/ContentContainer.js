import React from 'react';
import {connect} from "react-redux";
import ContentCardForm from "./ContentCardForm";
import {new_content} from "./ConstAction";
import ContentTable from "./ContentTable";

class ContentContainer extends React.Component {
    render() {
        console.log(this.props)
        return (
            <div>
                <button onClick={() => (this.props.dispatch(new_content))}>Add Content</button>
                <br/>
                {this.props.content.map((element, index) => {
                    return <ContentCardForm element={element} index={index} key={index}/>
                    console.log(element, index)
                })}
                {this.props.content.map((element, index) => {
                    return <ContentTable element={element} index={index} key={index}/>
                    console.log(element, index)
                })}

            </div>
        );
    }
}

const toMapstate = (state) => {
    return {content: state.content}
}

export default connect(toMapstate)(ContentContainer);
