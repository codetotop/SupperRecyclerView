package com.dungnb.gem.supperrecyclerview.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivityView<P extends BaseActivityContract.Presenter>
        extends FragmentActivity
        implements BaseActivityContract.View<P> {

  P mPresenter;
  Unbinder mUnbinder;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    mPresenter = initPresenter();
    if (mPresenter != null) {
      mPresenter.attachView(this);
    }
    mUnbinder = ButterKnife.bind(this);
  }
}
