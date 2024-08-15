package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   CalculatorApp(
                       modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun CalculatorDisplay(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "0",
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            fontSize = 24.sp,
            textAlign = TextAlign.End
        )
        Spacer(modifier = Modifier)

    }

}


@Composable
fun CalculatorButton(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "C")}
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "()")}
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) {Text(text = "%")}
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) {Text(text = "÷")}

            }
        }

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray )) { Text(text = "7") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "8") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors (Color.Gray)){ Text(text = "9") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "X") }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "4") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "5") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "6") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "-") }

        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "1") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "2") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "3") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "+") }
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "+/-")}
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "0") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = ".") }
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) { Text(text = "=") }
        }

    }

@Composable
fun CalculatorApp(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(10.dp)) {
        CalculatorDisplay()

        Spacer(modifier = Modifier.height(24.dp))

        CalculatorButton()

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {
        CalculatorApp()
//
    }
}
//}