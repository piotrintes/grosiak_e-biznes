import React, {Component} from 'react';

class Promotions extends Component {

    constructor() {
        super();
        this.state = {
            products: [],
        };
        this.loadData = this.loadData.bind(this);
    }

    loadData() {
        var url = "http://localhost:9000/products"

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
                var url1 = "http://localhost:9000/promotionpr/" + prod.id
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
                        let link = "/product/" + prod.id;
                        let img = "/img/products/" + prod.id + ".png";
                        let priceDisp = (prod.price).toFixed(2) + " zł"
                        if(pro != null) {
                            priceDisp = [<b>
                                <del>{prod.price} zł</del>
                                <t/>
                                PROMOCJA - {pro.discount}%
                                <t/>
                                {(prod.price * (100 - pro.discount) / 100).toFixed(2)} zł <t/></b>]
                            products.push([
                                <a id="clearunderline" href={link} key={prod.id}>
                                    <div id="framebutton">
                                        <table>
                                            <tr>
                                                <td>
                                                    <img src={img} width="256" height="256"/>
                                                </td>
                                                <td>
                                                    <div id="productname">{prod.name}</div>
                                                    <div id="productprice">Cena: {priceDisp}</div>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </a>
                            ])
                            this.setState({products: products})
                            console.log(prod.name)
                        }
                    })
            })
        })
    }

    componentDidMount() {
        this.loadData()
    }

    render() {
        return (
            <div className="promotions">
                <div id="frame">
                    <h3>
                        <t/><t/>PROMOCJE
                    </h3>
                </div>
                {this.state.products}
            </div>
        )
    }
}

export default Promotions;