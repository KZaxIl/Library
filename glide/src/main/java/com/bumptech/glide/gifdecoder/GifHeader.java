package com.bumptech.glide.gifdecoder;

import android.support.annotation.ColorInt;

import java.util.ArrayList;
import java.util.List;

/**
 * A header object containing the number of frames in an animated GIF image as well as basic
 * metadata like width and height that can be used to decode each individual frame of the GIF. Can
 * be shared by one or more {@link com.bumptech.glide.gifdecoder.GifDecoder}s to play the same
 * animated GIF in multiple views.
 * <p>
 * GIF文件头信息，包括图片帧数、图片宽高等信息
 *
 * @see <a href="https://www.w3.org/Graphics/GIF/spec-gif89a.txt">GIF 89a Specification</a>
 */
public class GifHeader {

    @ColorInt
    int[] gct = null;
    @GifDecoder.GifDecodeStatus
    int status = GifDecoder.STATUS_OK;
    int frameCount = 0;

    GifFrame currentFrame;
    List<GifFrame> frames = new ArrayList<>();
    /**
     * Logical screen size: Full image width.
     */
    int width;
    /**
     * Logical screen size: Full image height.
     */
    int height;

    // 1 : global color table flag.
    boolean gctFlag;
    /**
     * Size of Global Color Table.
     * The value is already computed to be a regular number, this field doesn't store the exponent.
     */
    int gctSize;
    /**
     * Background color index into the Global/Local color table.
     */
    int bgIndex;
    /**
     * Pixel aspect ratio.
     * Factor used to compute an approximation of the aspect ratio of the pixel in the original image.
     */
    int pixelAspect;
    @ColorInt
    int bgColor;
    int loopCount;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNumFrames() {
        return frameCount;
    }

    /**
     * Global status code of GIF data parsing.
     */
    @GifDecoder.GifDecodeStatus
    public int getStatus() {
        return status;
    }
}
