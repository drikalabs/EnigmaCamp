import React from 'react';
import '../App.css';
import {Link} from "react-router-dom";

class ProductList extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            products: []
        }
    }


    render() {
        return (
            <div className="content">
                <h1>Ini List</h1>
                <Link className="btn-detail" to="/product-form" >Tambah Data</Link>
                <table>
                    <tr>
                        <th>Product Id</th>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Store</th>
                        <th>Action</th>
                    </tr>
                    {this.state.products.map(isi=>{
                        return(
                            <tr>
                                <td>{isi.idProduct}</td>
                                <td>{isi.productName}</td>
                                <td>Rp.{isi.price}</td>
                                <td>{isi.quantity}</td>
                                <td>{isi.toko}</td>
                                <td><Link className="btn-detail" to={"/detail/"+isi.idProduct}>Detail</Link>
                                </td>
                            </tr>
                        )

                    })}


                </table>

            </div>
        );
    }
componentDidMount() {
        if (!(this.props.prod===undefined)){
            this.setState({products:this.props.prod})
        }
}

}


export default ProductList;
