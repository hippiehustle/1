package J0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: J0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0074h {
    public static <T, V> ObjectAnimator a(T t8, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
    }
}
