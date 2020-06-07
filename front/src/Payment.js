import React, {Component} from 'react';
import Category from './Category'
import Opinions from './Opinions'

class Payment extends Component {

    constructor() {
        super();
        this.state = {
            payment: "N/A",
        };
    }
    componentDidMount() {
        var url = "http://localhost:9000/paymentbyt/" + this.props.transaction

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(pay => {
                if(pay != null)
                    this.setState({ payment: pay.date });
            });
    }

    render() {
        return this.state.payment
    }
}

export default Payment;