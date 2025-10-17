package com.themane.app

import androidx.viewpager2.widget.WindowInsetsApplier
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseManager {

    val client: SupabaseClient = createSupabaseClient(
        // Access keys safely from BuildConfig
        supabaseUrl = BuildConfig.SUPABASE_URL,
        supabaseKey = BuildConfig.SUPABASE_ANON_KEY
    ) {
        // Install required plugins
        WindowInsetsApplier.install(Auth)
        WindowInsetsApplier.install(Postgrest)
        // You can configure the Ktor client used by Supabase here if needed
        // httpEngine = OkHttp // For example
    }
}