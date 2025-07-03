import React, { useState } from "react";

const PersonCard = ({firstname,lastname,age,haircolor}) => {
    const [newAge,setNewAge] = useState(age)

    const addAge = () => {
        setNewAge(newAge + 1)
    }
    return(
        <>
    <h1>{lastname}, {firstname} </h1>
    <p>Age: {newAge}</p>
    <p>Hair Color:{haircolor}</p>
    <button onClick={addAge}>Birthday Button for {firstname} {lastname}</button>
    </>
    )
}

export default PersonCard