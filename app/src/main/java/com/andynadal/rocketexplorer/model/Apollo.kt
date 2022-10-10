package com.andynadal.rocketexplorer.model

import com.apollographql.apollo3.ApolloClient

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://api.spacex.land/graphql/")
    .build()