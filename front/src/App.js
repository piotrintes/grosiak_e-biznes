import React from 'react';
import {
    BrowserRouter as Router,
    Route,
    Link
} from 'react-router-dom';
import Products from './Products'
import Categories from './Categories'
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
                    <Link to="/productadd">Add Product</Link>
                </li>
            </ul>
            <Route path="/categories" component={Categories}/>
            <Route path="/products" component={Products}/>
            <Route path="/productadd" component={ProductForm}/>
        </div>
    </Router>
}

export default App;
