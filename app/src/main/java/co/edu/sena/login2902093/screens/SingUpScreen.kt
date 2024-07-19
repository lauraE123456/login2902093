package co.edu.sena.login2902093.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.login2902093.R
import co.edu.sena.login2902093.components.NormalTextComponent


@Composable
fun SingUpScreen () {
    Surface (
        color = Color.White,
        modifier = Modifier.fillMaxSize()
        ) { 
            NormalTextComponent(value = stringResource(id = R.string.hello))
    }
}

@Preview
@Composable
fun OfSingUpScreen (){
    SingUpScreen()
}