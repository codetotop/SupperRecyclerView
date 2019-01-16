package com.dungnb.gem.supperrecyclerview.base.activity;

import android.content.Context;

public interface BaseActivityContract {
  interface View<P extends Presenter> {
    P getPresenter();

    P initPresenter();

    int getLayoutId();
  }

  interface Interactor<P extends Presenter> {
    P getPresenter();

    Context getContext();
  }

  interface Presenter<V extends View, I extends Interactor> {
    V getView();

    void attachView(V view);

    I getInteractor();

    I initInteractor();

    Context getContext();
  }
}
