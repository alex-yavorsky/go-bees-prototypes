package com.davidmiguel.backgroundsub.utils.backgroundProcessors;

import com.davidmiguel.backgroundsub.utils.VideoProcessor;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

/**
 * Implement simple subtraction background subtractor.
 */

public class SimpleSubtraction implements VideoProcessor {
    private Mat previous;
    private Mat difference;

    public SimpleSubtraction(int width, int height) {
        previous = new Mat(height, width, CvType.CV_8UC1, new Scalar(0));
        difference = new Mat(height, width, CvType.CV_8UC1, new Scalar(0));
    }

    @Override
    public Mat process(Mat inputFrame) {
        Core.absdiff(inputFrame, previous, difference);
        inputFrame.copyTo(previous);
        return difference;
    }
}
