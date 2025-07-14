const express = require("express");
const { faker } = require("@faker-js/faker");
const app = express();
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({ extended: true })); 
app.get("/", (req, res) => {
    console.log("object")
    res.send("Express is working!");
});

const createUser = () => {
    const newFake = {
        password: faker.internet.password(),
        email: faker.internet.email(),
        phoneNumber: faker.phone.number(),
        lastName: faker.person.lastName(),
        firstName: faker.person.firstName(),
        id: faker.database.mongodbObjectId()
    }
    return newFake
}
const createCompany = () => {
    const newCompaney = {
        id: faker.database.mongodbObjectId(),
        name: faker.company.name(),
        address: {
            street: faker.location.streetAddress(),
            city: faker.location.city(),
            state: faker.location.state(),
            zipCode: faker.location.zipCode(),
            country: faker.location.country()
        }
    }
    return newCompaney
}

app.get("/api/users/new", (req, res) => {
    const user = createUser();
    res.json(user);
});

app.get("/new/users", (req, res) => {
    res.json("hi")
})
app.get("/api/companies/new", (req, res) => {
    const company = createCompany();
    res.json(company);
});

app.get("/api/user/company", (req, res) => {
    const user = createUser();
    const company = createCompany();
    res.json({ user, company });
});

app.listen(port, () =>
    console.log(`🚀 Server is running on http://localhost:${port}`)
);