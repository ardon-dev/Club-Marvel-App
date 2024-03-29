package github.vege19.clubmarvel.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import github.vege19.clubmarvel.api.ApiInterface
import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Named

class MainActivityViewModel @Inject constructor(): ViewModel() {

    private val things = MutableLiveData<List<String>>()
    fun getSomething(): LiveData<List<String>> {
        return things
    }

    fun generateThings() {
        val tmpThings: MutableList<String> = mutableListOf()
        tmpThings.add("A")
        tmpThings.add("B")
        tmpThings.add("C")
        things.postValue(tmpThings)
    }
}