import React, {Component} from 'react';
import CartItem from './CartItem'

class Cart extends Component {

    constructor() {
        super();
        this.state = {
            cart: [],
            cartObject: [],
            cartPrice: 0,
            confirmFrame: "",
        };
        this.displayConfirmation = this.displayConfirmation.bind(this);
        this.clearCart = this.clearCart.bind(this);
        this.buyCart = this.buyCart.bind(this);
    }

    displayConfirmation() {
        var frame =
            <div>
                <div id="darken" className="darkbcg"/>
                    <div id="framefloating" className="loginFrame">
                        <h1>Przetwarzanie transakcji</h1>
                    </div>
                </div>
        this.setState({ confirmFrame: frame });
    }

    clearCart() {
        for (var i = 0; i < this.state.cartObject.length; i++) {
            var url = "http://localhost:9000/deletefromcart/" + this.state.cartObject[i].id
            console.log(url)
            fetch(url, {
                mode: 'cors',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json',
                    'Access-Control-Allow-Origin': 'http://localhost:3000',
                },
                method: 'GET',
            })
        }
        window.location.reload(false);
    }

    buyCart() {
        this.displayConfirmation()
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
        var yyyy = today.getFullYear();

        var today = mm + '/' + dd + '/' + yyyy

        for(var i=0;i<this.state.cartObject.length;i++) {
            //create transaction from cart item
            fetch('http://localhost:9000/addtransactionhandle', {
                method: 'POST',
                body: JSON.stringify({ "user":this.state.cartObject[i].user,
                    "product":this.state.cartObject[i].product,
                    "count":this.state.cartObject[i].count,
                    "price":this.state.cartObject[i].price,
                    "date":today
                }),
                headers: {
                    'Content-type': 'application/json; charset=UTF-8'
                }
            }).then(results => {
                return results.json();
            }).then(data => {
                console.log(data.id)
                //create payment (should be when bank confirms payment is on shop's account
                fetch('http://localhost:9000/addpaymenthandle', {
                    method: 'POST',
                    body: JSON.stringify({
                        "transaction": data.id,
                        "date": today
                    }),
                    headers: {
                        'Content-type': 'application/json; charset=UTF-8'
                    }
                })
            })

            //remove item from cart
            var url = "http://localhost:9000/deletefromcart/" + this.state.cartObject[i].id
            fetch(url, {
                mode: 'cors',
                headers:{
                    'Accept': 'application/json',
                    'Content-Type': 'application/json',
                    'Access-Control-Allow-Origin':'http://localhost:3000',
                },
                method: 'GET',
            })
        }
        setTimeout(() => {
            window.location.reload(false);
        }, 1000)
    }

    componentDidMount() {
        let url = "http://localhost:9000/cart"
        var cartObjectList = []
        fetch(url, {credentials:"include"})
            .then(results => {
                return results.json();
            }).then(data => {
            let cart = data.map((cart) => {
                var url2 = "http://localhost:9000/product/" + cart.product
                fetch(url2, {
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
                    }).then(product => {
                        var url1 = "http://localhost:9000/promotionpr/" + cart.product
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
                                var cartObject = cart
                                if (pro != null) {
                                    this.setState({cartPrice: this.state.cartPrice + product.price * (100 - pro.discount) / 100 * cart.count})
                                    cartObject.price = product.price * (100 - pro.discount) / 100 * cart.count
                                } else {
                                    this.setState({cartPrice: this.state.cartPrice + product.price * cart.count})
                                    cartObject.price = product.price
                                }
                                cartObjectList.push(cartObject)
                            })
                    return 0
                })

                this.setState({cartObject: cartObjectList})
                console.log(this.state.cartObject)
                return (
                    <div key={cart.id}>
                        <CartItem id={cart.id} product={cart.product} number={cart.count}/>
                    </div>
                )
            })
            this.setState({cart: cart})
        })
    }

    render() {
        if(this.state.cart.length > 0)
            return (
                <div className="cart">
                    {this.state.confirmFrame}
                    <div id="frame">
                        <table id="fullWidth">
                            <tr>
                                <td id="left">
                                    <h3>
                                        <t/><t/><t/>Łączna kwota: {(this.state.cartPrice).toFixed(2)} zł
                                    </h3>
                                </td>
                                <td id="right">
                                    <a id="button" href="#" onClick={this.clearCart}>Wyczyść koszyk</a>
                                    <t/><t/><t/>
                                    <a id="button" href="#" onClick={this.buyCart}>Kupuję</a>
                                </td>
                            </tr>
                        </table>
                    </div>
                    {this.state.cart}
                </div>
            )
        else
            return(
                <div className="cart">
                    <div id="frame">
                        <h3>
                            <t/><t/><t/>Koszyk jest pusty
                        </h3>
                    </div>
                </div>
            )
    }
}

export default Cart;