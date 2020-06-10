import React, {Component} from 'react';
import ProductName from './ProductName'
import Payment from './Payment'
import Delivery from './Delivery'

class Transactions extends Component {

    constructor() {
        super();
        this.state = {
            transactions: [],
            addframe: "",
        };
        this.showAdd = this.showAdd.bind(this);
        this.hideAdd = this.hideAdd.bind(this);
    }

    sentOpinion(id) {
        fetch('http://localhost:9000/addopinionhandle', {
            method: 'POST',
            body: JSON.stringify({
                "product":id,
                "stars":parseInt(document.getElementsByName("stars")[0].value),
                "text":document.getElementsByName("text")[0].value
            }),
            headers: {
                'Content-type': 'application/json; charset=UTF-8'
            },
            credentials:"include"
        })
            .then(res => res.json())
            .then(console.log)
        window.location.reload(false);
    }

    updateStars() {
        var stars = document.getElementsByName("stars")[0].value
        document.getElementsByName('starsDisplayer')[0].setAttribute("src","/img/stars/" + stars + ".png")
    }

    hideAdd() {
        document.getElementsByClassName("addframe")[0].setAttribute("id","framefloating-fadeout");
        document.getElementsByClassName("darkbcg")[0].setAttribute("id","darken-fadeout");

        setTimeout(() => {
            this.setState({addframe: ""});
        }, 500)
    }


    showAdd(id) {
        let frame =
            <div>
                <div id="darken" className="darkbcg"/>
                <div id="framefloating" className="addframe">
                    <h1>Dodaj opinię o produkcie</h1>
                    <h2>
                        <ProductName product={id}/>
                    </h2>
                    <h3>
                        Ocena:
                        <input type="number" id="textbox" name="stars" min="0" max="5" defaultValue="5" onChange={this.updateStars}/>
                        <img name="starsDisplayer" id="stars" src="/img/stars/5.png"/>
                    </h3>
                    <h3>
                        Twoja opinia:
                    </h3>
                    <textarea id="fullWidth" name="text"/>
                    <div id="right">
                        <a id="button" href="#" onClick={() => this.sentOpinion(id)}>Dodaj opinię</a>
                        <a id="button" href="#" onClick={this.hideAdd}>Anuluj</a>
                    </div>
                </div>
            </div>
        this.setState({ addframe: frame });
    }

    componentDidMount() {
        var url = "http://localhost:9000/transactionsusr/" + this.props.match.params.user

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
                    <tr id="fontlarger">
                        <td>
                            <t/><t/><t/>
                            {trs.id}
                        </td>
                        <td>
                            <a id="linkh2" href={"/product/"+trs.product}><ProductName product={trs.product}/></a>
                        </td>
                        <td>
                            {trs.count}
                        </td>
                        <td>
                            {(trs.price).toFixed(2)} zł
                        </td>
                        <td>
                            {trs.date}
                        </td>
                        <td>
                            <Payment transaction={trs.id}/>
                        </td>
                        <td>
                            <Delivery transaction={trs.id}/>
                        </td>
                        <td>
                            <a id="button" href="#" onClick={() => this.showAdd(trs.product)}>Dodaj opinię</a>
                        </td>
                    </tr>
                )
            })
            this.setState({transactions: transactions})
        })
    }

    render() {
        return (
            <div>
                {this.state.addframe}
                <div id="frame">
                <table id="fullWidth">
                    <tr id="left">
                        <th><t/><t/><t/>ID</th>
                        <th>Produkt</th>
                        <th>Ilość</th>
                        <th>Kwota</th>
                        <th>Data tranzakcji</th>
                        <th>Data zapłaty</th>
                        <th>Data przesyłki</th>
                        <th>Opcje</th>
                    </tr>
                    {this.state.transactions}
                </table>
                </div>
            </div>
        )
    }
}

export default Transactions;