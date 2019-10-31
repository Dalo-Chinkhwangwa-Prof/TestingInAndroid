package com.example.mytestapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MyApplicationTest {


    val typeName = "Dalo Tony Chinkhwangwa The 1st"
    val emptyString = ""

    @JvmField
    @Rule
    var activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testSetDynamicTest(){
        Espresso.onView(withId(R.id.tex_edittext)).perform(typeText(typeName))

        Espresso.closeSoftKeyboard()

        Espresso.onView(withId(R.id.button)).perform(click())

        Espresso.onView(withId(R.id.my_textview)).check(matches(withText(typeName)))
    }

    @Test
    fun testClearText(){
        Espresso.onView(withId(R.id.tex_edittext)).perform(typeText(typeName))

        Espresso.closeSoftKeyboard()

        Espresso.onView(withId(R.id.button)).perform(click())

        Espresso.onView(withId(R.id.my_textview)).check(matches(withText(typeName)))

        Espresso.onView(withId(R.id.tex_edittext)).perform(clearText())

        Espresso.closeSoftKeyboard()

        Espresso.onView(withId(R.id.button)).perform(click())

        Espresso.onView(withId(R.id.my_textview)).check(matches(withText(R.string.hello_world_text)))
    }




}