package com.example.logcatbutton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.logcatbutton.ui.theme.*

const val TAG = "TesteAndroid"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LogcatButtonTheme {
                App()
            }
        }
    }
}

@Composable
private fun App() {
    var nome by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val image = painterResource(R.drawable.androidlogo)

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
            )

            Greeting("PAM 2")

            Row(
                Modifier.fillMaxWidth(),
                Arrangement.Center
            ) {
                TextField(
                    value = nome,
                    onValueChange = { novoValor -> nome = novoValor },
                    label = { Text("Digite seu nome:") }
                )
            }

            ActionButton(
                text = "Android",
                buttonColors = ErrorButtonColors(),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Log.e(TAG, "Olá $nome, você está aprendendo desenvolvimento Android")
            }

            ActionButton(
                text = "Kotlin",
                buttonColors = WarningButtonColors(),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Log.w(TAG, "Olá $nome, Kotlin é uma das linguagens mais usadas para apps Android")
            }

            ActionButton(
                text = "Jetpack Compose",
                buttonColors = DebugButtonColors(),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Log.d(TAG, "Olá $nome, Jetpack Compose facilita a criação de interfaces modernas")
            }

            ActionButton(
                text = "Programação",
                buttonColors = InfoButtonColors(),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Log.i(TAG, "Olá $nome, programar é resolver problemas usando lógica")
            }
        }
    }
}

@Composable
fun ActionButton(
    text: String,
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    modifier: Modifier = Modifier,
    block: () -> Unit
) {
    OutlinedButton(
        onClick = block,
        shape = RoundedCornerShape(6.dp),
        colors = buttonColors,
        border = BorderStroke(1.dp, Color.White),
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "ATIVIDADE DE $name - João Lucas Gomes",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Bold
        ),
        color = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    LogcatButtonTheme {
        App()
    }
}