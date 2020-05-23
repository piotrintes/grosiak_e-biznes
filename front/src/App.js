import React from 'react';
import {
    BrowserRouter as Router,
    Route,
    Link
} from 'react-router-dom';
import Categories from './Categories'
import Products from './Products'
import Opinions from './Opinions'
import Promotions from './Promotions'
import Comments from './Comments'
import Users from './Users'
import Cart from './Cart'
import Transactions from './Transactions'
import ProductForm from './ProductForm'

import './App.css';

function App() {
    return <Router>
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
    </Router>
}

export default App;
