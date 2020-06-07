import React, {Component} from 'react';
import UserAvatar from "./UserAvatar";

class Opinions extends Component {

    constructor() {
        super();
        this.state = {
            opinions: [],
            exists: false,
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/opinions/" + this.props.product

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
                this.setState({exists: true})
                let starsDisp = "/img/stars/" + op.stars + ".png";
                return (
                    <div key={op.id}>
                        <table id="opinion">
                            <tr>
                                <td width="250px">
                                    <UserAvatar user={op.user}/>
                                </td>
                                <td>
                                    <div id="opinion">{op.text}</div>
                                </td>
                                <td id="right">
                                    <img id="stars" src={starsDisp}/>
                                </td>
                            </tr>
                        </table>
                    </div>
                )
            })
            this.setState({opinions: opinions})
        })
    }

    render() {
        if(this.state.exists)
            return (
                <div id="frame">
                    {this.state.opinions}
                </div>
            )
        else
            return ("");
    }
}

export default Opinions;