package com.mofeejegi.specapp.devlist.viewmodel

import app.cash.turbine.test
import com.google.common.truth.Truth.assertThat
import com.mofeejegi.specapp.devlist.model.Developer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class DevListViewModelTest {

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `viewmodel initialization should emit correct developer list`() = runTest {
        val viewModel = DevListViewModel()
        val expectedDevelopers = listOf(
            Developer("Mofe Jegi", "mofe@example.com", "https://example.com/mofe.jpg"),
            Developer("Jane Doe", "jane@example.com", "https://example.com/jane.jpg"),
            Developer("John Smith", "john@example.com", "https://example.com/john.jpg")
        )

        viewModel.developers.test {
            val firstEmission = awaitItem()
            assertThat(firstEmission).isEqualTo(expectedDevelopers)
            cancelAndIgnoreRemainingEvents()
        }
    }
}
