import React, {Component} from 'react';

class Transactions extends Component {

    constructor() {
        super();
        this.state = {
            transactions: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/transactions"

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
            let transactions = data.map((trs) => {
                return (
                    <div key={trs.id}>
                        <div className="title">{trs.id}</div>
                        <div>{trs.user}</div>
                        <div>{trs.product}</div>
                        <div>{trs.count}</div>
                        <div>{trs.price}</div>
                        <div>{trs.date}</div>
                    </div>
                )
            })
            this.setState({transactions: transactions})
        })
    }

    render() {
        return (
            <div className="transactions">
                {this.state.transactions}
            </div>
        )
    }
}

export default Transactions;