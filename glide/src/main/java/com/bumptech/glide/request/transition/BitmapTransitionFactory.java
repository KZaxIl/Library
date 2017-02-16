package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

/**
 * A {@link TransitionFactory} for {@link Bitmap}s that uses a Drawable transition
 * factory to transition from an existing drawable already visible on the target to the new bitmap.
 * <p>
 * 继承{@link BitmapContainerTransitionFactory}的类
 *
 * @see BitmapContainerTransitionFactory
 */
public class BitmapTransitionFactory extends BitmapContainerTransitionFactory<Bitmap> {
    public BitmapTransitionFactory(@NonNull TransitionFactory<Drawable> realFactory) {
        super(realFactory);
    }

    @Override
    @NonNull
    protected Bitmap getBitmap(@NonNull Bitmap current) {
        return current;
    }
}
