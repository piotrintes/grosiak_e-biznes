import React, {Component} from 'react';
import Category from './Category'

class Product extends Component {

    constructor() {
        super();
        this.state = {
            products: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/product/" + this.props.match.params.product

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(prod => {
                let lnkBackToCategory = "/category/" + prod.category;
                let img = "/img/products/" + prod.id + ".png";
                let products =
                    <div key={prod.id}>
                        <Category beforeText="Inne produkty z kategorii " category={prod.category}/>
                        <table>
                            <tr>
                                <td>
                                    <img src={img} width="256" height="256"/>
                                </td>
                                <td>
                                    <div id="productname">{prod.name}</div>
                                    <div id="productprice">Cena: {prod.price} Zł</div>
                                </td>
                            </tr>
                        </table>
                        <div id="productbuttons">
                            <a id="button" href="/addtocart">Dodaj do koszyka</a>
                            <a id="button" href="#opinions">Opinie o produkcie</a>
                        </div>
                        <div>{prod.description}</div>
                    </div>
                this.setState({ products: products });
            });
    }

    render() {
        return (
            <div id="frame">
                {this.state.products}
                <a name="opinions"/>
            </div>
        )
    }
}

export default Product;