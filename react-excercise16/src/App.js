import React from 'react';
import './App.css';
import Card from "./Card";
import Navigation from "./Navigation";

import FormTambahUser from "./student/FormTambahUser";

class App extends React.Component{
  constructor(props) {
    super(props);
    this.state={
         peoples:[]
    }
  }


  render() {
      let items=[]
      for(let i=0;i<this.state.peoples.length;i++){
          items.push(<Card data={this.state.peoples[i]}/>)
      }
    return (
        <div className="App">
          <Navigation/>
            {items}
          {/*<Card data={this.state.peoples}/><br/>*/}
          {/*<button onClick={this.ubah}> change</button>*/}{/*<StudentForm children={this.ubahname}/><br/>*/}

            <FormTambahUser fungsi={this.add}/>


        </div>
    );

  }
  //form
    add=(even)=>{
        even.preventDefault()

        let newData ={...this.state.peoples}
        newData.name = even.target.name.value
        newData.age = even.target.age.value
        console.log('executed')

        this.setState({peoples:[...this.state.peoples,newData]})
    }




    // mengubah nilai pada state
  ubah=()=>{
      let newPeople={...this.state.people}
      newPeople.name="tony"
      newPeople.age=22
      this.setState({people:{...newPeople}})
  }
  //mengubah nilai pada state menggunakan component
    ubahname=(event)=>{
        let newPeople = {...this.state.people}
        newPeople.name=event.target.value
        this.setState({people:{...newPeople}})
    }
}

export default App;
