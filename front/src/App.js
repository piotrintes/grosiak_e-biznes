import React from 'react';
import {
    BrowserRouter as Router,
    Route,
    Link
} from 'react-router-dom';
import Categories from './Categories'
import Products from './Products'
import Product from './Product'
import Opinions from './Opinions'
import UserPage from './UserPage'
import TopBar from './TopBar'
import Promotions from './Promotions'
import Comments from './Comments'
import Users from './Users'
import Cart from './Cart'
import Transactions from './Transactions'
import ProductForm from './ProductForm'

import './App.css';

function App() {

    return <Router>
        <Route component={TopBar}/>
        <a name="top"/>
        <div id="categoryList">
            <a id="listbutton" href="/">Strona główna</a>
            <Route component={Categories}/>
        </div>
        <div id="main">
            <Route path="/category/:cat" component={Products}/>
            <Route path="/user/:user" component={UserPage}/>
            <Route path="/product/:product" component={Product}/>
            <Route path="/product/:product" component={Opinions}/>
        </div>
        <a href="#top"><img id="topbutton" src="/img/buttons/up.png" width='50px' height='50px'/></a>
    </Router>
}

export default App;