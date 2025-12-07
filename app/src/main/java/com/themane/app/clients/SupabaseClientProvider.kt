package com.themane.app.clients

import com.themane.app.BuildConfig
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClientProvider {

    val client: SupabaseClient = createSupabaseClient(
        // Access keys safely from BuildConfig
        supabaseUrl = BuildConfig.SUPABASE_URL,
        supabaseKey = BuildConfig.SUPABASE_ANON_KEY
    ) {
        // Install required plugins
        install(Auth)
        install(Postgrest)

        // You can configure the Ktor client used by Supabase here if needed
        // httpEngine = OkHttp // For example
    }
}