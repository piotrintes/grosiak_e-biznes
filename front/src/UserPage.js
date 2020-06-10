import React, {Component} from 'react';

class UserAvatar extends Component {

    constructor() {
        super();
        this.state = {
            user: [],
        };
    }


    componentDidMount() {
        var url = "http://localhost:9000/user/" + this.props.match.params.user

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
                let lnkImage = "/img/user/" + usr.id + ".png";
                let adminBadge = "";
                if(usr.admin) adminBadge = "[Admin]"
                let user =
                    <div>
                        <a href={lnkUserPage}>
                            <div id="userAvatar">
                                <img id='circle' src={lnkImage} width='48px' height='48px'/>
                                <p>{adminBadge}  {usr.usrName}</p>
                            </div>
                        </a>
                        <table id="fullWidth">
                            <tr>
                                <td>
                                    <h2>
                                        {usr.name} {usr.surname}
                                    </h2>
                                </td>
                                <td id="right">
                                    <h2>
                                        {usr.email}
                                    </h2>
                                </td>
                            </tr>
                        </table>
                    </div>
                this.setState({ user: user });
            });
    }

    render() {
        return (
            <div id="frame">
                {this.state.user}
            </div>
        )
    }
}

export default UserAvatar;