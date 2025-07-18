const mongoose = require("mongoose");
require("dotenv").config();

const dbName = process.env.DB;
const username = process.env.ATLAS_USERNAME;
const pw = process.env.ATLAS_PASSWORD;
const uri = `mongodb+srv://${username}:${pw}@axsos.j2wu6eh.mongodb.net/${dbName}?retryWrites=true&w=majority&appName=Axsos`;

mongoose
    .connect(uri)
    .then(() => console.log("Established a connection to the database"))
    .catch((err) =>
        console.log("Something went wrong when connecting to the database", err)
    );

module.exports = mongoose;