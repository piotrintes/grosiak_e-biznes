import React, {Component} from 'react';

class UserAvatar extends Component {

    constructor() {
        super();
        this.state = {
            user: [],
        };
    }

    componentDidMount() {
        var url = "http://localhost:9000/user/" + this.props.user

        fetch(url, {
            mode: 'cors',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin':'http://localhost:3000',
            },
            method: 'GET',
        }).then(response => response.json())
            .then(usr => {
                console.log(usr);
                let lnkUserPage = "/user/" + usr.id;
                let adminBadge = "";
                if(usr.admin) adminBadge = "[Admin]"
                let user =
                    <a href={lnkUserPage}>{adminBadge}  {usr.usrName}</a>
                this.setState({ user: user });
            });
    }

    render() {
        return (
            <div className="user">
                {this.state.user}
            </div>
        )
    }
}

export default UserAvatar;