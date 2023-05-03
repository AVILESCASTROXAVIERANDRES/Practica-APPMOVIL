package data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi

class MarsPhotosRepository {

    interface MarsPhotosRepository {
        suspend fun getMarsPhotos(): List<MarsPhoto>
    }

    class DefaultMarsPhotosRepository : MarsPhotosRepository {
        override suspend fun getMarsPhotos(): List<MarsPhoto> {
            return MarsApi.retrofitService.getPhotos()
        }
    }
}