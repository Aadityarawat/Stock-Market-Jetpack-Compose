package com.example.stockmarketapp.domain.repository

import com.example.stockmarketapp.domain.model.CompanyListing
import com.example.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        // whenever we want data from api ex. swipe to refresh
        fetchFromRemote : Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}