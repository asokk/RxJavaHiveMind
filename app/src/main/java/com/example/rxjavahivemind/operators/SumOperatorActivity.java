package com.example.rxjavahivemind.operators;

/*import rx.Observable;
import rx.Subscriber;
import rx.observables.MathObservable;

public class SumOperatorActivity extends AppCompatActivity {

    private static final String TAG = SumOperatorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_operator);

        Observable<Integer> sumObservable = Observable.just(1, 2, 3, 4, 5);
        MathObservable.sumInteger(sumObservable)
                .subscribe(new rx.Observer<Integer>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.e(TAG, "Sum of 1,2,3,4,5= " + integer);
                    }
                });

        Observable<Float> floatObservable = Observable.just(10.5f, 11.5f, 14.5f);
        MathObservable.sumFloat(floatObservable)
                .subscribe(new Subscriber<Float>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Float aFloat) {
                        Log.e(TAG, "Sum of 10.5f, 11.5f, 14.5f= " + aFloat);
                    }
                });

        Observable<Double> doubleObservable = Observable.just(13.5D, 45.3D, 33.6D);
        MathObservable.sumDouble(doubleObservable)
                .subscribe(new Subscriber<Double>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Double aDouble) {
                        Log.e(TAG, "Sum of 13.5D, 45.3D, 33.6D= " + aDouble);
                    }
                });
    }
}*/
