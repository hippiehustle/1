package Z0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f7301a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final j f7302b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f7303c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f7304d = new j(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j f7305e = new j(3);

    /* renamed from: f, reason: collision with root package name */
    public static final float f7306f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f8, float f9, float f10) {
        PathMeasure pathMeasure = (PathMeasure) f7302b.get();
        Path path2 = (Path) f7303c.get();
        Path path3 = (Path) f7304d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f8 != 1.0f || f9 != 0.0f) && length >= 1.0f && Math.abs((f9 - f8) - 1.0f) >= 0.01d) {
            float f11 = f8 * length;
            float f12 = f9 * length;
            float f13 = f10 * length;
            float min = Math.min(f11, f12) + f13;
            float max = Math.max(f11, f12) + f13;
            if (min >= length && max >= length) {
                min = g.d(min, length);
                max = g.d(max, length);
            }
            if (min < 0.0f) {
                min = g.d(min, length);
            }
            if (max < 0.0f) {
                max = g.d(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i4, int i8) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i8) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i8, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
