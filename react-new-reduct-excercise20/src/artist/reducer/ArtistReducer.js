const initialState={
    datafetching:[]
};
export default function fetchingData(state=initialState,action) {

    switch (action.type) {
        case 'FETCH_DATA':return {...state,datafetching: action.payload};
        default:return state
    }
}