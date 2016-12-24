package com.davidmiguel.androidcameraopencv.camera;

import android.hardware.Camera;

import java.util.Comparator;

/**
 * Comparator for camera preview sizes.
 */
@SuppressWarnings("deprecation")
class PreviewSizeComparator implements Comparator<Camera.Size> {
    @Override
    public int compare(Camera.Size arg0, Camera.Size arg1) {
        // Check nulls
        if (arg0 == null && arg1 == null) {
            return 0;
        } else if (arg0 == null) {
            return 1;
        } else if (arg1 == null) {
            return -1;
        }
        // Check size
        if (arg0.width < arg1.width) {
            return -1;
        } else if (arg0.width > arg1.width) {
            return 1;
        } else {
            return 0;
        }
    }
}
