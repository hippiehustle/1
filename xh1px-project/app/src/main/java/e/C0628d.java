package e;

import a.AbstractC0405a;
import android.os.Bundle;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import c.C0553g;
import g0.T;
import g0.Y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628d implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f10562h;

    public /* synthetic */ C0628d(Object obj, String str, Object obj2, Object obj3, int i4) {
        this.f10558d = i4;
        this.f10562h = obj;
        this.f10559e = str;
        this.f10560f = obj2;
        this.f10561g = obj3;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        Bundle bundle;
        switch (this.f10558d) {
            case 0:
                AbstractC0405a abstractC0405a = (AbstractC0405a) this.f10561g;
                InterfaceC0626b interfaceC0626b = (InterfaceC0626b) this.f10560f;
                C0553g c0553g = (C0553g) this.f10562h;
                boolean equals = EnumC0503n.ON_START.equals(enumC0503n);
                String str = this.f10559e;
                if (equals) {
                    HashMap hashMap = c0553g.f9323e;
                    Bundle bundle2 = c0553g.f9325g;
                    HashMap hashMap2 = c0553g.f9324f;
                    hashMap.put(str, new C0630f(abstractC0405a, interfaceC0626b));
                    if (hashMap2.containsKey(str)) {
                        Object obj = hashMap2.get(str);
                        hashMap2.remove(str);
                        interfaceC0626b.h(obj);
                    }
                    C0625a c0625a = (C0625a) bundle2.getParcelable(str);
                    if (c0625a != null) {
                        bundle2.remove(str);
                        interfaceC0626b.h(abstractC0405a.i0(c0625a.f10556d, c0625a.f10557e));
                        return;
                    }
                    return;
                }
                if (EnumC0503n.ON_STOP.equals(enumC0503n)) {
                    c0553g.f9323e.remove(str);
                    return;
                } else {
                    if (EnumC0503n.ON_DESTROY.equals(enumC0503n)) {
                        c0553g.f(str);
                        return;
                    }
                    return;
                }
            default:
                T t8 = (T) this.f10562h;
                Map map = t8.f10910m;
                EnumC0503n enumC0503n2 = EnumC0503n.ON_START;
                String str2 = this.f10559e;
                if (enumC0503n == enumC0503n2 && (bundle = (Bundle) map.get(str2)) != null) {
                    ((Y) this.f10560f).a(str2, bundle);
                    map.remove(str2);
                }
                if (enumC0503n == EnumC0503n.ON_DESTROY) {
                    ((C0512x) this.f10561g).f(this);
                    t8.f10911n.remove(str2);
                    return;
                }
                return;
        }
    }
}
