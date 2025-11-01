# Implementation Plan

- [x] 1. **Project Setup and Dependencies**
    - [x] 1.1. Add `lifecycle-viewmodel-compose`, `lifecycle-runtime-compose`, `coil-compose`, and `navigation-compose` to the `dependencies` block in `app/build.gradle.kts`.
    - [x] 1.2. Trigger a Gradle sync to ensure the new dependencies are downloaded.

- [x] 2. **Create Data Model and ViewModel**
    - [x] 2.1. Create a new package `com.mofeejegi.specapp.devlist.model`.
    - [x] 2.2. Create a Kotlin data class `Developer` in the `model` package with `name: String`, `email: String`, and `profilePhotoUrl: String` properties.
    - [x] 2.3. Create a new package `com.mofeejegi.specapp.devlist.viewmodel`.
    - [x] 2.4. Create a `DevListViewModel` class that extends `androidx.lifecycle.ViewModel`.
    - [x] 2.5. In the ViewModel, add a private `MutableStateFlow` and a public `StateFlow` to expose a hardcoded list of `Developer` objects.

- [x] 3. **Build the Developer List Item UI**
    - [x] 3.1. Create a new package `com.mofeejegi.specapp.devlist.ui`.
    - [x] 3.2. Create a `DevListScreen.kt` file.
    - [x] 3.3. Inside this file, create a composable function `DeveloperListItem(developer: Developer)`.
    - [x] 3.4. Use a `Card` and `Row` to structure the item. Use `AsyncImage` for the photo (with `clip(CircleShape)`) and a `Column` with two `Text` composables for the name and email.
    - [x] 3.5. Add a `@Preview` function to display the `DeveloperListItem`.

- [x] 4. **Build the Main List Screen**
    - [x] 4.1. In `DevListScreen.kt`, create the `DevListScreen` composable which takes a `DevListViewModel` as an argument.
    - [x] 4.2. Collect the developer list from the ViewModel's `StateFlow` using `collectAsStateWithLifecycle()`.
    - [x] 4.3. Use a `LazyColumn` to iterate over the collected list and render a `DeveloperListItem` for each developer.

- [x] 5. **Integrate the Screen into MainActivity**
    - [x] 5.1. Create an `App.kt` file in the `ui` package.
    - [x] 5.2. Create a main `App` composable that will house the `DevListScreen`.
    - [x] 5.3. In `MainActivity.kt`, update the `setContent` block to call the `App` composable instead of `Greeting`.

- [x] 6. **Write Unit Tests for ViewModel**
    - [x] 6.1. In the `test` source set, create a test class for `DevListViewModel`.
    - [x] 6.2. Write a test to confirm that the ViewModel's `StateFlow` emits the correct hardcoded list of developers upon initialization.

- [x] 7. **Write UI Tests for Composables**
    - [x] 7.1. In the `androidTest` source set, create a test class for the `DevListScreen`.
    - [x] 7.2. Use `ComposeTestRule` to verify that the screen displays a list.
    - [x] 7.3. Assert that the text for developer names and emails appears on the screen.
