import React, {Component} from 'react';

class CartItem extends Component {

    constructor() {
        super();
        this.state = {
            cartItem: [],
            discount: [],
        };
        this.removeItem = this.removeItem.bind(this);
    }

    removeItem() {
        var url = "http://localhost:9000/deletefromcart/" + this.props.id
        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        })
        window.location.reload(false);
    }

    componentDidMount() {
        var url1 = "http://localhost:9000/promotionpr/" + this.props.product
        fetch(url1, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(pro => {
                if(pro != null)
                    this.setState({ discount: pro.discount });
                //console.log("test1  " + this.state.discount)

                var url = "http://localhost:9000/product/" + this.props.product

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(product => {
                let lnkBackToProduct = "/product/" + product.id
                let cartItem =
                    <div>
                        <table id="fullWidth">
                            <tr>
                                <td>
                                    <h3>
                                        <a id="linkh2" href={lnkBackToProduct}>{product.name}</a>
                                        {(product.price * (100 - this.state.discount) / 100).toFixed(2)} zł, <t/>
                                        sztuk: {this.props.number}, <t/>
                                        razem: {(this.props.number * product.price * (100 - this.state.discount) / 100).toFixed(2)} zł
                                    </h3>
                                </td>
                                <td id="right">
                                    <a id="button" href="#" onClick={this.removeItem}>Usuń z koszyka</a>
                                </td>
                            </tr>
                        </table>
                    </div>
                this.setState({ cartItem: cartItem });
            });
            });
    }

    render() {
        return (
            <div id="frame" className="cartItem">
                {this.state.cartItem}
            </div>
        )
    }
}

export default CartItem;