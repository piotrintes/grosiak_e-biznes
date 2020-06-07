import React, {Component} from 'react';
import Category from './Category'
import Opinions from './Opinions'

class Delivery extends Component {

    constructor() {
        super();
        this.state = {
            delivery: "N/A",
        };
    }
    componentDidMount() {
        var url = "http://localhost:9000/deliverybyt/" + this.props.transaction

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(del => {
                if(del != null)
                    this.setState({ delivery: del.date });
            });
    }

    render() {
        return this.state.delivery
    }
}

export default Delivery;