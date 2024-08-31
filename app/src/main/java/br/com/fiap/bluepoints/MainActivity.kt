package br.com.fiap.bluepoints

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.bluepoints.screens.AddressMapScreen
import br.com.fiap.bluepoints.ui.theme.BluePointsTheme
import br.com.fiap.bluepoints.screens.InitialScreen
import br.com.fiap.bluepoints.screens.LoginScreen
import br.com.fiap.bluepoints.screens.RegisterScreen
import com.google.android.gms.maps.MapsInitializer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         MapsInitializer.initialize(this)
        enableEdgeToEdge()
        setContent {
            BluePointsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "initial_screen"
                    ) {
                        composable(route = "initial_screen") { InitialScreen(navController)}
                        composable(route = "login_screen") { LoginScreen(navController)}
                        composable(route = "register_screen") { RegisterScreen(navController)}
                        composable(route = "address_map") { AddressMapScreen(navController) }
                    }
                }
            }
        }
    }
}

