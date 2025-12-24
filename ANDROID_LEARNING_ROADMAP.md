# 5-Day Native Android Learning Path

## Overview
This is a hands-on, progressive learning path for native Android development using Kotlin. Each day builds on the previous one, and you can track your progress through git branches.

---

## Day 1: UI Basics & Layouts (Branch: day_1)
**Goal**: Master Android UI fundamentals and create beautiful layouts

### Topics Covered:
- Activity lifecycle understanding
- XML layouts vs Jetpack Compose
- LinearLayout, RelativeLayout, ConstraintLayout
- Views: TextView, EditText, Button, ImageView
- ViewBinding for safe view access
- Material Design components
- Colors, themes, and styles

### Hands-on Project:
Create a **User Profile Screen** with:
- Profile image placeholder
- Name and email input fields
- Bio text area
- Save button
- Clean Material Design UI

### Learning Outcomes:
- Understand how layouts work in Android
- Build responsive UIs that adapt to different screen sizes
- Use ViewBinding instead of findViewById
- Apply Material Design principles

---

## Day 2: Navigation & Multiple Screens (Branch: day_2)
**Goal**: Navigate between screens and pass data

### Topics Covered:
- Multiple activities
- Intents (explicit and implicit)
- Passing data between activities
- Fragments basics
- Navigation Component
- Bottom Navigation
- RecyclerView and adapters

### Hands-on Project:
Build a **Multi-Screen App** with:
- Home screen with a list of items (RecyclerView)
- Detail screen showing item details
- Settings screen
- Bottom navigation bar
- Pass data between screens

### Learning Outcomes:
- Navigate between different screens
- Use RecyclerView for displaying lists
- Implement Bottom Navigation
- Understand Fragment lifecycle
- Pass data using Intent extras and arguments

---

## Day 3: Data Persistence & State Management (Branch: day_3)
**Goal**: Store and manage app data

### Topics Covered:
- SharedPreferences for simple data
- Room Database (SQLite wrapper)
- Data classes and models
- ViewModel and LiveData
- MVVM architecture basics
- Repository pattern

### Hands-on Project:
Create a **Notes App** with:
- Add, edit, delete notes
- Store notes in Room database
- Display notes in a list
- Search/filter functionality
- Persist user preferences (theme, sort order)

### Learning Outcomes:
- Use Room for local database storage
- Implement MVVM architecture
- Use ViewModel to survive configuration changes
- Understand LiveData for reactive UI updates
- Work with repositories for data abstraction

---

## Day 4: Networking & API Integration (Branch: day_4)
**Goal**: Fetch data from REST APIs

### Topics Covered:
- HTTP networking in Android
- Retrofit library for API calls
- JSON parsing with Gson/Moshi
- Coroutines for async operations
- Error handling
- Loading states (progress indicators)
- Image loading with Coil/Glide

### Hands-on Project:
Build a **Weather App** or **News App** that:
- Fetches data from a public API
- Displays loading state while fetching
- Shows error messages on failure
- Displays data in RecyclerView
- Loads images from URLs
- Implements pull-to-refresh

### Popular Public APIs to Use:
- OpenWeatherMap API (weather data)
- NewsAPI (news articles)
- JSONPlaceholder (fake REST API for testing)
- The Movie Database (TMDB) API

### Learning Outcomes:
- Set up Retrofit for API calls
- Use Kotlin Coroutines for async operations
- Parse JSON responses
- Handle loading, success, and error states
- Display network images efficiently

---

## Day 5: Advanced Features & Polish (Branch: day_5)
**Goal**: Add professional features and polish

### Topics Covered:
- Combining local + remote data (cache strategy)
- Work Manager for background tasks
- Notifications
- Permissions handling
- Dependency Injection with Hilt
- Testing basics (Unit tests, UI tests)
- App optimization and best practices

### Hands-on Project:
Enhance your Day 4 app with:
- Offline-first approach (cache API data in Room)
- Background sync with WorkManager
- Push local notifications
- Handle runtime permissions (if needed)
- Add dependency injection
- Write basic tests
- Polish UI with animations

### Learning Outcomes:
- Implement offline-first architecture
- Schedule background work
- Handle runtime permissions
- Use Hilt for dependency injection
- Write testable code
- Optimize app performance

---

## Branch Strategy

Each day has its own branch that builds on the previous day:

```
main (starting point)
  |
  └─> day_1 (UI basics)
       |
       └─> day_2 (Navigation)
            |
            └─> day_3 (Data persistence)
                 |
                 └─> day_4 (API integration)
                      |
                      └─> day_5 (Advanced features)
```

---

## How to Follow This Path

1. **Start each day** by checking out the new branch:
   ```bash
   git checkout -b day_1
   ```

2. **Complete the day's tasks** following the instructions I provide

3. **Commit your progress** throughout the day:
   ```bash
   git add .
   git commit -m "Complete Day 1: UI basics"
   ```

4. **Move to next day** by creating a new branch from current:
   ```bash
   git checkout -b day_2
   ```

5. **Review anytime** by checking out that day's branch:
   ```bash
   git checkout day_3
   ```

---

## Prerequisites

- Android Studio installed
- Basic Kotlin knowledge (variables, functions, classes)
- Willingness to learn and experiment

---

## Resources

- [Android Developer Documentation](https://developer.android.com)
- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Material Design Guidelines](https://material.io/design)

---

## Ready to Start?

Let me know when you're ready to begin Day 1, and I'll guide you step-by-step through creating your first UI!