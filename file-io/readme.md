### File handling

Streams-stream is seq of data which is either in byte format or character format(unicode)

Java uses the concept of a "stream" to handle data flow, and the actual code that makes this concept work (the classes and methods) is located in the `java.io` package.

---

## 1. Streams as an Abstraction 💡

An **abstraction** in programming is a way of hiding the complex reality of something while showing only the necessary and relevant information.

In the context of Java I/O:

* **The Complex Reality (What's Hidden):** When you read data, it could come from a physical hard disk (requiring drivers, sectors, and controllers), a network socket (involving protocols like TCP/IP), or a simple memory buffer. These are all fundamentally different hardware and software processes.
* **The Abstraction (What's Shown):** Java hides all that complexity behind the simple, unified concept of a **Stream**.
    * A **`FileInputStream`** acts as a source of bytes.
    * A **`FileOutputStream`** acts as a destination for bytes.

You don't need to write different code for reading from a file versus reading from a network connection; you just use the appropriate stream class. The stream provides a single, easy-to-use interface (`read()`, `write()`, `close()`) for data transfer, regardless of where the data comes from or goes to. 

---

## 2. Implementation in `java.io` 🛠️

The statement that the implementation is in the `java.io` package means that the **concrete classes** that carry out this abstraction are defined there.

For example, the abstract class that defines the basic stream functionality is `java.io.InputStream`. The classes that actually deal with a specific data source or destination and implement that functionality are also in the package:

| Abstraction (Interface) | Concrete Implementation (Class in `java.io`) | Function |
| :--- | :--- | :--- |
| General Byte Source | `InputStream` (abstract class) | Defines the basic methods for reading raw bytes. |
| Specific Byte Source | **`FileInputStream`** | Implements `InputStream` to read bytes from a **file**. |
| Specific Character Source | **`FileReader`** | Implements the character stream abstraction to read from a **file**. |

In short, the **idea** is the Stream abstraction, and the **code** that executes that idea is contained within the `java.io` package.



---
## 3.InputStreamReader

-takes an Input stream extended class
-has read method and returns chars
-end of the buffer denoted by -1
-read method if the buffer is empty and ready state is false will block the thread and wait for input to insert from termianl buffer,and as soon as terminal buffer enter the char to buffer itll read the char
-return char by char as int
-EOF marker is -1 since -1 is not a char so its convenient
-has a ready state returns false if buffer is empty return true if buffer is not empty
