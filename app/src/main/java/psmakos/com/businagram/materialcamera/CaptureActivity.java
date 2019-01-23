package psmakos.com.businagram.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import psmakos.com.businagram.materialcamera.internal.BaseCaptureActivity;
import psmakos.com.businagram.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
