const express = require('express');
const cors = require('cors')
const app = express();
require('dotenv').config()
require("./config/mongoose.config");

const PORT = process.env.PORT;

app.use(cors())
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
require("../Server/routes/authore.route")(app)

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));