package com.example.stockmarketapp.data.di

import com.example.stockmarketapp.data.csv.CSVParser
import com.example.stockmarketapp.data.csv.CompanyListingParser
import com.example.stockmarketapp.data.repository.StockRepositoryImpl
import com.example.stockmarketapp.domain.model.CompanyListing
import com.example.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}