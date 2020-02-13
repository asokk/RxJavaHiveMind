package com.example.rxjavahivemind.ui.cache.source;

import com.example.rxjavahivemind.ui.cache.model.Data;

import io.reactivex.Observable;


/**
 * Class to simulate Network DataSource
 */
public class NetworkDataSource {

    public Observable<Data> getData() {
        return Observable.create(emitter -> {
            Data data = new Data();
            data.source = "network";
            emitter.onNext(data);
            emitter.onComplete();
        });
    }

}
