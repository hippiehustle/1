package p0;

import androidx.lifecycle.EnumC0503n;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13652a;

    static {
        int[] iArr = new int[EnumC0503n.values().length];
        try {
            iArr[EnumC0503n.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0503n.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0503n.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0503n.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13652a = iArr;
    }
}
