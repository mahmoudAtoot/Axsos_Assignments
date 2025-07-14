import React from "react";

const PersonCard = (props) => {
    const { firstName, lastName, age, hairColor } = props
    return (
        <>
            <h1>{firstName} {lastName}</h1>
            <p>age:{age}</p>
            <p>hairColore:{hairColor}</p>
        </>
    )
}
export default PersonCard;