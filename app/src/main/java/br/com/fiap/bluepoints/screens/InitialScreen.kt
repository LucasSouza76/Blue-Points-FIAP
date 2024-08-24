package br.com.fiap.bluepoints.screens

import br.com.fiap.bluepoints.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun InitialScreen(navController: NavController) {
   Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color.White
   ) {
      Box(
         modifier = Modifier.padding(30.dp),
         contentAlignment = Alignment.CenterStart
      ) {
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .align(Alignment.TopCenter)
         ) {
            Row(
               modifier = Modifier.padding(top = 40.dp),
            ) {
               Text(
                  text = "Blue",
                  fontSize = 45.sp,
                  fontWeight = FontWeight.Medium,
                  color = colorResource(id = R.color.azul_primario)
               )
               Text(
                  text = "Points",
                  fontSize = 45.sp,
                  fontWeight = FontWeight.Medium,
                  color = Color.Black
               )
            }
         }
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .fillMaxWidth()
               .height(400.dp)
         ) {
            Image(
               painter = painterResource(id = R.drawable.img_login),
               contentDescription ="img_login",
               modifier = Modifier.height(400.dp)
            )
         }
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(20.dp)
         ) {
            ElevatedButton(
               onClick = { navController.navigate("login_screen") },
               modifier = Modifier
                  .height(44.dp)
                  .fillMaxWidth(),
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul_primario))
            ) {
               Text(
                  text = "Login",
                  fontSize = 18.sp,
                  fontWeight = FontWeight.Medium,
               )
            }
            ElevatedButton(
               onClick = { /*TODO*/ },
               modifier = Modifier
                  .height(44.dp)
                  .fillMaxWidth(),
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul_secundario))
            ) {
               Text(
                  text = "Cadastre-se",
                  color = colorResource(id = R.color.azul_primario),
                  fontSize = 18.sp,
                  fontWeight = FontWeight.Medium,
               )
            }
         }
      }
   }

}


