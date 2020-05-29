import React, {Component} from 'react';

class Products extends Component {

    constructor() {
        super();
        this.state = {
            products: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/products/" + this.props.match.params.cat

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
            let products = data.map((prod) => {
                let link = "/product/" + prod.id;
                let img = "/img/products/" + prod.id + ".png";
                return (
                    <a id="clearunderline" href={link}>
                        <div id="framebutton" key={prod.id}>
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
                        </div>
                    </a>
                )
            })
            this.setState({products: products})
        })
    }

    render() {
        return (
            <div className="products">
                {this.state.products}
            </div>
        )
    }
}

export default Products;