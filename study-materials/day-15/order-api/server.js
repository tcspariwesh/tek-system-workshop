const express = require("express");
const app = express();

app.use(express.json());

const orderRoutes = require("./routes/orders");
app.use("/orders", orderRoutes);

const PORT = 3000;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
