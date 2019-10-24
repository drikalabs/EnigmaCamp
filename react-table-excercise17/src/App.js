import React from 'react';
import logo from './logo.svg';
import './App.css';
import Navigation from "./navigation/Navigation";
import Header from "./navigation/Header";
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom";
import ProductList from "./product/ProductList";
import ProductForm from "./product/ProductForm";
import Detail from "./product/Detail";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            products: []
        }
    }

    render() {
        let items = []
        for (let i = 0; i < this.state.products.length; i++) {
            items.push(this.state.products[i])
        }
        console.log(this.state.products);

        return (
            <Router>
                <div className="App">
                    {/*<Header/>*/}
                    <header className="App-header">
                        <img src={logo} className="App-logo" alt="logo"/>
                    </header>
                    {/*<Navigation/>*/}
                    <nav className="header">
                        <ul>
                            <h1>Aplication Management</h1>
                            <li><Link to="#">Home</Link></li>
                            <li><Link to="/product-list">Produc List</Link></li>
                            <li><Link to="/product-form">Product Form</Link></li>
                        </ul>
                    </nav>

                    <Switch>
                        <Route path="/product-list"><ProductList prod={this.state.products}/></Route>
                        <Route path="/product-form"><ProductForm action={this.add}/></Route>
                        <Route path="/detail/:id" render={(props) =>
                            <Detail {...props} detail={this.state.products}/>}>
                        </Route>
                    </Switch>
                </div>
            </Router>
        );
    }

    add = (even) => {
        even.preventDefault()

        let newProduct = {...this.state.products}
        newProduct.idProduct = even.target.idProduct.value
        newProduct.productName = even.target.productName.value
        newProduct.price = even.target.price.value
        newProduct.quantity = even.target.quantity.value
        newProduct.toko = even.target.toko.value

        console.log('executed')
        console.log(this.state.products)
        alert('Success input')

        this.setState({products: [...this.state.products, newProduct]})
    }
}

export default App;
