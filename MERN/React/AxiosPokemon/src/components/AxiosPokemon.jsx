import React, { useState } from 'react';
import axios from 'axios';

export const AxiosPokemon = () => {
    const [pokemonList, setPokemonList] = useState([]);
    const [loaded, setLoaded] = useState(false);
    const [showDetails, setShowDetails] = useState(false);

    if (!loaded) {
        axios.get('https://pokeapi.co/api/v2/pokemon')
            .then(response => {
                setPokemonList(response.data.results);
                setLoaded(true);
            });
    }

    return (
        <>
            <h1>Axios Pokémon</h1>
            <button onClick={() => setShowDetails(prev => !prev)}>
                {showDetails ? 'Hide Details' : 'Show Details'}
            </button>

            {showDetails && (
                <ul>
                    {pokemonList.map((pokemon, index) => (
                        <li key={index}>{pokemon.name}</li>
                    ))}
                </ul>
            )}
        </>
    );
};