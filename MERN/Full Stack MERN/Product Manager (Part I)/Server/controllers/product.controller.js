const Product = require('../models/product.model');


module.exports.findAllProducts = (req, res) => {
    Product.find()

        .then((allProducts) => {
            res.json(allProducts);
        })

        .catch((err) => {
            res.json(err);
        });
};
module.exports.createProduct = async (req, res) => {
    try {
        const product = await Product.create(req.body);
        res.status(201).json(product);
    } catch (err) {
        res.status(400).json({ error: err.message });
    }
};