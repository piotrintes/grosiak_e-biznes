import React, {Component} from 'react';

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
                        <div><a href={lnkBackToCategory}>back to category {prod.category}</a></div>
                        <div className="title">{prod.name}</div>
                        <div>{prod.description}</div>
                        <div>{prod.price}</div>
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