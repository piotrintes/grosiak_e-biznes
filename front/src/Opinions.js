import React, {Component} from 'react';
import UserAvatar from "./UserAvatar";

class Opinions extends Component {

    constructor() {
        super();
        this.state = {
            opinions: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/opinions/" + this.props.match.params.product

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
            let opinions = data.map((op) => {
                let starsDisp = "°°°°°";
                if (op.stars == 1) starsDisp = "*°°°°";
                if (op.stars == 2) starsDisp = "**°°°";
                if (op.stars == 3) starsDisp = "***°°";
                if (op.stars == 4) starsDisp = "****°";
                if (op.stars == 5) starsDisp = "*****";
                return (
                    <div key={op.id}>
                        <UserAvatar user={op.user}/>
                        <div>{starsDisp}</div>
                        <div>{op.text}</div>
                    </div>
                )
            })
            this.setState({opinions: opinions})
        })
    }

    render() {
        return (
            <div className="opinions">
                {this.state.opinions}
            </div>
        )
    }
}

export default Opinions;