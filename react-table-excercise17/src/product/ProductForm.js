import React from 'react';
import '../App.css';

class ProductForm extends React.Component {
    render() {
        return (
            <div className="content">
                <h1>Ini Form</h1>
                <div className="form">
                    <form onSubmit={this.props.action}>
                        <input type="text" name="idProduct" placeholder="Product ID"/>

                        <input type="text" name="productName" placeholder="Product Name"/>

                        <input type="text"  name="price" placeholder="Price"/>

                        <input type="text"  name="quantity" placeholder="Quantity"/>

                        <input type="text" name="toko" placeholder="Store Name"/><br/>
                        <button type="submit" className="btn">Submit</button>
                    </form>
                </div>
            </div>
        );
    }
}

export default ProductForm;
