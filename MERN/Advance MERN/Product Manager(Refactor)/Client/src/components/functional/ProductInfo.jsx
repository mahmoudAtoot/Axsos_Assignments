import axios from 'axios'
import { useState } from 'react'
import { useEffect } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { Link } from 'react-router-dom'
import DeleteComponent from '../presentational/DeleteComponent'
import InfoComponent from '../presentational/InfoComponent'
import '../ProductStyles.css';

const ProductInfo = () => {
    const { id } = useParams()
    const [data, setData] = useState({})
    const navigate = useNavigate()
    const handleDelete = (e) => {
        axios.delete(`http://localhost:8000/api/products/${id}`)
            .then(res => {
                console.log(res.data)
                navigate("/")
            })
            .catch(err => {
                console.log(err)
            })
    }
    useEffect(() => {
        axios.get(`http://localhost:8000/api/products/${id}`)
            .then(res => {
                setData(res.data)
                console.log(data)
            })
            .catch(err => {
                console.log(err)
            })
    }, [])
    return (
        <div className="product-container">
            <InfoComponent data={data} />
            <Link to={`/products/${id}/edit`}>Edit</Link>
            <DeleteComponent handleDelete={handleDelete} />
        </div>
    )

}
export default ProductInfo