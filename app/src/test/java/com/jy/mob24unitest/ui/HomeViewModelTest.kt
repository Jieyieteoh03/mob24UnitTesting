package com.jy.mob24unitest.ui

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {

    val viewModel = HomeViewModel()
    @Before
    fun setup() {
        val testDispatcher = UnconfinedTestDispatcher()
        Dispatchers.setMain(testDispatcher)
    }
    @After
    fun reset() {
        Dispatchers.resetMain()
    }
    @Test
    fun test_coroutine() = runTest {
        assertEquals(viewModel.fetchData(), "Hello World")
    }

    @Test
    fun test_state_flew() = runTest {
        viewModel.loadMessage()
        assertEquals(viewModel.msg, "HelloStateFlow")
    }
}