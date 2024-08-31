package br.com.fiap.bluepoints.screens

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
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import br.com.fiap.bluepoints.R
import br.com.fiap.bluepoints.ui.theme.poppinsMedium
import br.com.fiap.bluepoints.ui.theme.poppinsRegular
import br.com.fiap.bluepoints.ui.theme.poppinsSemibold
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

@Composable
fun AddressMapScreen(navController: NavController) {

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
            ) {
               IconButton(
                  onClick = { navController.navigate("initial_screen") },
                  modifier = Modifier
               ) {
                  Icon(
                     painter = painterResource(id = R.drawable.arrow_back_icon),
                     contentDescription = "location",
                     modifier = Modifier
                        .size(25.dp)
                  )
               }
               Text(
                  text = "Rua Frei Caneca, 42",
                  fontFamily = poppinsSemibold,
                  fontSize = 16.sp,
                  fontWeight = FontWeight.W600,
                  color = Color(0xFF0339A6),
                  modifier = Modifier
                     .align(Alignment.CenterVertically)
                     .padding(start = 50.dp)
               )
            }
            AndroidView(factory = { context ->
               MapView(context).apply {
                  onCreate(null)
                  getMapAsync { googleMap ->
                     val location = LatLng(-23.5542584, -46.6549876)
                     googleMap.addMarker(MarkerOptions().position(location).title("Rua Frei Caneca, 42"))
                     googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))
                  }
               }
            }, update = { mapView ->
               mapView.onResume()
            })
         }
         Column(
            verticalArrangement = Arrangement.spacedBy(15.dp),
            modifier = Modifier
               .align(Alignment.CenterStart)
               .padding(top = 320.dp)
               .fillMaxWidth()
         ) {
            Column(
               verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
               Text(
                  text = "Descrição:",
                  fontFamily = poppinsMedium,
                  fontSize = 14.sp,
                  fontWeight = FontWeight.W500,
                  style = TextStyle(textDecoration = TextDecoration.Underline)
               )
               Text(
                  text = "Dias e horários de funcionamento:\n" +
                          "- Segunda a sexta, das 9h às 19h \n" +
                          "- Telefone: 11 4002-8922 \n" +
                          "- Email: bluepoints@bluepoints.com",
                  fontSize = 12.sp,
                  fontWeight = FontWeight.W400,
                  fontFamily = poppinsRegular,
               )
            }
            Column(
               verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
               Text(
                  text = "Materiais coletados:",
                  fontFamily = poppinsMedium,
                  fontSize = 14.sp,
                  fontWeight = FontWeight.W500,
                  style = TextStyle(textDecoration = TextDecoration.Underline)
               )
               Text(
                  text =  "- Garrafas plásticas.\n" +
                          "- Embalagem de alimentos.\n" +
                          "- Sacolas plásticas: de supermercado, de compras, sacos de lixo.\n" +
                          "- Latas de bebidas, cerveja, etc.\n" +
                          "- Vasilhas metálicas para alimentos.\n" +
                          "- Panelas, talheres, etc.",
                  fontSize = 12.sp,
                  fontFamily = poppinsRegular,
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
               onClick = { navController.navigate("initial_screen") },
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


