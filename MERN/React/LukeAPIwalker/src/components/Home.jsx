import React, { useState } from "react";
import axios from "axios";


const Home= () => {
    const [character, setCharacter] = useState(null)
    const [id, setId] = useState('')
    const [type, setType] = useState('')
    const getCharacter = (e) => {
        e.preventDefault()
        axios.get(`https://swapi.tech/api/${type}/${id}`)
            .then(res => {
                setCharacter(res.data.result.properties); 
            })
            .catch(err => console.log(err));
    }
    return (
        <>
            <div>
                <h1>Star Wars</h1>
                <form onSubmit={getCharacter} ></form>
                <input type="number" onChange={(e) => setId(e.target.value)} value={id} />
                <select onClick={(e) => setType(e.target.value)}>
                    <option value="planets">planets</option>
                    <option value="people">people</option>
                </select>
                <button onClick={getCharacter}>get Character</button>
                {character && (
                    <ul>
                        <li><strong>Name:</strong> {character.name}</li>
                        {type === "people" && (
                            <>
                                <li><strong>Height:</strong> {character.height}</li>
                                <li><strong>Mass:</strong> {character.mass}</li>
                                <li><strong>Gender:</strong> {character.gender}</li>
                                <li><strong>Birth Year:</strong> {character.birth_year}</li>
                            </>
                        )}
                        {type === "planets" && (
                            <>
                                <li><strong>Climate:</strong> {character.climate}</li>
                                <li><strong>Terrain:</strong> {character.terrain}</li>
                                <li><strong>Population:</strong> {character.population}</li>
                                <li><strong>Gravity:</strong> {character.gravity}</li>
                            </>
                        )}
                    </ul>
                )}
            </div>
        </>
    )
}
export default Home;