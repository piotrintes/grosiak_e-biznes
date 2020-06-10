import React, {Component} from 'react';
import Category from "./Category";

class TopBar extends Component {

    constructor() {
        super();
        this.state = {
            loginFrame: "",
            loggedIn: "",
        };

        this.showLogin = this.showLogin.bind(this);
        this.showRegister = this.showRegister.bind(this);
        this.hideLogin = this.hideLogin.bind(this);
    }

    logOut() {
        fetch("http://localhost:9000/signOut", {credentials:"include"})
    }

    componentDidMount() {
        fetch("http://localhost:9000/isLogged", {credentials:"include"})
            .then(res => res.json())
            .then(
                (result) => {
                    var userLink = "/user/" + result.id
                    this.setState({loggedIn:[
                            <a href="/cart"><img id="circlebutton" src="/img/buttons/cart.png" width='38px' height='38px'/></a>,
                            <a href={userLink}><img id="circlebutton" src="/img/buttons/user.png" width='40px' height='38px'/></a>,
                            <a id="button" href="/" onClick={this.logOut}>Wyloguj</a>]})

                },
                (error) => {
                    this.setState({loggedIn:[<a id="button" href="http://localhost:9000/authenticate/google">Zaloguj się</a>]})
                }
            )
    }

    hideLogin() {
        document.getElementsByClassName("loginFrame")[0].setAttribute("id","framefloating-fadeout");
        document.getElementsByClassName("darkbcg")[0].setAttribute("id","darken-fadeout");

        setTimeout(() => {
            this.setState({loginFrame: ""});
        }, 500)
    }


    showLogin() {
        let login =
            <div>
            <div id="darken" className="darkbcg"/>
                <div id="framefloating" className="loginFrame">
                    <h1>Zaloguj się</h1>
                    <h2>Login:</h2>
                    <table>
                        <tr>
                            <td id="left">
                                <a id="button" href="#" onClick={this.showRegister}>Zarejestruj się</a>
                            </td>
                            <td id="right">
                                <a id="button" href="#" onClick={this.showLogin}>Zaloguj się</a>
                                <a id="button" href="#" onClick={this.hideLogin}>Anuluj</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        this.setState({ loginFrame: login });
    }

    showRegister() {
        let login =
            <div>
                <div id="darken" className="darkbcg"/>
                <div id="framefloating" className="loginFrame">
                    <div>
                    <h1>Zarejestruj się</h1>
                    <h2>Login:</h2>
                    <h2>Imię:</h2>
                    <h2>Nazwisko:</h2>
                    <h2>Adres e-mail:</h2>
                    <table>
                        <tr>
                            <td id="left">
                                <a id="button" href="#" onClick={this.showLogin}>Zaloguj się</a>
                            </td>
                            <td id="right">
                                <a id="button" href="#" onClick={this.showLogin}>Zarejestruj się</a>
                                <a id="button" href="#" onClick={this.hideLogin}>Anuluj</a>
                            </td>
                        </tr>
                    </table>
                    </div>
                </div>
            </div>
        this.setState({ loginFrame: login });
    }

    render() {
        return (
            <div id="topBar">
                {this.state.loginFrame}
                <table>
                    <tr>
                        <td id="left">
                        </td>
                        <td id="right">
                            <a href="/"><img id="circlebutton" src="/img/buttons/home.png" width='38px' height='38px'/></a>
                            {this.state.loggedIn}
                        </td>
                    </tr>
                </table>
            </div>
        )
    }
}

export default TopBar;