# 🎨 Colorful CardView Sample

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-2.0-purple?style=for-the-badge&logo=kotlin" alt="Kotlin" />
  <img src="https://img.shields.io/badge/Compose-Multiplatform-blue?style=for-the-badge&logo=jetpackcompose" alt="Compose" />
  <img src="https://img.shields.io/badge/Architecture-MVVM-orange?style=for-the-badge" alt="MVVM" />
  <img src="https://img.shields.io/badge/MAD_Score-95%2F100-brightgreen?style=for-the-badge" alt="MAD Score" />
</p>

---

## 🚀 Overview
Welcome to **Colorful CardView Sample**, a personal education project meticulously crafted to master **Modern Android Development (MAD)**. This project isn't just a list of cards; it's an exploration of UI/UX delight, state management, and architectural excellence in Kotlin.

> "🔮 A playground where colors meet clean code."

---

## ✨ Features

### ✨ Visual Experience
- **Entertaining UI**: A dynamic, grid-based interface with high-fashion typography.
- **Micro-interactions**: "Squishy" scale animations and glassmorphic card effects for tactile feedback.
- **Dynamic Theming**: Screens that adapt their background and style based on the selected item's palette.

### 🛠️ Technical Prowess
- **MVVM Architecture**: Clean separation of concerns between Data, Logic, and UI.
- **Jetpack Compose**: 100% declarative UI with nested scroll behaviors and advanced layouts.
- **StateFlow & CollectAsState**: Reactive data streams for seamless UI updates.
- **Navigation Compose**: Smooth transitions between the discovery grid and detail views.

---

## 📸 Gallery & Visuals

<p align="center">
  <img src="https://github.com/user-attachments/assets/5fa0132a-f4e6-432a-9c77-f9a0e4daf33b" width="24%">
  <img src="https://github.com/user-attachments/assets/1aa4e7b7-235a-4fd7-89de-de469e02193b" width="24%">
  <img src="https://github.com/user-attachments/assets/f80e5deb-1f84-489d-bb6c-f08b4d26a991" width="24%">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/4159cf93-e57b-4442-99d5-2b8035db8c30" width="24%">
  <img src="https://github.com/user-attachments/assets/a1ede6e1-10d1-46d8-a947-7bea6b4ef199" width="24%">
  <img src="https://github.com/user-attachments/assets/9c8ed484-09b5-4869-9da7-19648803c98d" width="24%">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/18491348-2199-4f4e-b1a0-297da5c73a1f" width="24%">
  <img src="https://github.com/user-attachments/assets/3a5d8d4f-af2b-4653-9192-2f3edc54be67" width="24%">
  <img src="https://github.com/user-attachments/assets/295df129-d61b-4911-93ad-4578d7718365" width="24%">
</p>

---

## 🏗️ Architecture (MVVM)
The project follows the official Android architecture guidelines to ensure scalability and testability.

### 🗺️ System Flow Chart
```mermaid
graph TD
    A[User Interaction] -->|Action| B(UI / Compose)
    B -->|Intent| C[ViewModel]
    C -->|Update State| D{StateFlow}
    D -->|Observe| B
    C -->|Request Data| E[Repository/Model]
    E -->|Provide Data| C
```

### 📂 Structural Breakdown
- **`model/`**: Pure Kotlin data classes representing the "Vibe" items.
- **`viewmodel/`**: Logic layer managing the `MutableStateFlow` of items and navigation logic.
- **`ui/components/`**: Modular, reusable Compose functions (Atomic Design principles).
- **`ui/theme/`**: Centralized color, typography, and shape definitions.

---

## 📊 MAD Score (Modern Android Development)
This project aims for a high MAD Score by utilizing the latest Jetpack libraries.

| Category | Technology | Score |
| :--- | :--- | :--- |
| **Language** | Kotlin (Coroutines, Flow) | ⭐⭐⭐⭐⭐ |
| **UI** | Jetpack Compose | ⭐⭐⭐⭐⭐ |
| **Architecture** | ViewModel, StateFlow | ⭐⭐⭐⭐⭐ |
| **Tooling** | Android Studio Panda, Gradle KTS | ⭐⭐⭐⭐ |

---

## 🛠️ Tech Stack
- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **State Management**: [StateFlow & Flow](https://kotlinlang.org/docs/flow.html)
- **Dependency Management**: [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
- **Icons**: [Material Design Icons Extended](https://developer.android.com/jetpack/compose/components/icon)

---

## 📝 How to Run
1. Clone the repository.
2. Open with **Android Studio Panda** (or newer).
3. Run the `:app` module on an emulator or physical device.

---

## 🎓 Learning Objectives
- [x] Mastering `LazyVerticalGrid` and `Scaffold` layouts.
- [x] Implementing custom `InteractionSource` for animations.
- [x] Formatting and handling Color logic (`toArgb` manipulation).
- [x] Deep dive into `TopAppBar` scroll behaviors.

---
