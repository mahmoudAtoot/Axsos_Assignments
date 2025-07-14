const mongoose = require('mongoose');

const ProductSchema = new mongoose.Schema({
    title: { type: String, required: true, minlength: [3, "Username must be more than 3 chars."] },
    price: { type: Number, required: true },
    description: { type: String },
});



module.exports = mongoose.model('Product', ProductSchema);