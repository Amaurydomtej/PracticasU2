package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Tarjeta()
            }
        }
    }
}

@Composable
fun Tarjeta(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000FFF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            //modifier = Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            LogoAndroid()
            Spacer(modifier = Modifier.height(16.dp))
            Infodelusuario()

        }

        Column (
        ){
            Spacer(modifier = Modifier
                .weight(1f))
            Contacto()
            Spacer(modifier = Modifier.height(32.dp))
        }

    }
}

@Composable
fun LogoAndroid(){
    Image(
        painter = painterResource(id = R.drawable.android_24dp_e3e3e3),
        contentDescription = "Android Logo",
        modifier = Modifier
            .size(100.dp)
            .background(Color.DarkGray, RoundedCornerShape(8.dp))
    )
}

@Composable
fun Infodelusuario() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Mau Domínguez",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFe65208)
        )
    }
}

@Composable
fun Contacto(){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Bottom) {
        FilaDeContacto(R.drawable.smartphone_24dp_e3e3e3, "+11 (123) 444 555 666")
        FilaDeContacto(R.drawable.share_24dp_e3e3e3, "@AndroidDev")
        FilaDeContacto(R.drawable.email_24dp_e3e3e3, "mau.dom@android.com")
    }
}

@Composable
fun FilaDeContacto(iconId: Int, text: String) {
    Row(
        modifier = Modifier.padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 14.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    TarjetaPresentacionTheme {
        Tarjeta()
    }
}