package c;

import android.content.res.Resources;
import n6.InterfaceC1163b;

/* renamed from: c.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545B extends o6.l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0545B f9303e = new o6.l(1);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        Resources resources = (Resources) obj;
        o6.j.e(resources, "resources");
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
