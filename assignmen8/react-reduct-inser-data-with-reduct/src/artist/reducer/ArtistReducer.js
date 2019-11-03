const initialState ={
    dataArtist:{
        artistName:"",
        bornPlace:"",
        gender:"",
        debuteDate:"",
        songList:[]
    },
    fetchResult:[]
}
export default function artist_reducer(state=initialState,action) {
    switch (action.type) {
        case 'FETCHING_SUCCESS':return{...state,fetchResult: action.payload}
        default:return {...state}
    }
}