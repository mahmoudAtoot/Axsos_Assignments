import React, { useState, useCallback } from "react";

const HomeComponent = () => {
    const [firstname, setFirstName] = useState("");
    const [lastname, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const [errors, setErrors] = useState({});

    const handleInputChange = useCallback(
        (setter, fieldName) => (e) => {
            const value = e.target.value;
            setter(value);
            validateSingleField(fieldName, value);
        },
        []
    );

    const validateSingleField = useCallback((field, value) => {
        let message = "";

        switch (field) {
            case "firstname":
                if (value.trim().length < 3)
                    message = "First name must be at least 3 characters.";
                break;
            case "lastname":
                if (value.trim().length < 3)
                    message = "Last name must be at least 3 characters.";
                break;
            case "email":
                if (!value.includes("@") || !value.includes("."))
                    message = "Invalid email format.";
                break;
            case "password":
                if (value.length < 6)
                    message = "Password must be at least 6 characters.";
                break;
            case "confirmPassword":
                if (value !== password)
                    message = "Passwords do not match.";
                break;
            default:
                break;
        }

        setErrors((prev) => ({ ...prev, [field]: message }));
    }, [password]);

    const createUser = useCallback(
        (e) => {
            e.preventDefault();

            const newErrors = {};

            if (firstname.trim().length < 3)
                newErrors.firstname = "First name must be at least 3 characters.";
            if (lastname.trim().length < 3)
                newErrors.lastname = "Last name must be at least 3 characters.";
            if (!email.includes("@") || !email.includes("."))
                newErrors.email = "Invalid email format.";
            if (password.length < 6)
                newErrors.password = "Password must be at least 6 characters.";
            if (confirmPassword !== password)
                newErrors.confirmPassword = "Passwords do not match.";

            setErrors(newErrors);

            if (Object.keys(newErrors).length > 0) return;

            const newUser = { firstname, lastname, email, password };
            console.log("Welcome!", newUser);

            setFirstName("");
            setLastName("");
            setEmail("");
            setPassword("");
            setConfirmPassword("");
            setErrors({});
        },
        [firstname, lastname, email, password, confirmPassword]
    );

    return (
        <div style={{ maxWidth: "400px", margin: "0 auto" }}>
            <h1>Sign Up Form</h1>
            <form onSubmit={createUser} noValidate>
                <div>
                    <label>First Name:</label>
                    <input
                        type="text"
                        value={firstname}
                        onChange={handleInputChange(setFirstName, "firstname")}
                    /><br></br>
                    {errors.firstname && <span style={{ color: "red" }}>{errors.firstname}</span>}
                </div>
                <div>
                    <label>Last Name:</label>
                    <input
                        type="text"
                        value={lastname}
                        onChange={handleInputChange(setLastName, "lastname")}
                    /><br></br>
                    {errors.lastname && <span style={{ color: "red" }}>{errors.lastname}</span>}
                </div>
                <div>
                    <label>Email:</label>
                    <input
                        type="email"
                        value={email}
                        onChange={handleInputChange(setEmail, "email")}
                    /><br></br>
                    {errors.email && <span style={{ color: "red" }}>{errors.email}</span>}
                </div>
                <div>
                    <label>Password:</label>
                    <input
                        type="password"
                        value={password}
                        onChange={handleInputChange(setPassword, "password")}
                    /><br></br>
                    {errors.password && <span style={{ color: "red" }}>{errors.password}</span>}
                </div>
                <div>
                    <label>Confirm Password:</label>
                    <input
                        type="password"
                        value={confirmPassword}
                        onChange={handleInputChange(setConfirmPassword, "confirmPassword")}
                    /><br></br>
                    {errors.confirmPassword && (
                        <span style={{ color: "red" }}>{errors.confirmPassword}</span>
                    )}
                </div>
                <div style={{ marginTop: "10px" }}>
                    <button type="submit">Create User</button>
                </div>
            </form>

            <hr />
            <h3>Your Form Data</h3>
            <p><strong>First Name:</strong> {firstname}</p>
            <p><strong>Last Name:</strong> {lastname}</p>
            <p><strong>Email:</strong> {email}</p>
            <p><strong>Password:</strong> {password.replace(/./g, "•")}</p>
            <p><strong>Confirm Password:</strong> {confirmPassword.replace(/./g, "•")}</p>
        </div>
    );
};

export default HomeComponent;
