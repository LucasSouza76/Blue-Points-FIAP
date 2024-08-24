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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.bluepoints.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddressMapScreen() {
   Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color.White,
   ) {
      Box(
         modifier = Modifier.padding(30.dp),
      ) {
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .size(400.dp)
               .align(Alignment.TopCenter)
         ) {
            Row(
               modifier = Modifier
                  .fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               Icon(
                  painter = painterResource(id = R.drawable.arrow_back_icon),
                  contentDescription = "location",
                  modifier = Modifier
                     .size(20.dp)
               )
               Text(
                  text = "Rua Frei Caneca, 42",
                  fontSize = 16.sp,
                  fontWeight = FontWeight.W600,
                  color = Color(0xFF0339A6)
               )
            }
            Image(
               painter = painterResource(id = R.drawable.map3_img),
               contentDescription = "img_address_map",
               alignment = Alignment.TopCenter,
               modifier = Modifier
                  .fillMaxWidth()
                  .height(300.dp)
                  .padding(top = 20.dp)
            )
            Row(
               modifier = Modifier
                  .fillMaxWidth()
                  .height(20.dp),
               horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               Icon(
                  painter = painterResource(id = R.drawable.location_icon),
                  contentDescription = "location",
                  modifier = Modifier
                     .size(20.dp)
               )
               Text(
                  text = "Rua Frei Caneca 42, São Paulo",
                  fontSize = 14.sp,
                  fontWeight = FontWeight.W600,
                  color = Color(0xFF0339A6),
               )
            }
         }
         Column(
            verticalArrangement = Arrangement.spacedBy(25.dp),
            modifier = Modifier
               .align(Alignment.CenterStart)
               .padding(top = 350.dp)
               .fillMaxWidth()
         ) {
            Column(
               verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
               Text(
                  text = "Descrição:",
                  fontSize = 14.sp,
                  fontWeight = FontWeight.W500,
               )
               Text(
                  text = "Dias e horários de funcionamento:\n" +
                          "- Segunda a sexta, das 9h às 19h \n" +
                          "- Telefone: 11 4002-8922 \n" +
                          "- Email: bluepoints@bluepoints.com",
                  fontSize = 12.sp,
                  fontWeight = FontWeight.W400
               )
            }
            Column(
               verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
               Text(
                  text = "Materiais coletados:",
                  fontSize = 14.sp,
                  fontWeight = FontWeight.W500
               )
               Text(
                  text =  "- Garrafas plásticas.\n" +
                          "- Embalagem de alimentos.\n" +
                          "- Sacolas plásticas: de supermercado, de compras, sacos de lixo.\n" +
                          "- Latas de bebidas, cerveja, etc.\n" +
                          "- Vasilhas metálicas para alimentos.\n" +
                          "- Panelas, talheres, etc.",
                  fontSize = 12.sp,
                  fontWeight = FontWeight.W400
               )
            }
         }
         Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
               .align(Alignment.BottomCenter)
         ) {
            ElevatedButton(
               onClick = { /*TODO*/ },
               modifier = Modifier
                  .height(44.dp)
                  .padding(horizontal = 20.dp)
                  .size(150.dp),
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul_primario))
            ) {
               Text(
                  text = "Voltar",
                  fontSize = 18.sp,
                  fontWeight = FontWeight.Medium,
               )
            }
         }
      }
   }

}


