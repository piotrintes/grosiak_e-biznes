import React, {Component} from 'react';

class Promotions extends Component {

    constructor() {
        super();
        this.state = {
            promotions: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/promotions"

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
            let promotions = data.map((prom) => {
                return (
                    <div key={prom.id}>
                        <div className="title">{prom.product}</div>
                        <div>{prom.discount}</div>
                    </div>
                )
            })
            this.setState({promotions: promotions})
        })
    }

    render() {
        return (
            <div className="promotions">
                {this.state.promotions}
            </div>
        )
    }
}

export default Promotions;