const intialState={
    number:[]
}
export default function counter(state=intialState, action) {
    console.log(state,action);
    switch (action.type) {
        case'ADD_NEW_ELEMENT' :return {...state, number:state.number.concat([0])}
        case'INCREMENT' :return {...state,number:state.number.map((element,index)=>{
            if (index === action.index){
                return element+1
            }else {
                return element
            }
        })}
        case'DECREMENT' :return {...state,number:state.number.map((element,index)=>{
            if (index === action.index){
                return element-1
            }else {
                return element
            }
        })}
        default:return state;
    }
}
