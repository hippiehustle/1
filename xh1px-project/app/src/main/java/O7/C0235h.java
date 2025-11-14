package O7;

import android.view.accessibility.AccessibilityNodeInfo;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: O7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235h implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4138d;

    public /* synthetic */ C0235h(Object obj) {
        this.f4138d = obj;
    }

    public static C0235h a(boolean z8, int i4, int i8, int i9, int i10) {
        return new C0235h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i8, i9, i10, false, z8));
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        Object n3 = interfaceC0234g.n(this.f4138d, interfaceC0617c);
        if (n3 == EnumC0646a.f10656d) {
            return n3;
        }
        return Z5.y.f7506a;
    }
}
