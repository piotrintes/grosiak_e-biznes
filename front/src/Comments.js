import React, {Component} from 'react';

class Comments extends Component {

    constructor() {
        super();
        this.state = {
            comments: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/comments"

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
            let comments = data.map((com) => {
                return (
                    <div key={com.id}>
                        <div className="title">{com.user}</div>
                        <div>{com.stars}</div>
                        <div>{com.text}</div>
                    </div>
                )
            })
            this.setState({comments: comments})
        })
    }

    render() {
        return (
            <div className="comments">
                {this.state.comments}
            </div>
        )
    }
}

export default Comments;