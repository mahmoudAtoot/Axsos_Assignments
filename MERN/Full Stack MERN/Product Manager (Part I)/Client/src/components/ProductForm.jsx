import React, { useState } from 'react';
import axios from 'axios';

const ProductForm = () => {
    const [form, setForm] = useState({ title: '', price: '', description: '' });

    const handleChange = (e) => setForm({ ...form, [e.target.name]: e.target.value });

    const handleSubmit = (e) => {
        e.preventDefault();

        axios.post('http://localhost:8000/api/product', form)
            .then(() => {
                alert('Product added successfully!');
                setForm({ title: '', price: '', description: '' });
            })
            .catch(() => {
                alert(' Failed to add product');
            });
    };  

    return (
        <form onSubmit={handleSubmit}>
            <input name="title" placeholder="Title" value={form.title} onChange={handleChange} required />
            <input name="price" type="number" placeholder="Price" value={form.price} onChange={handleChange} required />
            <textarea name="description" placeholder="Description" value={form.description} onChange={handleChange} />
            <button type="submit">Add Product</button>
        </form>
    );
    
};

export default ProductForm;