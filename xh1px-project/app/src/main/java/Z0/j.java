package Z0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.Random;

/* loaded from: classes.dex */
public final class j extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7300a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f7300a) {
            case 0:
                return new PathMeasure();
            case 1:
                return new Path();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new Path();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new float[4];
            default:
                return new Random();
        }
    }
}
