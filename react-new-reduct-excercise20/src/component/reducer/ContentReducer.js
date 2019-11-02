const initialState ={
    content:[],
    dataFetching:[]
}
export default function content_changer(state=initialState,action) {
    console.log(state,action);
    switch (action.type) {
        case 'ADD_CONTENT':return{...state,content: state.content.concat([{artist:'',song:''}])};
        case'CHANGE_ARTIST' :
            return {...state,content:state.content.map((element,index)=>{
                if (index === action.index){
                    return {...element, artist: action.artistName}
                }else {
                    return element
                }
            })}
        case'CHANGE_SONG' :
            return {...state,content:state.content.map((element,index)=>{
                if (index === action.index){
                    return {...element, song: action.titleSong}
                }else {
                    return element
                }
            })}
        default:return state;
    }
}