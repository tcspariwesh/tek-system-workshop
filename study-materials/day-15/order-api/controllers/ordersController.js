const fs = require("fs");
const { v4: uuidv4 } = require("uuid");

const FILE = "./orders.json";

const readData = () => {
  return JSON.parse(fs.readFileSync(FILE));
};

const writeData = (data) => {
  fs.writeFileSync(FILE, JSON.stringify(data, null, 2));
};

exports.createOrder = (req, res) => {
  const orders = readData();

  const newOrder = {
    id: uuidv4(),
    item: req.body.item,
    quantity: req.body.quantity,
    price: req.body.price,
    status: "pending",
    createdAt: new Date()
  };

  orders.push(newOrder);
  writeData(orders);

  res.status(201).json(newOrder);
};

exports.getOrders = (req, res) => {
  const orders = readData();
  res.json(orders);
};

exports.getOrderById = (req, res) => {
  const orders = readData();
  const order = orders.find(o => o.id === req.params.id);

  if (!order) {
    return res.status(404).json({ message: "Order not found" });
  }

  res.json(order);
};

exports.updateOrder = (req, res) => {
  let orders = readData();

  const index = orders.findIndex(o => o.id === req.params.id);

  if (index === -1) {
    return res.status(404).json({ message: "Order not found" });
  }

  orders[index] = {
    ...orders[index],
    ...req.body
  };

  writeData(orders);
  res.json(orders[index]);
};

exports.deleteOrder = (req, res) => {
  let orders = readData();

  const filtered = orders.filter(o => o.id !== req.params.id);

  if (orders.length === filtered.length) {
    return res.status(404).json({ message: "Order not found" });
  }

  writeData(filtered);
  res.json({ message: "Order deleted" });
};
