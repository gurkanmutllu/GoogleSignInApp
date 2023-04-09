package com.gurkanmutllu.googlesigninapp.presentation.sign_in

data class SignInState(
    val isSignInSuccesful : Boolean = false,
    val signInError : String? = null
)
