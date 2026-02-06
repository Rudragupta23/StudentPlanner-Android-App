# Student Planner Android App 🎓

A specialized Android application designed to help students streamline their academic life. This app provides a centralized hub for managing tasks, keeping lecture notes, and setting timely reminders.

## 🚀 Key Features

* **Note Taking**: A quick and easy way to capture and store study notes.
* **Smart Reminders**: Integrated `TimePicker` system that allows users to set specific times for alerts, ensuring no deadline is missed.
* **Clean Navigation**: Simple dashboard-style UI for quick access to all modules.

## 🛠️ Technical Stack

* **Language**: Java
* **UI Framework**: Android XML (Material 3 Design)
* **Min SDK**: API 24 (Android 7.0)
* **Target SDK**: API 34+
* **Build Tool**: Gradle (Kotlin DSL)

## 📂 Project Architecture

The app follows a modular Activity-based structure:

* `MainActivity.java`: The core dashboard connecting all features.
* `TaskActivity.java`: Logic for adding and managing a to-do list.
* `NotesActivity.java`: Interface for writing and saving academic text.
* `ReminderActivity.java`: Features a `TimePicker` and toast-based notification logic.

## 📂 Project Structure

```
app/src/main/java/com/example/studentplanner/
├── MainActivity.java    # The central navigation hub
├── TaskActivity.java    # Logic for task creation and management
├── NotesActivity.java   # Note-taking functionality
└── ReminderActivity.java # Time-based alert and notification system
```

## 📥 Installation

1.  **Clone the Repository**:
    ```bash
    git clone [https://github.com/rudragupta23/studentplanner-android-app.git](https://github.com/rudragupta23/studentplanner-android-app.git)
    ```
2.  **Open Project**:
    Launch **Android Studio** and select `Open` -> Navigate to the project folder.
3.  **Sync Gradle**:
    Let Android Studio finish the Gradle sync to download necessary dependencies.
4.  **Run**:
    Press `Run 'app'` (or `Shift + F10`) to deploy to your emulator or physical device.

## 📄 License

This project is open-source. Please check the repository for specific license details.

