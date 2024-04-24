# Learning Single vs Multiple vs ThreadPool Web Servers

This project is aimed at understanding the differences between single-threaded, multi-threaded, and thread pool-based web servers. In the process, I also explored related topics such as lambda expressions and functional interfaces in Java.

## Overview

In this project, I implemented a basic web server that handles client requests. The server is implemented using different threading models:

1. **Single-threaded**: In this model, the server handles one request at a time. While simple, it can become a bottleneck when dealing with multiple clients simultaneously.

2. **Multiple-threaded**: Here, the server creates a new thread for each incoming client request. This allows the server to handle multiple requests concurrently without blocking.

3. **Thread pool-based**: Instead of creating a new thread for each request, a fixed-size pool of threads is maintained. Incoming requests are assigned to available threads from the pool. This model strikes a balance between resource usage and concurrency.

## Additional Learnings

### Lambda Expressions

During the implementation of different threading models, I utilized lambda expressions extensively. Lambda expressions allowed me to define concise and inline implementations of functional interfaces, such as the `Runnable` interface for handling thread tasks.

### Functional Interfaces

Functional interfaces are interfaces with a single abstract method, and they can be implemented using lambda expressions. In this project, I leveraged functional interfaces, such as `Runnable`, to define the tasks performed by threads in the web server implementations.

## Usage

To run the web server implementations and observe their behaviour, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the directory containing the source code.
3. Compile the Java files using `javac`.
4. Run the desired web server implementation using `java`.

For example, to run the single-threaded web server:

```bash
java Server
```


