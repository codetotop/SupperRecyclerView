package com.dungnb.gem.supperrecyclerview.screen;

import com.dungnb.gem.supperrecyclerview.base.activity.BaseActivityContract;

public interface MainContract {
  interface View extends BaseActivityContract.View<Presenter>{

  }

  interface Presenter extends BaseActivityContract.Presenter<View,Interactor>{

  }

  interface Interactor extends BaseActivityContract.Interactor<Presenter>{

  }
}
