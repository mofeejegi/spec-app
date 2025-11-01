package com.mofeejegi.specapp.devlist.ui

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class DevListScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun devListScreen_displaysAllDevelopers() {
        composeTestRule.setContent {
            DevListScreen()
        }

        composeTestRule.onNodeWithText("Mofe Jegi").assertIsDisplayed()
        composeTestRule.onNodeWithText("mofe@example.com").assertIsDisplayed()
        composeTestRule.onNodeWithText("Jane Doe").assertIsDisplayed()
        composeTestRule.onNodeWithText("jane@example.com").assertIsDisplayed()
        composeTestRule.onNodeWithText("John Smith").assertIsDisplayed()
        composeTestRule.onNodeWithText("john@example.com").assertIsDisplayed()
    }
}
