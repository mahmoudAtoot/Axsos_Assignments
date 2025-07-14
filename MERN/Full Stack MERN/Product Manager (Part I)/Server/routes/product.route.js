// const express = require('express');
// const router = express.Router();
require('../controllers/product.controller');
const productController = require('../controllers/product.controller');


module.exports = app => {

app.post('/api/product', productController.createProduct);

app.get('/api' , productController.findAllProducts)

module.exports = app;
}