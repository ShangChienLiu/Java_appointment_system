<div align="center">
<h1>
   <img src="https://img.icons8.com/pulsar-color/96/markdown.png" width="100" height="100" />
   <br>
   JAVA_APPOINTMENT_SYSTEM
</h1>
<h3>◦ Streamline appointments with our Java appointment system!</h3>
<h3>◦ Developed with the software and tools below.</h3>

<p align="center">
<img src="https://img.shields.io/badge/GitHub-181717.svg?style=flat&logo=GitHub&logoColor=white" alt="GitHub">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
<img src="https://img.shields.io/badge/Markdown-000000.svg?style=flat&logo=Markdown&logoColor=white" alt="Markdown">
</p>

![license](https://img.shields.io/github/license/kennysuper007/Java_appointment_system?style=flat&labelColor=E5E4E2&color=869BB3)
![repo-language-count](https://img.shields.io/github/languages/count/kennysuper007/Java_appointment_system?style=flat&labelColor=E5E4E2&color=869BB3)
![repo-top-language](https://img.shields.io/github/languages/top/kennysuper007/Java_appointment_system?style=flat&labelColor=E5E4E2&color=869BB3)
![last-commit](https://img.shields.io/github/last-commit/kennysuper007/Java_appointment_system?style=flat&labelColor=E5E4E2&color=869BB3)
</div>

---

## 🔗 Quick Links
- [🔗 Quick Links](#-quick-links)
- [📍 Overview](#-overview)
- [� Repository Structure](#-repository-structure)
- [🧩 Modules](#-modules)
- [🚀 Getting Started](#-getting-started)
  - [⚙️ Installation](#️-installation)
  - [🤖 Running Java\_appointment\_system](#-running-java_appointment_system)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)

---

## 📍 Overview

The Java_appointment_system project is a Java-based application that allows users to manage appointments. It provides core functionalities such as adding appointments, displaying appointments for a particular day, deleting appointments, and displaying appointments within a specified period of time. The project uses a simple object-oriented design, with different types of appointments (one-time, daily, and monthly) represented by classes that extend a base Appointment class. The value proposition of this project lies in its ability to help users efficiently organize and keep track of their appointments, improving their time management and productivity.

---

## 📂 Repository Structure

```sh
└── Java_appointment_system/
    └── src/
        ├── App.java
        ├── Appointment.java
        ├── AppointmentTester.java
        ├── Daily.java
        ├── Monthly.java
        └── Onetime.java

```

---

## 🧩 Modules

<details closed><summary>src</summary>

| File                                                                                                                    | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ---                                                                                                                     | ---                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Appointment.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/Appointment.java)             | The code snippet in `Appointment.java` is responsible for managing appointments in a Java appointment system. It defines the `Appointment` class, which includes methods to add, display, and delete appointments based on criteria such as year, month, and day. The class also supports different types of appointments (one-time, daily, monthly) based on user input. The appointments are stored in an `ArrayList` for easy access and manipulation. |
| [AppointmentTester.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/AppointmentTester.java) | The code snippet in `AppointmentTester.java` allows users to add, display, and delete appointments. It takes input for appointment details such as description, type, and date. The appointments are stored in an `ArrayList`.                                                                                                                                                                                                                            |
| [Monthly.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/Monthly.java)                     | This code snippet is a part of the Java appointment system repository. It includes the Monthly class, which extends the Appointment class and provides functionality to check if an appointment occurs on a specific date. The code also defines a toString method to display the appointment details.                                                                                                                                                    |
| [Onetime.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/Onetime.java)                     | This code snippet is a file named Onetime.java within the Java_appointment_system repository. It extends the Appointment class and represents a one-time appointment. It includes a constructor and a toString method to provide information about the appointment.                                                                                                                                                                                       |
| [App.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/App.java)                             | The code snippet in the `App.java` file is the entry point of the Java appointment system repository. It prints Hello, World! when executed.                                                                                                                                                                                                                                                                                                              |
| [Daily.java](https://github.com/kennysuper007/Java_appointment_system/blob/main/src/Daily.java)                         | This code snippet is a class called Daily that extends the Appointment class. It represents a daily appointment in an appointment system. It has methods to check if it occurs on a specific date and to convert it to a string format.                                                                                                                                                                                                                   |

</details>

---

## 🚀 Getting Started
### ⚙️ Installation

1. Clone the Java_appointment_system repository:
```sh
git clone https://github.com/kennysuper007/Java_appointment_system
```

2. Change to the project directory:
```sh
cd Java_appointment_system
```

### 🤖 Running Java_appointment_system
Use the following command to run Java_appointment_system:
```sh
javac AppointmentTester.java
java AppointmentTester
```

---

## 🤝 Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Submit Pull Requests](https://github.com/kennysuper007/Java_appointment_system/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/kennysuper007/Java_appointment_system/discussions)**: Share your insights, provide feedback, or ask questions.
- **[Report Issues](https://github.com/kennysuper007/Java_appointment_system/issues)**: Submit bugs found or log feature requests for Java_appointment_system.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.
   ```sh
   git clone <your-forked-repo-url>
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear and concise message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.

Once your PR is reviewed and approved, it will be merged into the main branch.

</details>

---

## 📄 License


This project is protected under the MIT License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---
