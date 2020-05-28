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
                return (
                    <div key={prod.id}>
                        <div className="title"><a href={link}>{prod.name}</a></div>
                        <div>{prod.price}</div>
                    </div>
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