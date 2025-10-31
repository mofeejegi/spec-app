# Implementation Plan

- [ ] 1. **Project Setup and Dependencies**
    - [ ] 1.1. Add `lifecycle-viewmodel-compose`, `lifecycle-runtime-compose`, `coil-compose`, and `navigation-compose` to the `dependencies` block in `app/build.gradle.kts`.
    - [ ] 1.2. Trigger a Gradle sync to ensure the new dependencies are downloaded.

- [ ] 2. **Create Data Model and ViewModel**
    - [ ] 2.1. Create a new package `com.mofeejegi.specapp.devlist.model`.
    - [ ] 2.2. Create a Kotlin data class `Developer` in the `model` package with `name: String`, `email: String`, and `profilePhotoUrl: String` properties.
    - [ ] 2.3. Create a new package `com.mofeejegi.specapp.devlist.viewmodel`.
    - [ ] 2.4. Create a `DevListViewModel` class that extends `androidx.lifecycle.ViewModel`.
    - [ ] 2.5. In the ViewModel, add a private `MutableStateFlow` and a public `StateFlow` to expose a hardcoded list of `Developer` objects.

- [ ] 3. **Build the Developer List Item UI**
    - [ ] 3.1. Create a new package `com.mofeejegi.specapp.devlist.ui`.
    - [ ] 3.2. Create a `DevListScreen.kt` file.
    - [ ] 3.3. Inside this file, create a composable function `DeveloperListItem(developer: Developer)`.
    - [ ] 3.4. Use a `Card` and `Row` to structure the item. Use `AsyncImage` for the photo (with `clip(CircleShape)`) and a `Column` with two `Text` composables for the name and email.
    - [ ] 3.5. Add a `@Preview` function to display the `DeveloperListItem`.

- [ ] 4. **Build the Main List Screen**
    - [ ] 4.1. In `DevListScreen.kt`, create the `DevListScreen` composable which takes a `DevListViewModel` as an argument.
    - [ ] 4.2. Collect the developer list from the ViewModel's `StateFlow` using `collectAsStateWithLifecycle()`.
    - [ ] 4.3. Use a `LazyColumn` to iterate over the collected list and render a `DeveloperListItem` for each developer.

- [ ] 5. **Integrate the Screen into MainActivity**
    - [ ] 5.1. Create an `App.kt` file in the `ui` package.
    - [ ] 5.2. Create a main `App` composable that will house the `DevListScreen`.
    - [ ] 5.3. In `MainActivity.kt`, update the `setContent` block to call the `App` composable instead of `Greeting`.

- [ ] 6. **Write Unit Tests for ViewModel**
    - [ ] 6.1. In the `test` source set, create a test class for `DevListViewModel`.
    - [ ] 6.2. Write a test to confirm that the ViewModel's `StateFlow` emits the correct hardcoded list of developers upon initialization.

- [ ] 7. **Write UI Tests for Composables**
    - [ ] 7.1. In the `androidTest` source set, create a test class for the `DevListScreen`.
    - [ ] 7.2. Use `ComposeTestRule` to verify that the screen displays a list.
    - [ ] 7.3. Assert that the text for developer names and emails appears on the screen.
