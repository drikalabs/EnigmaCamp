import React from 'react';
import { connect } from 'react-redux';
import {add_counter} from "./Const_Action";
const AddButton = ({dispatch}) => (
    <button
        onClick={() => {dispatch(add_counter());}}>
        Add a counter
    </button>
);
export default connect() (AddButton);