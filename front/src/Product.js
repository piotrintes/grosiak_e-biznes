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
                console.log(prod);
                let lnkBackToCategory = "/category/" + prod.category;
                let products =
                    <div key={prod.id}>
                        <Category beforeText="Inne produkty z kategorii " category={prod.category}/>
                        <div className="title">{prod.name}</div>
                        <div>{prod.price}</div>
                        <div>{prod.description}</div>
                    </div>
                this.setState({ products: products });
            });
    }

    render() {
        return (
            <div className="products">
                {this.state.products}
            </div>
        )
    }
}

export default Product;