package br.com.fiap.bluepoints.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.bluepoints.R

@Composable
fun LoginScreen( navController: NavController ) {
   Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color.White,
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
            Image(
               painter = painterResource(id = R.drawable.login_img),
               contentDescription ="img_login2",
               modifier = Modifier.height(300.dp).padding(top = 30.dp)
            )
            Row(
               modifier = Modifier
                  .fillMaxWidth()
                  .padding(top = 40.dp),
               horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               Text(
                  text = "Entre com a sua conta",
                  fontSize = 20.sp,
                  fontWeight = FontWeight.Medium,
                  color = Color(0xFF0339A6)
               )
            }
         }
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(25.dp),
            modifier = Modifier
               .align(Alignment.Center)
               .padding(top = 200.dp)
         ) {
            TextField(
               value = "",
               onValueChange = { /*TODO*/ },
               label = { Text("Nome") },
               modifier = Modifier.fillMaxWidth(),
               colors = OutlinedTextFieldDefaults.colors( unfocusedContainerColor = Color.Transparent ),
            )
            TextField(
               value = "",
               onValueChange = { /*TODO*/ },
               label = { Text("Senha") },
               modifier = Modifier.fillMaxWidth(),
               colors = OutlinedTextFieldDefaults.colors( unfocusedContainerColor = Color.Transparent ),
               trailingIcon = {
                  Icon(
                     painter = painterResource(id = R.drawable.ic_eye),
                     contentDescription = "eye",
                     modifier = Modifier.size(24.dp)
                  )
               },
               visualTransformation = PasswordVisualTransformation(),

               )
            Row(
               horizontalArrangement = Arrangement.Center,
               modifier = Modifier
                  .fillMaxWidth()
            ) {
               Text(
                  text = "Esqueceu a sua senha? ",
                  fontSize = 16.sp,
                  fontWeight = FontWeight.Medium,
               )
               Text(
                  text = "Recuperar Senha",
                  fontSize = 16.sp,
                  fontWeight = FontWeight.Medium,
                  color = colorResource(id = R.color.azul_primario)
               )
            }
         }
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(20.dp)
         ) {
            ElevatedButton(
               onClick = { navController.navigate("address_map") },
               modifier = Modifier
                  .height(44.dp)
                  .padding(horizontal = 20.dp)
                  .fillMaxWidth(),
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul_primario))
            ) {
               Text(
                  text = "Login",
                  fontSize = 18.sp,
                  fontWeight = FontWeight.Medium,
               )
            }
         }
      }
   }

}


