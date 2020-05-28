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
import Promotions from './Promotions'
import Comments from './Comments'
import Users from './Users'
import Cart from './Cart'
import Transactions from './Transactions'
import ProductForm from './ProductForm'

import './App.css';

function App() {
    return <Router>
        <div id="categoryList">
            <a href="/">Main</a>
            <Route component={Categories}/>
        </div>
        <div id="main">
            <Route path="/category/:cat" component={Products}/>
            <Route path="/user/:user" component={UserPage}/>
            <Route path="/product/:product" component={Product}/>
            <Route path="/product/:product" component={Opinions}/>
        </div>
    </Router>
}

export default App;

/*
        <div id="menu">
            <ul>
                <li>
                    <Link to="/categories">Categories</Link>
                </li>
                <li>
                    <Link to="/products">Products</Link>
                </li>
                <li>
                    <Link to="/opinions/1">Opinions</Link>
                </li>
                <li>
                    <Link to="/promotions">Promotions</Link>
                </li>
                <li>
                    <Link to="/comments">Comments</Link>
                </li>
                <li>
                    <Link to="/users">Users</Link>
                </li>
                <li>
                    <Link to="/cart">Cart</Link>
                </li>
                <li>
                    <Link to="/transactions">Transactions</Link>
                </li>
                <li>
                    <Link to="/productadd">Add Product</Link>
                </li>
            </ul>
            <Route path="/categories" component={Categories}/>
            <Route path="/products" component={Products}/>
            <Route path="/opinions/:product" component={Opinions}/>
            <Route path="/promotions" component={Promotions}/>
            <Route path="/comments" component={Comments}/>
            <Route path="/users" component={Users}/>
            <Route path="/cart/:user" component={Cart}/>
            <Route path="/transactions" component={Transactions}/>
            <Route path="/productadd" component={ProductForm}/>
        </div>
 */