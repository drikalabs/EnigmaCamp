import React from 'react';
import '../App.css';

class Detail extends React.Component {
    render() {
        const param = this.props.match.params.id
        let data =Object.create(this.props.detail)
        let getProductbyid ={...data.find(data =>data.idProduct == parseInt(param))}
        console.log(this.props.match)
        console.log(data)
        console.log(getProductbyid)
        return (
            <div className="content detil">
                <h1>Detail </h1>
                <table>
                    <tr>
                        <td>Id</td>
                        <td>{getProductbyid.idProduct}</td>
                    </tr>
                    <tr>
                        <td>Product Name</td>
                        <td>{getProductbyid.productName}</td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td>Rp.{getProductbyid.price}</td>
                    </tr>
                    <tr>
                        <td>Quantity</td>
                        <td>{getProductbyid.quantity}</td>
                    </tr>
                    <tr>
                        <td>Store</td>
                        <td>{getProductbyid.toko}</td>
                    </tr>
                </table>
            </div>
        );
    }
}

export default Detail;
