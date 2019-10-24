import React from 'react';
import '../App.css';
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom";
import ProductForm from "./ProductForm";
import Detail from "./Detail";

class ProductList extends React.Component {
    render() {
        let data = []

        for (let i = 0; i < this.props.prod.length; i++) {
            data.push(
                <tr>
                    <td>{[i+1]}</td>
                    <td>{this.props.prod[i].productName}</td>
                    <td>Rp.{this.props.prod[i].price}</td>
                    <td>{this.props.prod[i].quantity}</td>
                    <td>{this.props.prod[i].toko}</td>
                    <td><Link className="btn-detail" to={"/detail/"+this.props.prod[i].idProduct}>Detail</Link>
                    </td>


                </tr>
            )
        }
        console.log(this.props.prod)
        return (
            <div className="content">
                <h1>Ini List</h1>
                <table>
                    <tr>
                        <th>No.</th>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Store</th>
                        <th>Action</th>
                    </tr>
                    {data}

                </table>

            </div>
        );
    }


}


export default ProductList;
