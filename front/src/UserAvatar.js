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
                let lnkUserPage = "/user/" + usr.id;
                let lnkImage = "/img/user/" + usr.id + ".png";
                let adminBadge = "";
                if(usr.admin) adminBadge = "[Admin]"
                let user =
                    <a href={lnkUserPage}>
                        <div id="userAvatar">
                                <img id='circle' src={lnkImage} width='48px' height='48px'/>
                                <p>{adminBadge}  {usr.usrName}</p>
                        </div>
                    </a>
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