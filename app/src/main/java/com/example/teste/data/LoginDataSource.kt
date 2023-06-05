package com.example.teste.data

import com.example.teste.data.model.LoggedInUser
import java.io.IOException
import java.lang.Exception

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<String> {
        try {
            // TODO: handle loggedInUser authentication

            //val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            if(username == "admin" && password == "admin"){
                return Result.Success("Entrou")
            }else{
                return Result.Error(Exception("Usuario Não Existe"))
            }

        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}