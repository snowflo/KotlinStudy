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
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "var : " + variable.setVar(10))
        Log.i(TAG, "val : " + variable.setVal(10))
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