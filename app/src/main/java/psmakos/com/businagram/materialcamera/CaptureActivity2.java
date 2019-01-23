package psmakos.com.businagram.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import psmakos.com.businagram.materialcamera.internal.BaseCaptureActivity;
import psmakos.com.businagram.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
