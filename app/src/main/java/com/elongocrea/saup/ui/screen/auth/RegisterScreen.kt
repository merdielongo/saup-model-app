package com.elongocrea.saup.ui.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.elongocrea.saup.ui.components.button.CustomButton
import org.koin.androidx.compose.koinViewModel
import com.elongocrea.saup.R
import com.elongocrea.saup.ui.components.button.ButtonIcon
import com.elongocrea.saup.ui.components.form.CustomDropdown
import com.elongocrea.saup.ui.components.form.CustomTextField
import com.elongocrea.saup.ui.components.image.RoundedCardImage
import com.elongocrea.saup.ui.components.image.RoundedImage
import com.elongocrea.saup.ui.theme.PrimaryColor
import com.elongocrea.saup.viewmodel.AuthViewModel

@Composable
fun RegisterScreen(
    navController: NavHostController,
    authViewModel: AuthViewModel = koinViewModel()
) {
    var currentStep by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            elevation = CardDefaults.cardElevation(),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .height(260.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .background(color = PrimaryColor)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier.padding(15.dp),
                ) {
                    Spacer(modifier = Modifier.height(50.dp))
                    Image(
                        painter = painterResource(id = R.drawable.saup_blanc),
                        contentDescription = null,
                        modifier = Modifier
                            .size(120.dp)
                    )
                    Text(
                        text = "Community",
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Register",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
        }

        Column(modifier = Modifier.padding(15.dp)) {
            Spacer(modifier = Modifier.height(40.dp))

            when (currentStep) {
                0 -> Step1()
                1 -> Step2()
            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (currentStep > 0) {
                    CustomButton(
                        modifier = Modifier.weight(1f),
                        label = "Previous",
                        onClick = { currentStep-- },
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                CustomButton(
                    modifier = Modifier.weight(1f),
                    label = if (currentStep < 1) "Next" else "Submit",
                    onClick = {
                        if (currentStep < 1) {
                            currentStep++
                        } else {
                            // Handle form submission
                        }
                    },
                )
            }
//            Spacer(modifier = Modifier.height(16.dp))
//            ButtonIcon(
//                modifier = Modifier.fillMaxWidth(),
//                label = "Continue with Google",
//                onClick = { }
//            )
        }
    }
}

@Composable
fun Step1() {
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var middlename by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = firstname,
        onValueChange = { firstname = it },
        label = "Firstname ds",
        placeholder = "Enter your firstname",
    )
    Spacer(modifier = Modifier.height(15.dp))
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = lastname,
        onValueChange = { lastname = it },
        label = "Lastname",
        placeholder = "Enter your lastname",
    )
    Spacer(modifier = Modifier.height(15.dp))
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = middlename,
        onValueChange = { middlename = it },
        label = "Middlename",
        placeholder = "Enter your middlename",
    )
    Spacer(modifier = Modifier.height(16.dp))
    CustomDropdown(
        modifier = Modifier.width(330.dp),
        items = listOf("Male", "Female"),
        selectedItem = gender,
        onItemSelected = { gender = it },
        label = "Gender",
        placeholder = "Select your gender"
    )
}

@Composable
fun Step2() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = email,
        onValueChange = { email = it },
        label = "Email",
        placeholder = "Enter your email",
    )
    Spacer(modifier = Modifier.height(16.dp))
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = { password = it },
        label = "Password",
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisible) painterResource(id = R.drawable.ic_visibility)
            else painterResource(id = R.drawable.ic_visibility_off)

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = image,
                    contentDescription = if (passwordVisible) "Hide password" else "Show password"
                )
            }
        }
    )
    Spacer(modifier = Modifier.height(16.dp))
    CustomTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = { password = it },
        label = "Confirm Password",
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisible) painterResource(id = R.drawable.ic_visibility)
            else painterResource(id = R.drawable.ic_visibility_off)

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = image,
                    contentDescription = if (passwordVisible) "Hide password" else "Show password"
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(navController = rememberNavController())
}
