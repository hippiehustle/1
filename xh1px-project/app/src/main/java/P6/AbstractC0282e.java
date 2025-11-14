package P6;

import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import f7.C0725e;
import m7.AbstractC1098d;

/* renamed from: P6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0282e extends F {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4559l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0019u a(InterfaceC0019u interfaceC0019u) {
        o6.j.e(interfaceC0019u, "functionDescriptor");
        C0725e name = ((AbstractC0054n) interfaceC0019u).getName();
        o6.j.d(name, "getName(...)");
        if (!b(name)) {
            return null;
        }
        return (InterfaceC0019u) AbstractC1098d.b(interfaceC0019u, C0281d.f4553e);
    }

    public static boolean b(C0725e c0725e) {
        o6.j.e(c0725e, "<this>");
        return F.f4538e.contains(c0725e);
    }
}
