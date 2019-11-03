//import {createStore} from "redux";
//===================================================================================================
/*function counter(state=0, aksi) {
    switch (aksi.type) {
        case'INCREMENT' :return state +1;
        case'DECREMENT' :return state -1;
        default:return state;
    }
}
let store = createStore(counter)
store.subscribe(()=>{console.log(store.getState())})

store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'NULLELEMENT'});
store.dispatch({type:'DECREMENT'});*/
//================================================================================================================
/*function counter(state=[], aksi) {
    switch (aksi.type) {
        case'ADD_NEW_ELEMENT' :return state.concat([0]);
        case'INCREMENT' :return state.map((element,index)=>{
            if (index == aksi.index){
                return element+1
            }else {
                return element
            }
        })
        case'DECREMENT' :return state.map((element,index)=>{
            if (index == aksi.index){
                return element-1
            }else {
                return element
            }
        })
        default:return state;
    }
}
let store = createStore(counter)
store.subscribe(()=>{console.log(store.getState())})

store.dispatch({type:'ADD_NEW_ELEMENT'});
store.dispatch({type:'ADD_NEW_ELEMENT'});
store.dispatch({type:'ADD_NEW_ELEMENT'});
store.dispatch({type:'INCREMENT',index:1});
store.dispatch({type:'INCREMENT',index:1});
store.dispatch({type:'DECREMENT',index:1});
store.dispatch({type:'DECREMENT',index:1});
store.dispatch({type:'INCREMENT',index:2});
store.dispatch({type:'INCREMENT',index:0});*/
//============================================================================================================
// function counter(state=[{name:"",age:null}], aksi) {
//     switch (aksi.type) {
//         case'ADD_NEW_ELEMENT' :return state.concat([{name:"",age:null}]);
//         case'INCREMENT' :return state.map((element,index)=>{
//             if (index == aksi.index){
//                  return state =  {name: element.name +aksi.name, age:aksi.age}
//             }else {
//                 return element
//             }
//         })
//         case'DECREMENT' :return state.map((element,index)=>{
//             if (index == aksi.index){
//                 return element.pop
//             }else {
//                 return element
//             }
//         })
//         default:return state;
//     }
// }
// let store = createStore(counter)
// store.subscribe(()=>{console.log(store.getState())})
//
// store.dispatch({type:'ADD_NEW_ELEMENT'});
// store.dispatch({type:'ADD_NEW_ELEMENT'});
// store.dispatch({type:'ADD_NEW_ELEMENT'});
//
// store.dispatch({type:'INCREMENT', index:0, name:"gfdhgj"});
// store.dispatch({type:'INCREMENT', index:1, name:"rdfchg"});
// store.dispatch({type:'INCREMENT', index:2, name:"rsyfghj",age:null});
// store.dispatch({type:'DECREMENT', index:3});

const {createStore} =require ('redux');
const initialData={
    number:0,
    person:{name:"",age:0}
}
function counter(state=initialData, aksi) {
    switch (aksi.type) {
        case'INCREMENT' :return  {...state ,number: state.number+1}
        case'DECREMENT' :return  {...state ,number: state.number-1}
        case'CHANGE_NAME' :return {...state,person: {...state.person,name: aksi.newName}}
        default:return state;
    }
}
let store = createStore(counter)
store.subscribe(()=>{console.log(store.getState())})



store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'INCREMENT'});
store.dispatch({type:'DECREMENT'});
store.dispatch({type:'CHANGE_NAME',newName:"Drika"});