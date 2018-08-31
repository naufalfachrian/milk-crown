package id.bungamungil.kitsune

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.bungamungil.kitsune.repository.NetworkRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NetworkRepository.fetchAnimeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    Log.d("success", response.get().first().titles?.english)
                }, { reason ->
                    Log.d("error", reason.localizedMessage)
                })
    }
}
