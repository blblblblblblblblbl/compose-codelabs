package com.example.compose.rally

import androidx.compose.material.Text
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.compose.rally.ui.accounts.AccountsScreen
import com.example.compose.rally.ui.components.RallyTabRow
import org.junit.Rule
import org.junit.Test

class TopAppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myTest() {
        val allScreens = rallyTabRowScreens
        composeTestRule.setContent {
            RallyTabRow(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = Accounts
            )
        }
        composeTestRule
            .onNodeWithContentDescription(Accounts.route)
            .assertIsSelected()
    }
    @Test
    fun rallyTopAppBarTest_currentLabelExists() {
        val allScreens = rallyTabRowScreens
        composeTestRule.setContent {
            RallyTabRow(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = Accounts
            )
        }
        composeTestRule.onRoot().printToLog("currentLabelExists")
        composeTestRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")
        composeTestRule
            .onNodeWithText(Accounts.route.uppercase(), useUnmergedTree = true)
            .assertExists()
    }
}