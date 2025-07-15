import { useState } from "react";
import axios from "axios"
import { useEffect } from "react";
import { Link } from "react-router-dom"
import '../ProductStyles.css';

const ProductList = () => {
    const [data, setData] = useState([])
    useEffect(() => {
        axios.get("http://localhost:8000/api/products/allproducts")
            .then(res => {
                setData(res.data)
                console.log("Success")
                console.log(res.data)
            })
            .catch(err => {
                console.log(err)
            })
    }, [])
    const list = data.map(((el, i) => (<li key={i}><Link to={`/products/${el._id}`}>{el.title}</Link></li>)))
    return (
        <div className="product-container">
            <h1>All Products:</h1>
            <ul className="product-list">
                {list}
            </ul>
        </div>
    )

}
export default ProductList