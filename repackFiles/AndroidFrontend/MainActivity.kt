package org.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme { // define and route each to their own specific menus
                App()
                // TODO: {integrate App into Main}
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Commands){
                    composable<Commands> {
                        val args = it.toRoute<ConnectionT>()
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(onClick = {
                                navController.navigate(ConnectionT(
                                    name = "MainMenu",
                                    pathr = "MainMenu"
                                ))
                            }) {
                                Text(text = "Main Menu")
                            }
                        }
                    }
                    composable<ConnectionT> {
                        val args = it.toRoute<ConnectionT>()
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(onClick = {
                                navController.navigate(ConnectionT(
                                    name = "MainMenu",
                                    pathr = "MainMenu"
                                ))
                            }) {
                                Text(text = "Main Menu")
                            }
                        }
                    }
                    composable<OptionsMenu> {
                        val args = it.toRoute<ConnectionT>()
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(onClick = {
                                navController.navigate(ConnectionT(
                                    name = "MainMenu",
                                    pathr = "MainMenu"
                                ))
                            }) {
                                Text(text = "Main Menu")
                            }
                        }
                    }
                    composable<MainMenu> {
                        val args = it.toRoute<ConnectionT>()
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                        }
                    }

                }
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
