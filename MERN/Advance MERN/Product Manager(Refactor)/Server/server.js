const express = require('express');
const app = express();
const cors = require('cors')
require('dotenv').config()
const PORT = process.env.PORT;

app.use(cors())
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

require("./config/mongoose.config");
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
const AllMyUserRoutes = require("./routes/product.route");

AllMyUserRoutes(app);

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));