package com.bugfree.zhangruirui.luckyturntable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author zhangruirui
 * email：1138517609@qq.com
 * GitHub：https://github.com/selfconzrr
 * Blog：http://blog.csdn.net/u011489043
 * Date：03/26/19
 * <p>
 * Android 实现超简单九宫格抽奖 demo，可自行设置中奖概率、中奖奖品
 */
public class LuckyActivity extends AppCompatActivity {

  @BindView(R.id.lucky_view)
  LuckyTurntableView mLuckySpanView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lucky);
    ButterKnife.bind(this);

    mLuckySpanView.setLuckAnimationEndListener(new LuckyTurntableView.OnLuckAnimationEndListener() {
      @Override
      public void onLuckAnimationEnd(int pos, String msg) {
        Toast.makeText(LuckyActivity.this, "恭喜您抽中了： " + msg, Toast.LENGTH_SHORT).show();
      }
    });
  }
}
