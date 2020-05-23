import React, {Component} from 'react';

class Cart extends Component {

    constructor() {
        super();
        this.state = {
            cart: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/cart/" + this.props.match.params.user

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        })
            .then(results => {
                return results.json();
            }).then(data => {
            let cart = data.map((cart) => {
                return (
                    <div key={cart.id}>
                        <div className="name">{cart.user}</div>
                        <div>{cart.product}</div>
                        <div>{cart.count}</div>
                    </div>
                )
            })
            this.setState({cart: cart})
        })
    }

    render() {
        return (
            <div className="cart">
                {this.state.cart}
            </div>
        )
    }
}

export default Cart;