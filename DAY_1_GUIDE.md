# Day 1: UI Basics & Layouts

Welcome to Day 1 of your Android learning journey! Today you'll learn the fundamentals of creating beautiful user interfaces.

---

## What We'll Build Today

A **User Profile Screen** that includes:
- Profile image placeholder
- Name input field
- Email input field
- Phone number input field
- Bio/About text area
- Save button with Material Design styling

---

## Learning Objectives

By the end of Day 1, you will:
1. Understand the Activity lifecycle
2. Know how to create layouts using XML
3. Use ConstraintLayout for responsive designs
4. Implement ViewBinding for type-safe view access
5. Apply Material Design principles
6. Handle button clicks and user input

---

## Step-by-Step Instructions

### Step 1: Understanding the Project Structure

Your Android project has this structure:
```
app/
├── src/
│   └── main/
│       ├── java/com/example/fmd_mobile_app/
│       │   └── MainActivity.kt          # Your Kotlin code
│       ├── res/
│       │   ├── layout/                  # XML layouts
│       │   ├── values/                  # Colors, strings, themes
│       │   ├── drawable/                # Images and icons
│       │   └── mipmap/                  # App icons
│       └── AndroidManifest.xml          # App configuration
└── build.gradle.kts                     # Dependencies
```

### Step 2: Enable ViewBinding

ViewBinding provides type-safe access to views (no more findViewById!).

**Task**: I'll update your `build.gradle.kts` to enable ViewBinding.

### Step 3: Create the Layout

**Task**: I'll create `activity_main.xml` with:
- ConstraintLayout as root
- CardView for profile section
- Material TextInputLayouts for input fields
- Material Button

### Step 4: Update MainActivity

**Task**: I'll update `MainActivity.kt` to:
- Use ViewBinding
- Handle button clicks
- Get user input from fields
- Show a Toast message when Save is clicked

### Step 5: Add Material Design Styling

**Task**: I'll add:
- Custom colors in `colors.xml`
- String resources in `strings.xml`
- Material theme configuration

### Step 6: Test Your App

Run the app on an emulator or physical device to see your UI in action!

---

## Key Concepts Explained

### Activity Lifecycle
An Activity goes through these states:
- `onCreate()` - Activity is created (setup happens here)
- `onStart()` - Activity becomes visible
- `onResume()` - Activity is ready for user interaction
- `onPause()` - Activity is partially obscured
- `onStop()` - Activity is no longer visible
- `onDestroy()` - Activity is destroyed

### ConstraintLayout
The most powerful and flexible layout:
- Position views relative to parent or other views
- Create responsive UIs without nested layouts
- Use constraints (top, bottom, start, end) to position elements

### ViewBinding
Safe alternative to findViewById:
```kotlin
// Old way (error-prone)
val textView = findViewById<TextView>(R.id.textView)

// New way with ViewBinding (type-safe)
binding.textView.text = "Hello"
```

### Material Design
Google's design system for Android:
- Use Material components (Button, TextField, Card)
- Follow spacing, typography, and color guidelines
- Provides a modern, consistent look

---

## Ready to Code?

I'm ready to implement all the steps above. Just say "Let's start Day 1" and I'll:
1. Enable ViewBinding in build.gradle.kts
2. Create a beautiful profile UI layout
3. Update MainActivity with ViewBinding and click handling
4. Add proper colors and strings
5. Test that everything works

Then you can run the app and see your first native Android UI!

---

## Tips for Learning

- **Run the app frequently** - See your changes in real-time
- **Experiment** - Try changing colors, text, and layouts
- **Read the code** - Understand what each line does
- **Ask questions** - If something is unclear, ask me!

Ready to begin? 🚀