package com.example.amphibians.data



import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibiansApiService

/**
 * Repository retrieves amphibian data from underlying data source.
 */
interface AmphibiansRepo {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepo{
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
