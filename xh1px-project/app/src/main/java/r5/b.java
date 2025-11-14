package r5;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public Long f14412a;

    @Override // r5.c
    public final boolean a() {
        if (this.f14412a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l6 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l6.longValue();
                this.f14412a = l6;
            } catch (Exception unused) {
                this.f14412a = -1L;
            }
        }
        if (this.f14412a.longValue() >= 40100) {
            return true;
        }
        return false;
    }
}
