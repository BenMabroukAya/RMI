# 📨 RMI Chat Application

A basic Java RMI (Remote Method Invocation) application that demonstrates a simple multi-client chat system with user authentication and message broadcasting.

---

## 📌 Table of Contents

- [📖 Overview](#-overview)
- [✨ Features](#-features)
- [⚙️ Prerequisites](#️-prerequisites)
- [🚀 Installation](#-installation)
- [🧪 Usage](#-usage)
- [🧾 Code Structure](#-code-structure)
- [🙋‍♀️ Author](#️-author)
- [🤝 Contributing](#-contributing)
- [🪪 License](#-license)

---

## 📖 Overview

This project implements a simple chat system using **Java RMI**, allowing multiple clients to:
- Register and log in
- Send and receive messages via a centralized server
- Communicate in real-time across different machines (LAN-friendly)

It showcases a fundamental use case of distributed systems and RMI technology.

---

## ✨ Features

- ✅ **User Authentication**
  - Register a new user
  - Log in with existing credentials

- 💬 **Real-time Messaging**
  - Broadcast messages to all connected users
  - Message history display on client side

- ⚙️ **Server/Client Architecture**
  - Java RMI communication
  - Handles multiple concurrent clients

- 📚 **Clean Separation**
  - Interfaces, models, client, and server logic are well separated

---

## ⚙️ Prerequisites

Ensure you have the following installed:

- Java JDK 8 or later  
- RMI registry (comes with JDK)  
- Optional: Maven (if planning to package or extend the app)

---

## 🚀 Installation

### Step 1: Clone the Repository

```bash
git clone https://github.com/BenMabroukAya/RMI.git
cd RMI
````

### Step 2: Compile the Code

```bash
javac server/*.java client/*.java common/*.java
```

Or with Maven:

```bash
mvn compile
```

---

## 🧪 Usage

### Step 1: Start the RMI Registry

```bash
rmiregistry 1099 &
```

Ensure you are in the root directory when launching this.

### Step 2: Launch the Server

```bash
java server.ChatServer
```

The server will bind the remote object and wait for client connections.

### Step 3: Start One or More Clients

```bash
java client.ChatClient
```

Each client can:

* Register or log in
* Send messages to the group
* View incoming messages in real-time

---

## 🧾 Code Structure

```
/
├── client/              # Client application logic
│   └── ChatClient.java
├── server/              # Server-side implementation
│   ├── ChatServer.java
│   └── ChatServerImpl.java
├── common/              # Shared RMI interfaces and data classes
│   ├── Chat.java
│   ├── ChatMessage.java
│   └── User.java
└── README.md            # Project documentation
```

* `common/`: Contains shared interfaces and serializable classes used by both client and server
* `server/`: Implements the chat server and handles RMI binding and message routing
* `client/`: Handles user input, GUI (if any), and communication with the server

---

## 🙋‍♀️ Author

**Aya Ben Mabrouk**
📧 [aya.benmabrouk@isimg.tn](mailto:aya.benmabrouk@isimg.tn)
🔗 [LinkedIn](https://www.linkedin.com/in/aya-ben-mabrouk/)

---

## 🤝 Contributing

Contributions are welcome!
To contribute:

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/new-feature`
3. Commit your changes: `git commit -m 'Add new feature'`
4. Push to the branch: `git push origin feature/new-feature`
5. Open a Pull Request

Please ensure your code is clean and documented.

---

## 🪪 License

This project is licensed under the **MIT License**.

```
MIT License

Copyright (c) 2025 Aya Ben Mabrouk

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the “Software”), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

---

⭐ Feel free to star this repo if you find it helpful!

