package com.example.kotlinstudy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinstudy.ui.theme.KotlinStudyTheme

class MainActivity : ComponentActivity() {
    val TAG : String = "kotlinTest"
    val variable : KotlinGrammar.Variable = KotlinGrammar.Variable()
    val typeConversion : KotlinGrammar.TypeConversion = KotlinGrammar.TypeConversion()
    val arrays : KotlinGrammar.Arrays = KotlinGrammar.Arrays()
    val functions : KotlinGrammar.Functions = KotlinGrammar.Functions()
    val conditional : KotlinGrammar.Conditional = KotlinGrammar.Conditional()
    val loop : KotlinGrammar.Loop = KotlinGrammar.Loop()
    val flowControl : KotlinGrammar.FlowControl = KotlinGrammar.FlowControl()
    lateinit var classPerson : KotlinGrammar.ClassPerson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        classPerson = KotlinGrammar.ClassPerson("Sangho", 971208)
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "var : " + variable.setVar(10))
        Log.i(TAG, "conversion : " + typeConversion.returnExplicit(10))
        arrays.printArrays()
        Log.i(TAG, "add : " + functions.add() + ", minus : " + functions.minus())
        conditionalTest()
        loopTest()
        flowControlTest()
        classPerson.introduce()
    }

    private fun conditionalTest() {
        conditional.setVariables(10, "I'm Test")
        conditional.positiveA()
        conditional.dataTypeB()
        conditional.exampleWhen()
    }

    private fun loopTest() {
        loop.functionWhile()
        loop.functionFor()
    }

    private fun flowControlTest() {
        flowControl.functionBreak()
        flowControl.functionContinue()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinStudyTheme {
        Greeting("Android")
    }
}